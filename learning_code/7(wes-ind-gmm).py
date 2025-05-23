import librosa
import numpy as np
import matplotlib.pyplot as plt
from scipy.signal import find_peaks
from sklearn.mixture import GaussianMixture
from collections import defaultdict

# **Step 1: Load Audio (First 30 Seconds)**
audio_path = r"C:\Users\drivi\Downloads\kal.mp3"  # Replace with your song
y, sr = librosa.load(audio_path, sr=16000, duration=30)  # Trim to 30 seconds

# **Step 2: Autocorrelation-Based Pitch Detection**
def autocorrelation_pitch_detection(signal, sr, frame_length=1024, hop_length=256):
    pitches, times = [], []
    for i in range(0, len(signal) - frame_length, hop_length):
        frame = signal[i:i + frame_length]
        frame -= np.mean(frame)  # Remove DC offset
        frame *= np.hanning(len(frame))  # Apply Hanning window
        
        # Compute autocorrelation using FFT
        autocorr = np.correlate(frame, frame, mode='full')[len(frame) - 1:]
        autocorr /= np.max(autocorr)  # Normalize
        
        # Find peaks in the autocorrelation function
        peaks, _ = find_peaks(autocorr, height=0.5)
        if len(peaks) > 0:
            lag = peaks[0]  # First peak as the lag
            pitch = sr / lag  # Convert lag to frequency
            pitches.append(pitch)
        else:
            pitches.append(np.nan)  # Unvoiced frame
        
        times.append(i / sr)  # Time in seconds
    
    return np.array(pitches), np.array(times)

# Extract pitches and times
pitches, times = autocorrelation_pitch_detection(y, sr)

# **Step 3: Western Scale Notes Mapping**
western_notes = ['C', 'C#', 'D', 'D#', 'E', 'F', 'F#', 'G', 'G#', 'A', 'A#', 'B']

def hz_to_note_name(frequency):
    """Convert frequency (Hz) to octave-independent Western note name."""
    if np.isnan(frequency) or frequency <= 0:
        return None
    note_number = round(12 * np.log2(frequency / 16.35)) % 12  # 16.35 Hz = C0
    return western_notes[note_number]

mapped_notes = [hz_to_note_name(p) for p in pitches]

# **Step 4: Hindustani Swaras Mapping**
svara_ratios = {
    "S": 1, "R1": 16/15, "R2": 9/8, "R3": 6/5,
    "G1": 9/8, "G2": 6/5, "G3": 5/4,
    "M1": 4/3, "M2": 17/12,
    "P": 3/2,
    "D1": 8/5, "D2": 5/3, "D3": 9/5,
    "N1": 5/3, "N2": 9/5, "N3": 15/8,
    "S'": 2
}

# Determine Shruti (Most Stable Note)
filtered_pitches = pitches[~np.isnan(pitches)]
shruti_freq = np.median(filtered_pitches) if len(filtered_pitches) > 0 else 208

svara_frequencies = {s: shruti_freq * r for s, r in svara_ratios.items()}
svara_positions = {s: i for i, s in enumerate(svara_ratios.keys())}

def map_pitch_to_swara(frequency):
    """Map frequency to the closest Hindustani swara."""
    if np.isnan(frequency) or frequency <= 0:
        return None
    return min(svara_frequencies, key=lambda s: abs(svara_frequencies[s] - frequency))

mapped_swaras = [map_pitch_to_swara(p) for p in pitches]
mapped_positions = [svara_positions[s] if s else np.nan for s in mapped_swaras]

# **Step 5: Apply GMM for Clustering**
valid_pitches = filtered_pitches.reshape(-1, 1)

# Choose number of clusters (adjust based on context)
num_clusters = 12  # Can be changed for better grouping
gmm = GaussianMixture(n_components=num_clusters, random_state=42)
gmm.fit(valid_pitches)

# Assign each pitch to a cluster
cluster_labels = gmm.predict(valid_pitches)

# Replace NaN pitches with cluster mean
cluster_means = gmm.means_.flatten()
pitch_clusters = [cluster_means[label] for label in cluster_labels]

# Map clustered values back to Western Notes and Hindustani Swaras
clustered_notes = [hz_to_note_name(f) for f in pitch_clusters]
clustered_swaras = [map_pitch_to_swara(f) for f in pitch_clusters]

print("\n🎵 **Western Notes (Clustered):**")
for i in range(0, len(clustered_notes), 7):
    print(" ".join(clustered_notes[i:i+7]))

print("\n🎶 **Hindustani Swaras (Clustered):**")
for i in range(0, len(clustered_swaras), 7):
    print(" ".join(clustered_swaras[i:i+7]))
# **Step 6: Visualization**
plt.figure(figsize=(12, 8))

# Western Notes Mapping to MIDI Numbers
note_midi_values = defaultdict(int)
for i, note in enumerate(western_notes):
    note_midi_values[note] = librosa.note_to_midi(f"{note}4")  # Octave 4 as reference

# Western Notes Plot
plt.subplot(3, 1, 1)
plt.scatter(times, [note_midi_values[n] if n else np.nan for n in mapped_notes], label="Western Notes", color="blue", marker="o")
plt.xlabel("Time (s)")
plt.ylabel("Western Notes")
plt.title("Western Scale Notes vs Time")
plt.yticks(ticks=list(note_midi_values.values()), labels=western_notes)
plt.legend()

# Hindustani Swaras Plot
plt.subplot(3, 1, 2)
plt.scatter(times, mapped_positions, label="Mapped Swaras", color="red", marker="x")
plt.xlabel("Time (s)")
plt.ylabel("Svara Position")
plt.yticks(range(len(svara_ratios)), list(svara_ratios.keys()))
plt.title("Swaras vs Time")
plt.legend()

# GMM Clustered Notes Plot
plt.subplot(3, 1, 3)
plt.scatter(times[:len(cluster_labels)], cluster_labels, c=cluster_labels, cmap='viridis', label="Clustered Notes")
plt.xlabel("Time (s)")
plt.ylabel("Cluster ID")
plt.title("GMM Clustered Notes Over Time")
plt.colorbar(label="Cluster ID")
plt.legend()

plt.tight_layout()
plt.show()


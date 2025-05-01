import sounddevice as sd
import numpy as np
import threading
import time
from typing import Optional

class AudioRecorder:
    def __init__(self):
        self.is_recording: bool = False
        self.frames: list = []
        self.CHUNK: int = 1024
        self.CHANNELS: int = 1
        self.RATE: int = 44100
        self.record_thread: Optional[threading.Thread] = None

    def start_recording(self) -> None:
        if self.is_recording:
            return
            
        try:
            self.is_recording = True
            
            def callback(indata, frames, time, status):
                self.frames.append(indata.copy())
                if len(self.frames) > 10:
                    self.frames.pop(0)
            
            self.stream = sd.InputStream(
                channels=self.CHANNELS,
                samplerate=self.RATE,
                callback=callback,
                blocksize=self.CHUNK
            )
            self.stream.start()
            
        except Exception as e:
            print(f"Error starting recording: {e}")
            self.is_recording = False

    def stop_recording(self) -> None:
        try:
            self.is_recording = False
            if hasattr(self, 'stream'):
                self.stream.stop()
                self.stream.close()
        except Exception as e:
            print(f"Error stopping recording: {e}")

    def get_current_amplitude(self) -> float:
        try:
            if self.frames:
                return float(np.max(np.abs(self.frames[-1])))
            return 0.0
        except Exception as e:
            print(f"Error calculating amplitude: {e}")
            return 0.0
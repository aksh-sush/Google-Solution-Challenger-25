import json
from bs4 import BeautifulSoup

def extract_notes_from_html(letter):
    input_file = f"{letter}/raw_{letter}.html"
    output_file = f"{letter}/{letter}_notes.json"
    
    try:
        with open(input_file, "r", encoding="utf-8") as file:
            html = file.read()
        
        soup = BeautifulSoup(html, 'html.parser')
        notes = []

        for note in soup.find_all(class_="note"):
            name = note.get("data-name")
            value = note.get("data-value")
            octave = note.get("data-octave")
            frequency = note.get("data-frequency")
            
            if name and value and octave and frequency:
                notes.append({
                    "data-name": name,
                    "data-value": int(value),
                    "data-octave": int(octave),
                    "data-frequency": round(float(frequency), 2)
                })
        
        with open(output_file, "w", encoding="utf-8") as json_file:
            json.dump(notes, json_file, indent=4)
        
        print(f"JSON file saved as {output_file}")
    except FileNotFoundError:
        print(f"Error: File {input_file} not found.")
    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage
letter = "G#"
extract_notes_from_html(letter)

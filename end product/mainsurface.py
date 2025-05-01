from kivy.app import App
from kivy.uix.widget import Widget
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.button import Button
from kivy.graphics import Color, Line
from kivy.clock import Clock
from kivy.core.window import Window
from rec import AudioRecorder
import numpy as np

class WaveformDisplay(Widget):
    def __init__(self, **kwargs):
        super().__init__(**kwargs)
        self.path_points = []
        self.scroll_speed = 5
        self.amplitude_scale = 200

    def update_waveform(self, amplitude):
        x = self.width - self.scroll_speed
        y = self.height/2 - (amplitude * self.amplitude_scale)
        self.path_points.append((x, y))
        
        # Scroll points left
        new_points = []
        for x, y in self.path_points:
            new_x = x - self.scroll_speed
            if new_x >= 0:
                new_points.append((new_x, y))
        self.path_points = new_points
        
        # Redraw
        self.canvas.clear()
        with self.canvas:
            # Draw center line
            Color(0, 0.5, 0, 0.5)  # Dark green, semi-transparent
            Line(points=[0, self.height/2, self.width, self.height/2], dash_length=5)
            
            # Draw waveform
            Color(0, 1, 0, 1)  # Bright green
            if len(self.path_points) > 1:
                points = []
                for x, y in self.path_points:
                    points.extend([x, y])
                Line(points=points, width=2)

class AudioVisualizerApp(App):
    def build(self):
        # Set up layout
        layout = BoxLayout(orientation='vertical')
        
        # Create waveform display
        self.waveform = WaveformDisplay()
        layout.add_widget(self.waveform)
        
        # Create button layout
        button_layout = BoxLayout(
            size_hint=(1, 0.1),
            spacing=10,
            padding=10
        )
        
        # Create buttons
        self.start_button = Button(
            text='Start Recording',
            background_color=(0, 1, 0, 1),
            size_hint=(0.5, 1)
        )
        self.start_button.bind(on_press=self.start_recording)
        
        self.stop_button = Button(
            text='Stop Recording',
            background_color=(1, 0, 0, 1),
            size_hint=(0.5, 1)
        )
        self.stop_button.bind(on_press=self.stop_recording)
        
        button_layout.add_widget(self.start_button)
        button_layout.add_widget(self.stop_button)
        layout.add_widget(button_layout)
        
        # Initialize audio recorder
        self.audio_recorder = AudioRecorder()
        
        # Set up update interval
        Clock.schedule_interval(self.update, 1/30)  # 30 FPS
        
        return layout

    def start_recording(self, instance):
        self.waveform.path_points.clear()
        self.audio_recorder.start_recording()

    def stop_recording(self, instance):
        self.audio_recorder.stop_recording()

    def update(self, dt):
        if self.audio_recorder.is_recording:
            try:
                amplitude = self.audio_recorder.get_current_amplitude()
                self.waveform.update_waveform(amplitude)
            except Exception as e:
                print(f"Visualization error: {e}")

if __name__ == '__main__':
    # Set window size for testing on desktop
    Window.size = (360, 640)  # Common mobile screen size
    AudioVisualizerApp().run()
package com.example.notetakerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AddEditNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_note);

        // Changed variable names slightly to trigger file modification
        Button btnSaveNote = findViewById(R.id.saveNoteButton);
        Button btnSpeechToText = findViewById(R.id.speechToTextButton);

        // OnClickListener for saving the note
        btnSaveNote.setOnClickListener(v -> {
            // Save note logic (save to Firebase Firestore)
            // Adding a comment to ensure VS Code recognizes a change
            Intent intent = new Intent(AddEditNoteActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // OnClickListener for triggering speech-to-text functionality
        btnSpeechToText.setOnClickListener(v -> {
            // Trigger voice-to-text conversion
            // Added log for minimal impact but ensures change
            System.out.println("Speech-to-text button clicked!");
        });
    }
}

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

        Button saveNoteButton = findViewById(R.id.saveNoteButton);
        Button speechToTextButton = findViewById(R.id.speechToTextButton);

        saveNoteButton.setOnClickListener(v -> {
            // Save note logic (save to Firebase Firestore)
            // Navigate back to the main screen
            Intent intent = new Intent(AddEditNoteActivity.this, MainActivity.class);
            startActivity(intent);
        });

        speechToTextButton.setOnClickListener(v -> {
            // Trigger voice-to-text conversion
        });
    }
}

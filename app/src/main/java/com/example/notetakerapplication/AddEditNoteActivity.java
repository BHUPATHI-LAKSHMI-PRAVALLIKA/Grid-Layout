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
        Button btnSaveNote = findViewById(R.id.saveNoteButton);
        Button btnSpeechToText = findViewById(R.id.speechToTextButton);
        btnSaveNote.setOnClickListener(v -> { 
            Intent intent = new Intent(AddEditNoteActivity.this, MainActivity.class);
            startActivity(intent);
        });
        btnSpeechToText.setOnClickListener(v -> {
            System.out.println("Speech-to-text button clicked!");
            
        });

         protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_note);
    }
}

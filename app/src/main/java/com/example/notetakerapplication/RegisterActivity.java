package com.example.notetakerapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registrationlayout);

        Button registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(v -> {
            // Handle registration logic (Firebase Authentication, etc.)
            // After successful registration, navigate back to login screen
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}

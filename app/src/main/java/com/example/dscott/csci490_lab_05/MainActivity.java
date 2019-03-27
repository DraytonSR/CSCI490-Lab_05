package com.example.dscott.csci490_lab_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button saveButton;
    EditText name;
    EditText pass;
    EditText email;

    EditText savedName;
    EditText savedPass;
    EditText savedEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton = findViewById(R.id.buttonSave);
        name = findViewById(R.id.editTextName);
        pass = findViewById(R.id.editTextPass);
        email = findViewById(R.id.editTextEmail);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savedName = name;
                savedPass = pass;
                savedEmail = email;

            }
        });
    }


}

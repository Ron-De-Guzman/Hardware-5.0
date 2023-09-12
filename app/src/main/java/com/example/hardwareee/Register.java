package com.example.hardwareee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    EditText signupFname, signupMname, signupLname, signupAge, signupBirthdate, signupEmail, signupPassword, signupConfirmPassword;
    Button signupRegister;
    TextView textViewSignIN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signupFname = findViewById(R.id.etFirstName);
        signupMname = findViewById(R.id.etMiddleName);
        signupLname = findViewById(R.id.etLastName);
        signupAge = findViewById(R.id.etAge);
        signupBirthdate = findViewById(R.id.etBirthDate);
        signupEmail = findViewById(R.id.etEmailSignUp);
        signupPassword= findViewById(R.id.etPasswordSignUp);
        signupConfirmPassword = findViewById(R.id.etConfirmPassword);
        signupRegister = findViewById(R.id.buttonRegister);
        textViewSignIN = findViewById(R.id.tvSignIn);

        signupRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, businessDetails.class));
            }
        });
        textViewSignIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this, Login.class));
            }
        });

    }
}
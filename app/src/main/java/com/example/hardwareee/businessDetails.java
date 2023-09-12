package com.example.hardwareee;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class businessDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_details);
        getSupportActionBar().setTitle("Business Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
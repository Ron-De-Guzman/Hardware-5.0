package com.example.hardwareee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class businessDescribe extends AppCompatActivity {
    Button describeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_describe);
        getSupportActionBar().setTitle("Business Details");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        describeButton = findViewById(R.id.btnNext);

        describeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(businessDescribe.this, businessLogoUplaod.class));
            }
        });
    }
}
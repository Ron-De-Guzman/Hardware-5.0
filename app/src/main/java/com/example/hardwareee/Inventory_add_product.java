package com.example.hardwareee;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

public class Inventory_add_product extends AppCompatActivity {

    String[] items = {"Power Tools", "Lightning", "Plumbing", "Electrical", "Hand Tools"};

    AutoCompleteTextView autoCompleteTxt;

    ArrayAdapter<String> adapterItems;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory_add_product);

        autoCompleteTxt = findViewById(R.id.autoComplete_text);

        if (autoCompleteTxt != null) {
            adapterItems = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_dropdown_item_1line, items);
            autoCompleteTxt.setAdapter(adapterItems);


            autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String item = (String) adapterView.getItemAtPosition(i).toString();

                    Toast.makeText(getApplicationContext(), "Item: "+item,Toast.LENGTH_SHORT).show();



                }
            });
        }


    }
}
package com.example.hardwareee;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class searchAndBottomNavigation extends AppCompatActivity {

    EditText searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        searchView = findViewById(R.id.etsearchView);

        searchView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int i, KeyEvent KeyEvent) {

                if(i == EditorInfo.IME_ACTION_SEARCH
                    || i == EditorInfo.IME_ACTION_DONE
                    || KeyEvent.getAction() == KeyEvent.ACTION_DOWN
                    || KeyEvent.getAction() == KeyEvent.KEYCODE_ENTER){
            GoToSearchView();
                }
                return false;
            }
        });
    }

    private void GoToSearchView() {

        //Your Query
    }
}
package com.example.hardwareee;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImagePicker extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4,
            btn5, btn6, btn7, btn8;
    ImageView imageView1, imageView2, imageView3, imageView4,
            imageView5, imageView6, imageView7, imageView8;
    int SELECT_IMAGE_CODE1 = 1, SELECT_IMAGE_CODE2 = 2, SELECT_IMAGE_CODE3 = 3, SELECT_IMAGE_CODE4 = 4,
            SELECT_IMAGE_CODE5 = 5, SELECT_IMAGE_CODE6 = 6, SELECT_IMAGE_CODE7 = 7, SELECT_IMAGE_CODE8 = 8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_picker);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        imageView1 = findViewById(R.id.pickedImage1);
        imageView2 = findViewById(R.id.pickedImage2);
        imageView3 = findViewById(R.id.pickedImage3);
        imageView4 = findViewById(R.id.pickedImage4);
        imageView5 = findViewById(R.id.pickedImage5);
        imageView6 = findViewById(R.id.pickedImage6);
        imageView7 = findViewById(R.id.pickedImage7);
        imageView8 = findViewById(R.id.pickedImage8);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Title"),SELECT_IMAGE_CODE1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Title"),SELECT_IMAGE_CODE2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Title"),SELECT_IMAGE_CODE3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Title"),SELECT_IMAGE_CODE4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Title"),SELECT_IMAGE_CODE5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Title"),SELECT_IMAGE_CODE6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Title"),SELECT_IMAGE_CODE7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Title"),SELECT_IMAGE_CODE8);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1){
            Uri uri = data.getData();
            imageView1.setImageURI(uri);
            btn1.setText("Done");
        }
        if (requestCode == 2){
            Uri uri = data.getData();
            imageView2.setImageURI(uri);
            btn2.setText("Done");
        }
        if (requestCode == 3){
            Uri uri = data.getData();
            imageView3.setImageURI(uri);
            btn3.setText("Done");
        }
        if (requestCode == 4){
            Uri uri = data.getData();
            imageView4.setImageURI(uri);
            btn4.setText("Done");
        }

        if (requestCode == 5){
            Uri uri = data.getData();
            imageView5.setImageURI(uri);
            btn1.setText("Done");
        }
        if (requestCode == 6){
            Uri uri = data.getData();
            imageView6.setImageURI(uri);
            btn2.setText("Done");
        }
        if (requestCode == 7){
            Uri uri = data.getData();
            imageView7.setImageURI(uri);
            btn3.setText("Done");
        }
        if (requestCode == 8){
            Uri uri = data.getData();
            imageView8.setImageURI(uri);
            btn4.setText("Done");
        }
    }
}
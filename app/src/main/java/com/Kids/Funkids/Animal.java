package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Animal extends AppCompatActivity {
    ImageView img;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        img=findViewById(R.id.animalShow);
        name=findViewById(R.id.animalName);

        Intent intent=getIntent();
//      img.setImageResource(R.drawable.tiger);
        name.setText(intent.getStringExtra("animalName"));
    }
}
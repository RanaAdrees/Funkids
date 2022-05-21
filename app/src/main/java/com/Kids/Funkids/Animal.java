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
//        name.setText();
        String animalName=intent.getStringExtra("animalName");

        switch (animalName){
            case "tiger":
                img.setImageResource(R.drawable.tiger);
                name.setText("Tiger");
                break;
            case "elephant":
                img.setImageResource(R.drawable.elephant);
                name.setText("Elephant");
                break;
            case "cat":
                img.setImageResource(R.drawable.cat);
                name.setText("Cat");
                break;
            case "crocodile":
                img.setImageResource(R.drawable.crocodile);
                name.setText("Crocodile");
                break;
            case "deer":
                img.setImageResource(R.drawable.deer);
                name.setText("Deer");
                break;
            case "dog":
                img.setImageResource(R.drawable.dog);
                name.setText("Dog");
                break;
            case "donkey":
                img.setImageResource(R.drawable.donkey);
                name.setText("Donkey");
                break;
            case "fox":
                img.setImageResource(R.drawable.fox);
                name.setText("Fox");
                break;
            case "giraffe":
                img.setImageResource(R.drawable.giraffe);
                name.setText("Giraffe");
                break;
            case "horse":
                img.setImageResource(R.drawable.horse);
                name.setText("Horse");
                break;
            case "lion":
                img.setImageResource(R.drawable.lion);
                name.setText("Lion");
                break;
            case "monkey":
                img.setImageResource(R.drawable.monkey);
                name.setText("Monkey");
                break;
            case "ostrich":
                img.setImageResource(R.drawable.ostrich);
                name.setText("Ostrich");
                break;
            case "panda":
                img.setImageResource(R.drawable.panda);
                name.setText("Panda");
                break;
            case "rabbit":
                img.setImageResource(R.drawable.rabbit);
                name.setText("Rabbit");
                break;
            case "rhino":
                img.setImageResource(R.drawable.rhino);
                name.setText("Rhino");
                break;
            case "snake":
                img.setImageResource(R.drawable.snake);
                name.setText("Snake");
                break;
            case "tortoise":
                img.setImageResource(R.drawable.tortoise);
                name.setText("Tortoise");
                break;
            default:
                break;
        }
    }
}
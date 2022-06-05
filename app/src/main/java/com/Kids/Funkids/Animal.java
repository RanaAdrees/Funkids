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
            case "Tiger":
                img.setImageResource(R.drawable.tiger);
                name.setText("Tiger");
                break;
            case "Elephant":
                img.setImageResource(R.drawable.elephant);
                name.setText("Elephant");
                break;
            case "Cat":
                img.setImageResource(R.drawable.cat);
                name.setText("Cat");
                break;
            case "Crocodile":
                img.setImageResource(R.drawable.crocodile);
                name.setText("Crocodile");
                break;
            case "Deer":
                img.setImageResource(R.drawable.deer);
                name.setText("Deer");
                break;
            case "Dog":
                img.setImageResource(R.drawable.dog);
                name.setText("Dog");
                break;
            case "Donkey":
                img.setImageResource(R.drawable.donkey);
                name.setText("Donkey");
                break;
            case "Fox":
                img.setImageResource(R.drawable.fox);
                name.setText("Fox");
                break;
            case "Giraffe":
                img.setImageResource(R.drawable.giraffe);
                name.setText("Giraffe");
                break;
            case "Horse":
                img.setImageResource(R.drawable.horse);
                name.setText("Horse");
                break;
            case "Lion":
                img.setImageResource(R.drawable.lion);
                name.setText("Lion");
                break;
            case "Monkey":
                img.setImageResource(R.drawable.monkey);
                name.setText("Monkey");
                break;
            case "Ostrich":
                img.setImageResource(R.drawable.ostrich);
                name.setText("Ostrich");
                break;
            case "Panda":
                img.setImageResource(R.drawable.panda);
                name.setText("Panda");
                break;
            case "Rabbit":
                img.setImageResource(R.drawable.rabbit);
                name.setText("Rabbit");
                break;
            case "Rhino":
                img.setImageResource(R.drawable.rhino);
                name.setText("Rhino");
                break;
            case "Snake":
                img.setImageResource(R.drawable.snake);
                name.setText("Snake");
                break;
            case "Tortoise":
                img.setImageResource(R.drawable.tortoise);
                name.setText("Tortoise");
                break;
            default:
                break;
        }
    }
}
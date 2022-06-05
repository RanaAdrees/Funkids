package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListOfAnimals extends AppCompatActivity {

    String animalList[]={"Cat","Crocodile","Dog","Deer","Donkey","Elephant",
                         "Fox","Giraffe","Horse","Lion","Monkey","Ostrich",
                         "Panda","Rabbit","Rhino","Snake","Tiger","tortoise"};

    int animalImages[]= {R.drawable.cat, R.drawable.crocodile, R.drawable.dog, R.drawable.deer,
            R.drawable.donkey, R.drawable.elephant, R.drawable.fox, R.drawable.giraffe,
            R.drawable.horse,R.drawable.lion,R.drawable.monkey,R.drawable.ostrich,R.drawable.panda,
            R.drawable.rabbit,R.drawable.rhino,R.drawable.snake,R.drawable.tiger,R.drawable.tortoise};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);
    }


//    public void animalFunc(View view)
//    {
//        int id=view.getId();
//        String name=view.getResources().getResourceEntryName(id);
//        Intent intent=new Intent(this,Animal.class);
//        intent.putExtra("animalName",name);
//        startActivity(intent);
//
//    }


}
package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ListOfAnimals extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);
    }


    public void animalFunc(View view)
    {
        int id=view.getId();
        String name=view.getResources().getResourceEntryName(id);
        Intent intent=new Intent(this,Animal.class);
        intent.putExtra("animalName",name);
        startActivity(intent);

    }


}
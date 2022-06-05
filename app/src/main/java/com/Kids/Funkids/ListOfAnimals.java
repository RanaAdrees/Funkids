package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListOfAnimals extends AppCompatActivity {

    String animalList[]={"Cat","Crocodile","Dog","Deer","Donkey","Elephant",
                         "Fox","Giraffe","Horse","Lion","Monkey","Ostrich",
                         "Panda","Rabbit","Rhino","Snake","Tiger","Tortoise"};

    int animalImages[]= { R.drawable.cat,R.drawable.crocodile, R.drawable.dog, R.drawable.deer,
                        R.drawable.donkey, R.drawable.elephant, R.drawable.fox, R.drawable.giraffe,
                        R.drawable.horse,R.drawable.lion,R.drawable.monkey,R.drawable.ostrich,
                       R.drawable.panda,R.drawable.rabbit,R.drawable.rhino,R.drawable.snake,
                       R.drawable.tiger,R.drawable.tortoise};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);

        listView=findViewById(R.id.CustomListView);

        CustomArrayAdapter customArrayAdapter=new CustomArrayAdapter(this,animalList,animalImages);

        listView.setAdapter(customArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent=new Intent(ListOfAnimals.this,Animal.class);
                intent.putExtra("animalName",animalList[i]);
                startActivity(intent);
            }
        });
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
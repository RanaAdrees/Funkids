package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListOfAnimals extends AppCompatActivity {

    String animalList[]={"Crocodile","Dog","Deer","Donkey","Elephant",
                         "Fox","Giraffe","Horse","Lion","Monkey","Ostrich",
                         "Panda","Rabbit","Rhino","Snake","Tiger"};

    int animalImages[]= { R.drawable.crocodile, R.drawable.dog, R.drawable.deer,
                        R.drawable.donkey, R.drawable.elephant, R.drawable.fox, R.drawable.giraffe,
                        R.drawable.horse,R.drawable.lion,R.drawable.monkey,R.drawable.ostrich,
                       R.drawable.panda,R.drawable.rabbit,R.drawable.rhino,R.drawable.snake,
                       R.drawable.tiger};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_animals);

        listView=findViewById(R.id.CustomListView);

        CustomArrayAdapter customArrayAdapter=new CustomArrayAdapter(this,animalList,animalImages);

        listView.setAdapter(customArrayAdapter);
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
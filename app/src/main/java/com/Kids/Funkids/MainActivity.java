package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button startBtn;
    Button quizBtn;
    Button repoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startBtn=findViewById(R.id.start);
        startBtn.setOnClickListener(this);

        quizBtn=findViewById(R.id.quiz);
        quizBtn.setOnClickListener(this);

        repoBtn=findViewById(R.id.repo);
        repoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){

        Intent intent;
        Uri webPage=Uri.parse("https://github.com/RanaAdrees");
        switch (view.getId()){
            case R.id.start:
                intent=new Intent(this,ListOfAnimals.class);
                startActivity(intent);
                break;
            case R.id.quiz:
                intent=new Intent(this,Quiz.class);
                startActivity(intent);
                break;
            case R.id.repo:
                intent=new Intent(Intent.ACTION_VIEW,webPage);
                startActivity(intent);
                break;


        }


    }
}
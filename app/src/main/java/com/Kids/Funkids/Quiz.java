package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Quiz extends AppCompatActivity implements View.OnClickListener {

    Button option1, option2, option3, option4;
    ImageView img;
    int result = 0, counter = 0;
    ArrayList<Integer> numberList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        option1 = findViewById(R.id.correct);
        option1.setOnClickListener(this);

        option2 = findViewById(R.id.option2);
        option2.setOnClickListener(this);

        option3 = findViewById(R.id.option3);
        option3.setOnClickListener(this);

        option4 = findViewById(R.id.option4);
        option4.setOnClickListener(this);

        img=findViewById(R.id.imageView);


        numberList = uniqueRandomNumbers();
    }

    public ArrayList<Integer> uniqueRandomNumbers() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 18; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }

    @Override

    public void onClick(View view) {
        counter += 1;
        if (view.getId() == R.id.correct) {
            result += 10;
            Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show();
        }


        int number = numberList.get(counter);


        Toast.makeText(this, "Num:" + number, Toast.LENGTH_SHORT).show();

        // random number generate
        switch (number) {
            case 1:
                img.setImageResource(R.drawable.tiger);

                break;
            case 2:
                img.setImageResource(R.drawable.elephant);

                break;
            case 3:
                img.setImageResource(R.drawable.cat);

                break;
            case 4:
                img.setImageResource(R.drawable.crocodile);

                break;
            case 5:
                img.setImageResource(R.drawable.deer);

                break;
            case 6:
                img.setImageResource(R.drawable.dog);

                break;
            case 7:
                img.setImageResource(R.drawable.donkey);

                break;
            case 8:
                img.setImageResource(R.drawable.fox);

                break;
            case 9:
                img.setImageResource(R.drawable.giraffe);

                break;
            case 10:
                img.setImageResource(R.drawable.horse);

                break;
            case 11:
                img.setImageResource(R.drawable.lion);

                break;
            case 12:
                img.setImageResource(R.drawable.monkey);

                break;
            case 13:
                img.setImageResource(R.drawable.ostrich);

                break;
            case 14:
                img.setImageResource(R.drawable.panda);

                break;
            case 15:
                img.setImageResource(R.drawable.rabbit);

                break;
            case 16:
                img.setImageResource(R.drawable.rhino);

                break;
            case 17:
                img.setImageResource(R.drawable.snake);

                break;
            case 18:
                img.setImageResource(R.drawable.tortoise);

                break;
            default:
                break;
        }

    }


}
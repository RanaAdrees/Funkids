package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Quiz extends AppCompatActivity implements View.OnClickListener {

    Button option1, option2, option3, option4;
    ImageView img;
    TextView qNumber;
    int result = 0, counter = 0,num=0;

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

        qNumber=findViewById(R.id.qNumber);


        numberList = uniqueRandomNumbers();
    }

    public ArrayList<Integer> uniqueRandomNumbers() {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 18; i++) {
            if(i!=3)
            {
                list.add(i);
            }

        }
        Collections.shuffle(list);
        return list;
    }

    @Override

    public void onClick(View view) {
        counter += 1;
        if (counter < 10) {
            num=counter+1;
            qNumber.setText("Question "+num);
            if (view.getId() == R.id.correct) {
                result += 10;
                Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "wrong", Toast.LENGTH_SHORT).show();
            }


            int number = numberList.get(counter);



            // random number generate
            switch (number) {
                case 1:
                    img.setImageResource(R.drawable.tiger);
                    option1.setText("Giraffe");
                    option1.setId(R.id.option2);

                    option2.setText("Tiger");
                    option2.setId(R.id.correct);

                    option3.setText("Deer");
                    option3.setId(R.id.option3);

                    option4.setText("Lion");
                    option4.setId(R.id.option4);

                    break;
                case 2:
                    img.setImageResource(R.drawable.elephant);
                    option1.setText("elephant");
                    option1.setId(R.id.correct);

                    option2.setText("Fox");
                    option2.setId(R.id.option2);

                    option3.setText("Horse");
                    option3.setId(R.id.option3);

                    option4.setText("Monkey");
                    option4.setId(R.id.option4);

                    break;
                case 3:
                    img.setImageResource(R.drawable.cat);
                    option1.setText("Lion");
                    option1.setId(R.id.option2);

                    option2.setText("Tiger");
                    option2.setId(R.id.option3);

                    option3.setText("Cat");
                    option3.setId(R.id.correct);

                    option4.setText("Donkey");
                    option4.setId(R.id.option4);

                    break;
                case 4:
                    img.setImageResource(R.drawable.crocodile);
                    option1.setText("Crocodile");
                    option1.setId(R.id.correct);

                    option2.setText("Cat");
                    option2.setId(R.id.option3);

                    option3.setText("Dog");
                    option3.setId(R.id.option2);

                    option4.setText("Ostrich");
                    option4.setId(R.id.option4);

                    break;
                case 5:
                    img.setImageResource(R.drawable.deer);
                    option1.setText("Giraffe");
                    option1.setId(R.id.option2);

                    option2.setText("Deer");
                    option2.setId(R.id.correct);

                    option3.setText("Panda");
                    option3.setId(R.id.option3);

                    option4.setText("Rabbit");
                    option4.setId(R.id.option4);

                    break;
                case 6:
                    img.setImageResource(R.drawable.dog);
                    option1.setText("Dog");
                    option1.setId(R.id.correct);

                    option2.setText("Tiger");
                    option2.setId(R.id.option3);

                    option3.setText("Snake");
                    option3.setId(R.id.option2);

                    option4.setText("Monkey");
                    option4.setId(R.id.option4);

                    break;
                case 7:
                    img.setImageResource(R.drawable.donkey);
                    option1.setText("Elephant");
                    option1.setId(R.id.option2);

                    option2.setText("Lion");
                    option2.setId(R.id.option3);

                    option3.setText("Dog");
                    option3.setId(R.id.option4);

                    option4.setText("Donkey");
                    option4.setId(R.id.correct);

                    break;
                case 8:
                    img.setImageResource(R.drawable.fox);
                    option1.setText("Snake");
                    option1.setId(R.id.option2);

                    option2.setText("Tortoise");
                    option2.setId(R.id.option3);

                    option3.setText("Fox");
                    option3.setId(R.id.correct);

                    option4.setText("Cat");
                    option4.setId(R.id.option4);

                    break;
                case 9:
                    img.setImageResource(R.drawable.giraffe);
                    option1.setText("Monkey");
                    option1.setId(R.id.option2);

                    option2.setText("Giraffe");
                    option2.setId(R.id.correct);

                    option3.setText("Ostrich");
                    option3.setId(R.id.option3);

                    option4.setText("Deer");
                    option4.setId(R.id.option4);

                    break;
                case 10:
                    img.setImageResource(R.drawable.horse);
                    option1.setText("Lion");
                    option1.setId(R.id.option2);

                    option2.setText("Tiger");
                    option2.setId(R.id.option3);

                    option3.setText("Rabbit");
                    option3.setId(R.id.option4);

                    option4.setText("Horse");
                    option4.setId(R.id.correct);

                    break;
                case 11:
                    img.setImageResource(R.drawable.lion);
                    option1.setText("Lion");
                    option1.setId(R.id.correct);

                    option2.setText("Giraffe");
                    option2.setId(R.id.option3);

                    option3.setText("Panda");
                    option3.setId(R.id.option2);

                    option4.setText("Snake");
                    option4.setId(R.id.option4);

                    break;
                case 12:
                    img.setImageResource(R.drawable.monkey);
                    option1.setText("Rhino");
                    option1.setId(R.id.option2);

                    option2.setText("Horse");
                    option2.setId(R.id.option3);

                    option3.setText("Monkey");
                    option3.setId(R.id.correct);

                    option4.setText("Donkey");
                    option4.setId(R.id.option4);

                    break;
                case 13:
                    img.setImageResource(R.drawable.ostrich);
                    option1.setText("Lion");
                    option1.setId(R.id.option2);

                    option2.setText("Rhino");
                    option2.setId(R.id.option3);

                    option3.setText("Ostrich");
                    option3.setId(R.id.correct);

                    option4.setText("Panda");
                    option4.setId(R.id.option4);

                    break;
                case 14:
                    img.setImageResource(R.drawable.panda);
                    option1.setText("Rabbit");
                    option1.setId(R.id.option2);

                    option2.setText("Panda");
                    option2.setId(R.id.correct);

                    option3.setText("Fox");
                    option3.setId(R.id.option3);

                    option4.setText("Monkey");
                    option4.setId(R.id.option4);

                    break;
                case 15:
                    img.setImageResource(R.drawable.rabbit);
                    option1.setText("Ostrich");
                    option1.setId(R.id.option2);

                    option2.setText("Rabbit");
                    option2.setId(R.id.correct);

                    option3.setText("Rhino");
                    option3.setId(R.id.option3);

                    option4.setText("Tortoise");
                    option4.setId(R.id.option4);

                    break;
                case 16:
                    img.setImageResource(R.drawable.rhino);
                    option1.setText("Deer");
                    option1.setId(R.id.option2);

                    option2.setText("Panda");
                    option2.setId(R.id.option3);

                    option3.setText("Lion");
                    option3.setId(R.id.option4);

                    option4.setText("Rhino");
                    option4.setId(R.id.correct);

                    break;
                case 17:
                    img.setImageResource(R.drawable.snake);
                    option1.setText("Tiger");
                    option1.setId(R.id.option2);

                    option2.setText("Snake");
                    option2.setId(R.id.correct);

                    option3.setText("Crocodile");
                    option3.setId(R.id.option3);

                    option4.setText("cat");
                    option4.setId(R.id.option4);

                    break;
                case 18:
                    img.setImageResource(R.drawable.tortoise);
                    option1.setText("Tortoise");
                    option1.setId(R.id.correct);

                    option2.setText("Monkey");
                    option2.setId(R.id.option3);

                    option3.setText("Rhino");
                    option3.setId(R.id.option2);

                    option4.setText("Lion");
                    option4.setId(R.id.option4);

                    break;
                default:
                    break;
            }

        }
        else{
            if (view.getId() == R.id.correct) {
                result += 10;
                Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
            }
            Intent intent=new Intent(this,ExamResult.class);
            intent.putExtra("number","Points: "+result);
            Toast.makeText(this, "Result:"+result, Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }

    }
}
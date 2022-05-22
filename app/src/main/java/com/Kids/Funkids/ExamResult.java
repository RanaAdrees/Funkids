package com.Kids.Funkids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;

public class ExamResult extends AppCompatActivity {

    TextView examPoints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_result);

        examPoints=findViewById(R.id.examPoints);
        Intent intent=getIntent();
        examPoints.setText(intent.getStringExtra("number"));
        Intent intent1=new Intent(this,MainActivity.class);

        new android.os.Handler(Looper.getMainLooper()).postDelayed(
                new Runnable() {
                    public void run() {
                        startActivity(intent1);
                    }
                },
                4000);

    }
}
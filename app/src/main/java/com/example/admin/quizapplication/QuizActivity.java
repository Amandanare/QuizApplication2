package com.example.admin.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        // setup screen for the first question with four alternative to answer


    }
    public void sport(View v)
    {
        Intent i = new Intent(this,SportsActivity.class);
        startActivity(i);

    }
    public void religion(View v)
    {
        Intent i = new Intent(this,ReligionActivity.class);
        startActivity(i);
    }
    public void politics(View v)
    {
        Intent i = new Intent(this,PoliticsActivity.class);
        startActivity(i);
    }
    }


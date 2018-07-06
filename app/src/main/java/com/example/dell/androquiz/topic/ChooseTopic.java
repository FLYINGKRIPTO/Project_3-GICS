package com.example.dell.androquiz.topic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.dell.androquiz.R;
import com.example.dell.androquiz.XMLquestions;
import com.example.dell.androquiz.javaQuiz;
import com.example.dell.androquiz.layoutQuestions;
import com.example.dell.androquiz.android_general;

public class ChooseTopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_topic);


    }
    public void javaQuestions(View view){
        Intent I = new Intent(this, javaQuiz.class);
        startActivity(I);
    }
   public void layoutQuestions(View view){

        Intent I= new Intent(this, layoutQuestions.class);
        startActivity(I);

   }
   public void xmlQuestions(View view){

       Intent I= new Intent(this, XMLquestions.class);
       startActivity(I);

   }

   public void androidQuestions(View view){
       Intent I= new Intent(this, android_general.class);
       startActivity(I);

   }



}

package com.example.dell.androquiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class XMLquestions extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlquestions);
    }
    public void onSubmitTwo(View view){
        RadioButton questionOneOptionTwo = findViewById(R.id.q1o2);
        boolean queOneOptionTwo = questionOneOptionTwo.isChecked();
        RadioButton questionTwoOptionTwo = findViewById(R.id.q2o2);
        boolean queTwoOptionTwo = questionTwoOptionTwo.isChecked();
        CheckBox questionThreeOptionOne = findViewById(R.id.q3o1);
        boolean queThreeOptionOne = questionThreeOptionOne.isChecked();
        CheckBox questionThreeOptionTwo = findViewById(R.id.q3o2);
        boolean queThreeOptionTwo = questionThreeOptionTwo.isChecked();
        RadioButton questionFourOptionTwo = findViewById(R.id.q4o2);
        boolean queFourOptionTwo = questionFourOptionTwo.isChecked();
        EditText eText = (EditText) findViewById(R.id.q5o4);
        String str = eText.getText().toString();
        int totalScore = scoreCounter(queOneOptionTwo, queTwoOptionTwo, queThreeOptionOne, queFourOptionTwo, str,queThreeOptionTwo);
        printScore(totalScore);
    }
    public int scoreCounter(boolean a,boolean b,boolean c,boolean d,String e,boolean f)
    {
        int baseScore=0;
        if(a){
            baseScore++;
        }
        if (b){
            baseScore++;
        }
        if (c||f){
            baseScore++;
        }
        if (d){
            baseScore++;
        }
        if (e.equalsIgnoreCase(getString(R.string.gr))){
            baseScore++;
        }
        return baseScore;
    }
    public void printScore(int totalScore)
    {
        AlertDialog.Builder builder;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = new AlertDialog.Builder(this, android.R.style.Theme_Material_Dialog_Alert);
        } else {
            builder = new AlertDialog.Builder(this);
        }
        builder.setTitle(R.string.totalScore)
                .setMessage(getString(R.string.yourSocre) + totalScore+"/5")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .show();
    }
    }


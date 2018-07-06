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
    EditText eText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xmlquestions);
    }
    public void onSubmitTwo(View view){
        RadioButton q1_option2 = findViewById(R.id.q1o2);
        boolean c_q1_option2 = q1_option2.isChecked();

        RadioButton q2_option2 = findViewById(R.id.q2o2);
        boolean c_q2_option2 = q2_option2.isChecked();

        CheckBox q3_option1 = findViewById(R.id.q3o1);
        boolean c_q3_option1 = q3_option1.isChecked();

        CheckBox q3_option2 = findViewById(R.id.q3o2);
        boolean c_q3_option2 = q3_option2.isChecked();

        RadioButton q4_option2 = findViewById(R.id.q4o2);
        boolean c_q4_option2 = q4_option2.isChecked();
        eText = (EditText) findViewById(R.id.q5o4);
        String str = eText.getText().toString();


        int totalScore = scoreCounter(c_q1_option2, c_q2_option2, c_q3_option1, c_q4_option2, str,c_q3_option2);
        printScore(totalScore);
    }

    public int scoreCounter(boolean a,boolean b,boolean c,boolean d,String e,boolean f)
    {
        int baseScore=0;

        if(a){
            baseScore+=1;
        }
        if (b){
            baseScore+=1;
        }
        if (c||f){
            baseScore+=1;
        }
        if (d){
            baseScore+=1;
        }
        if (e.equals("gravity")||e.equals("Gravity")){
            baseScore+=1;
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
        builder.setTitle("    TOTAL SCORE   ")
                .setMessage("     Your Score is " + totalScore+"/5")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .show();
    }


    }


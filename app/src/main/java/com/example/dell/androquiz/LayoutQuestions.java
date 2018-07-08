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

public class LayoutQuestions extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_questions);
    }
    public void onSubmitone(View view) {
        CheckBox questionOneOptionOne = findViewById(R.id.q1o1);
        boolean queOneOptionOne = questionOneOptionOne.isChecked();
        CheckBox questionOneOptionThree = findViewById(R.id.q1o3);
        boolean queOneOptionThree = questionOneOptionThree.isChecked();
        RadioButton questionOneOptionFour = findViewById(R.id.q204);
        boolean queOneOptionFour = questionOneOptionFour.isChecked();
        RadioButton questionThreeOptionOne = findViewById(R.id.q3o1);
        boolean queThreeOptionOne = questionThreeOptionOne.isChecked();
        RadioButton questionFourOptionTwo = findViewById(R.id.q4o2);
        boolean queFourOptionTwo = questionFourOptionTwo.isChecked();
        EditText eText = (EditText) findViewById(R.id.q5o4);
        String str = eText.getText().toString();
        int totalScore = scoreCounter(queOneOptionOne, queOneOptionFour, queThreeOptionOne, queFourOptionTwo, str,queOneOptionThree);
        printScore(totalScore);
    }
    public int scoreCounter(boolean a,boolean b,boolean c,boolean d,String e,boolean f)
    {
        int baseScore=0;
        if(a&&f){
            baseScore++;
        }
        if (b){
            baseScore++;
        }
        if (c){
            baseScore++;
        }
        if (d){
            baseScore++;
        }
        if (e.equalsIgnoreCase("Layout")){
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
                .setMessage(" Your Score is " + totalScore+"/5")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .show();
    }
}

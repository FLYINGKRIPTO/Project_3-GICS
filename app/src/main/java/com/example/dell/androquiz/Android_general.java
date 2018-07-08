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
public class Android_general extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_general);
    }
    public void onSubmitThree(View view){
        RadioButton questionOneOptionTwo = findViewById(R.id.q1o2);
        boolean queOneOptionTwo = questionOneOptionTwo.isChecked();
        RadioButton questionTwoOptionTwo = findViewById(R.id.q2o2);
        boolean queTwoOptionTwo = questionTwoOptionTwo.isChecked();
        RadioButton questionThreeOptionThree = findViewById(R.id.q3o3);
        boolean queThreeOptionOne = questionThreeOptionThree.isChecked();
        CheckBox questionFourOptionOne = findViewById(R.id.q4o1);
        boolean queFourOptionOne = questionFourOptionOne.isChecked();
        CheckBox questionFourOptionTwo = findViewById(R.id.q4o2);
        boolean queFourOptionTwo = questionFourOptionTwo.isChecked();
        EditText eText = (EditText) findViewById(R.id.q5o4);
        String str = eText.getText().toString();
        int totalScore = scoreCounter(queOneOptionTwo, queTwoOptionTwo, queThreeOptionOne,queFourOptionOne,str,queFourOptionTwo);
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
        if (c){
            baseScore++;
        }
        if (d&&f){
            baseScore++;
        }
        if (e.equalsIgnoreCase("View")){
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
                .setMessage("Your Score is "+ totalScore+"/5")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .show();
    }
}







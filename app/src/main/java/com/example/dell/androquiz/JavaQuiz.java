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
public class JavaQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_quiz);
    }
    public void onSubmit(View view) {
        RadioButton questionOneOptionTwo = findViewById(R.id.q1o2);
        boolean queOneOptionTwo = questionOneOptionTwo.isChecked();
        RadioButton questionTwoOptionFour = findViewById(R.id.q204);
        boolean queTwoOptionFour = questionTwoOptionFour.isChecked();
        EditText eText = (EditText) findViewById(R.id.q302);
        String str = eText.getText().toString();
        RadioButton questionFourOptionThree = findViewById(R.id.q403);
        boolean queFourOptionThree = questionFourOptionThree.isChecked();
        CheckBox questionFiveOptionTwo = findViewById(R.id.q502);
        boolean queFiveOptionTwo = questionFiveOptionTwo.isChecked();
        CheckBox questionFiveOptionOne = findViewById(R.id.q501);
        boolean queFiveOptionOne = questionFiveOptionOne.isChecked();
        int totalScore = scoreCounter(queOneOptionTwo, queTwoOptionFour, str, queFourOptionThree, queFiveOptionTwo,queFiveOptionOne);
        printScore(totalScore);
    }
    public int scoreCounter(boolean a,boolean b,String c,boolean d,boolean e,boolean f)
    {
      int baseScore=0;
      if(a){
          baseScore++;
      }
      if (b){
          baseScore++;
      }
      if (c.equalsIgnoreCase("finishActivity")){
          baseScore++;
      }
      if (d){
          baseScore++;
      }
      if (e&&f){
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
                .setMessage("Your Score is " + totalScore+"/5")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .show();
    }
}

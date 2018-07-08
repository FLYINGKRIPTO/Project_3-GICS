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
public class javaQuiz extends AppCompatActivity {
    EditText eText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_quiz);
    }
    public void onSubmit(View view) {
        RadioButton q1_option2 = findViewById(R.id.q1o2);
        boolean c_q1_option2 = q1_option2.isChecked();
        RadioButton q2_option4 = findViewById(R.id.q204);
        boolean c_q2_option4 = q2_option4.isChecked();
        eText = (EditText) findViewById(R.id.q302);
        String str = eText.getText().toString();
        RadioButton q4_option3 = findViewById(R.id.q403);
        boolean c_q4_option3 = q4_option3.isChecked();
        CheckBox q5_option2 = findViewById(R.id.q502);
        boolean c_q5_option2 = q5_option2.isChecked();
        CheckBox q5_option1 = findViewById(R.id.q501);
        boolean c_q5_option1 = q5_option1.isChecked();
        int totalScore = scoreCounter(c_q1_option2, c_q2_option4, str, c_q4_option3, c_q5_option2,c_q5_option1);
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
                .setMessage(R.string.yourSocre + totalScore+"/5")
                .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .show();
    }
}

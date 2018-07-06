package com.example.dell.androquiz.MainActivityPackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toolbar;

import com.example.dell.androquiz.R;
import com.example.dell.androquiz.topic.ChooseTopic;

public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onStart(View view){
        Intent I = new Intent(this, ChooseTopic.class);
        startActivity(I);

    }


}

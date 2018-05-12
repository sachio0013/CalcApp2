package jp.techacademy.sachio.suenaga.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        double i = intent.getDoubleExtra("i",0);


        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText(String.valueOf(i));
    }



}

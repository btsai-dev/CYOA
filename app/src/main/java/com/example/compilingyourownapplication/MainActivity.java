package com.example.compilingyourownapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PlayGifView pGif = (PlayGifView) findViewById(R.id.viewGif);
        //pGif.setImageResource(R.drawable.coaster);
    }

    public void go_home(View view){
        setContentView(R.layout.activity_main);
    }

    public void enter_decision_default(View view){
        setContentView(R.layout.decision_default_file);
    }

    public void decision_default_01(View view){
        System.out.println("DEFAULT OUT 01");
        setContentView(R.layout.decision_default_result_01);
    }

    public void decision_default_02(View view) {
        System.out.println("DEFAULT OUT 02");
        setContentView(R.layout.decision_default_result_02);
    }
}

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

    public void go_prologue(View view){
        setContentView(R.layout.prologue);
    }

    public void go_decision_00(View view){
        setContentView(R.layout._decision_00);
    }

    public void go_decision_00A(View view){
        setContentView(R.layout._decision_00a);
    }

    public void go_decision_00B(View view){
        setContentView(R.layout._decision_00b);
    }

    public void go_decision_01(View view){
        setContentView(R.layout._decision_01);
    }

    public void go_decision_01A(View view){
        setContentView(R.layout._decision_01a);
    }

    public void go_decision_01B(View view){
        setContentView(R.layout._decision_01b);
    }

    public void go_decision_02(View view){
        setContentView(R.layout._decision_02);
    }

    public void go_decision_02A(View view){
        setContentView(R.layout._decision_02a);
    }

    public void go_decision_02B(View view){
        setContentView(R.layout._decision_02b);
    }

    public void go_decision_03(View view){
        setContentView(R.layout._decision_03);
    }

    public void go_decision_03A(View view){
        setContentView(R.layout._decision_03a);
    }

    public void go_decision_03B(View view){
        setContentView(R.layout._decision_03b);
    }

    public void go_decision_04(View view){
        setContentView(R.layout._decision_03);
    }

    public void go_decision_04A(View view){
        setContentView(R.layout._decision_03a);
    }

    public void go_decision_04B(View view){
        setContentView(R.layout._decision_03b);
    }

    public void go_decision_05(View view){
        setContentView(R.layout._decision_03);
    }

    public void go_decision_05A(View view){
        setContentView(R.layout._decision_03a);
    }

    public void go_decision_05B(View view){
        setContentView(R.layout._decision_03b);
    }

    public void go_decision_06(View view){
        setContentView(R.layout._decision_03);
    }

    public void go_decision_06A(View view){
        setContentView(R.layout._decision_03a);
    }

    public void go_decision_06B(View view){
        setContentView(R.layout._decision_03b);
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

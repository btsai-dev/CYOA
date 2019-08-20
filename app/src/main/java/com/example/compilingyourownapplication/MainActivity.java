package com.example.compilingyourownapplication;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.*;
import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    Button mbutton;
    EditText mEdit;
    TextView mText;

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
        count++;
        setContentView(R.layout._decision_00a);
    }

    public void go_decision_00B(View view){
        setContentView(R.layout._decision_00b);
    }

    public void go_decision_01(View view){
        setContentView(R.layout._decision_01);
    }

    public void go_decision_01A(View view){
        count++;
        setContentView(R.layout._decision_01a);
    }

    public void go_decision_01B(View view){
        setContentView(R.layout._decision_01b);
    }

    public void go_decision_02(View view){
        setContentView(R.layout._decision_02);
    }

    public void go_decision_02A(View view){
        count++;
        setContentView(R.layout._decision_02a);
    }

    public void go_decision_02B(View view){
        setContentView(R.layout._decision_02b);
    }

    public void go_decision_02C(View view){
        setContentView(R.layout._decision_02c);
    }

    public void go_decision_02D(View view){
        setContentView(R.layout._decision_02d);
    }

    public void go_decision_03(View view){
        setContentView(R.layout._decision_03);
    }

    public void go_decision_03A(View view){
        count++;
        setContentView(R.layout._decision_03a);
    }

    public void go_decision_03B(View view){
        setContentView(R.layout._decision_03b);
    }

    public void go_decision_04(View view){ setContentView(R.layout._decision_04); }

    public void go_decision_04A(View view){
        count++;
        setContentView(R.layout._decision_04a);
    }

    public void go_decision_04B(View view){
        setContentView(R.layout._decision_04b);
    }

    public void go_decision_05(View view){
        setContentView(R.layout._decision_05);
    }

    public void go_decision_05A(View view){
        count++;
        setContentView(R.layout._decision_05a);
    }

    public void go_decision_05B(View view){
        setContentView(R.layout._decision_05b);
    }

    public void go_decision_06(View view){
        setContentView(R.layout._decision_06);
    }

    public void go_decision_06A(View view){
        count++;
        setContentView(R.layout._decision_06a);
    }

    public void go_decision_06B(View view){
        setContentView(R.layout._decision_06b);
    }

    public void go_decision_final(View view) {
        System.out.println("FINAL DECISIONS!");
        setContentView(R.layout._decision_final);

        Random rand = new Random();
        int money = rand.nextInt(15);
        money += 11;

        String mon = Integer.toString(money);

        final int result = money_change(money);


        System.out.println("Getting change textview!");
        TextView change = (TextView)findViewById(R.id.money_change);
        System.out.println("Setting textview!");
        change.setText(mon);

        mbutton = (Button)findViewById(R.id.button01);
        mbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mEdit = (EditText)findViewById(R.id.input01);
                String _str_input = mEdit.getText().toString();
                if (_str_input.length() <= 0)
                    ending(false);
                else {
                    int _input = Integer.parseInt(_str_input);

                    if (_input == result) {
                        ending(true);
                    } else {
                        ending(false);
                    }
                }
            }
        });
    }

    public void ending(boolean boss_result){
        if(boss_result)
            if(count >= 3)
                setContentView(R.layout.good_ending);
            else
                setContentView(R.layout.bad_ending);
        else
            setContentView(R.layout.bad_ending);
    }

    public static int money_change(int money){
        System.out.println("Changing money.");
        ArrayList<Integer> min_num_coins = new ArrayList<Integer>();
        int[] coins = {1, 3, 4};
        min_num_coins.add(0);
        int m = 1;

        while (m < money + 1){
            min_num_coins.add(999999);
            for (int coin_index = 0; coin_index < coins.length; coin_index++){
                int coin = coins[coin_index];
                System.out.println(coin);
                if (m >= coin){
                    int num_coins = min_num_coins.get(m - coin) + 1;
                    if (num_coins < min_num_coins.get(m)){
                        min_num_coins.set(m, num_coins);
                    }
                }
            }
            m++;
        }
        System.out.println(min_num_coins);
        return min_num_coins.get(money);
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


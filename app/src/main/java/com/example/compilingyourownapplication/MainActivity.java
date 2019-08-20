/**
 * Main program for the Infinity Mountain gag app.
 */
package com.example.compilingyourownapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.*;
import java.util.Random;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Counter for number of stones
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Start the background music
        startService(new Intent(MainActivity.this, SoundService.class));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Function to destroy the music to prevent any memory leaks/overlapping songs
     */
    protected void onDestroy() {
        //stop service and stop music
        stopService(new Intent(MainActivity.this, SoundService.class));
        super.onDestroy();
    }

    /**
     * Final calculation function
     * @param view
     */
    public void go_decision_final(View view) {
        // Set the display
        setContentView(R.layout._decision_final);

        // Randomize the money change needed
        Random rand = new Random();
        int money = rand.nextInt(15);
        money += 11;
        String mon = Integer.toString(money);

        // Calculate the result
        final int result = money_change(money);

        // Alter display text to reflect current result
        TextView change = (TextView)findViewById(R.id.money_change);
        change.setText(mon);

        // Find the submit button and add a listener
        Button mbutton = (Button)findViewById(R.id.button01);
        mbutton.setOnClickListener(new View.OnClickListener() {
            // onClick listener
            public void onClick(View view) {
                EditText mEdit = (EditText)findViewById(R.id.input01);
                String _str_input = mEdit.getText().toString();

                // Wrong if string contains emptiness
                if (_str_input.length() <= 0)
                    ending(false);
                else {
                    // default _input, guaranteed to be incorrect.
                    int _input = -999;
                    // Attempt to parse string into an int
                    try {
                        _input = Integer.parseInt(_str_input);
                    } catch(NumberFormatException e){
                        ending(false);
                    }

                    // Compare user input with the calculated result.
                    if (_input == result) {
                        ending(true);
                    } else {
                        ending(false);
                    }
                }
            }
        });
    }

    /**
     * Calculates which end to give
     * @param boss_result - whether the player solved the change problem correctly.
     */
    public void ending(boolean boss_result){
        if(boss_result)
            if(count >= 3)
                setContentView(R.layout.good_ending);
            else
                setContentView(R.layout.bad_ending);
        else
            setContentView(R.layout.bad_ending);
    }

    /**
     * Money Change problem, solved with dynamic programming
     * @param money - Money to calculate change for
     * @return the minimum amount of coins needed
     */
    public static int money_change(int money){
        // Create a flexible arraylist
        ArrayList<Integer> min_num_coins = new ArrayList<Integer>();

        // Coins to be used as change.
        int[] coins = {1, 3, 4};
        min_num_coins.add(0);

        // Set up the incrementer
        int m = 1;
        while (m <= money){
            min_num_coins.add(999999);
            // For each coin, check
            for (int coin_index = 0; coin_index < coins.length; coin_index++){
                int coin = coins[coin_index];
                if (m >= coin){
                    // Count the number of coins by checking the previous recorded result and adding one to account for the checked coin
                    int num_coins = min_num_coins.get(m - coin) + 1;
                    // Update the number of coins to reflect the minimum number for a certain combination
                    if (num_coins < min_num_coins.get(m)){
                        min_num_coins.set(m, num_coins);
                    }
                }
            }
            m++;
        }

        return min_num_coins.get(money);
    }


    /**
     * Large batch of listener functions for clicking buttons on certain layouts. Increment the count number for correct statements.
     * @param view - Current display view
     */
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

}


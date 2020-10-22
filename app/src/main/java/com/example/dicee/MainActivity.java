package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring variables
        Button rollBtn;
        final ImageView leftDice, rightDice;
        final int die[] ={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};


        //fetching the views by id
        rollBtn = findViewById(R.id.rollBtn);
        leftDice = findViewById(R.id.image_leftDice);
        rightDice = findViewById(R.id.image_rightDice);

        //set a button click
        rollBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //System.out.println("Dice Rolled");
                Random randomNumberGenerator = new Random();
                int randomNum = randomNumberGenerator.nextInt(6);
                leftDice.setImageResource(die[randomNum]);
                randomNum = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(die[randomNum]);
            }
        });
    }
}
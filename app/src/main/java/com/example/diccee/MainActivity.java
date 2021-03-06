package com.example.diccee;

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

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        final ImageView leftDice, rightDice;

        leftDice = (ImageView) findViewById(R.id.leftDice);
        rightDice = (ImageView) findViewById(R.id.rightDice);

      rollButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
//              Log.d("diccee", "hello world");

              Random randomNumberGenerator = new Random();

              int number = randomNumberGenerator.nextInt(6);

//              Log.d("diccee","Random Number:"+number);

              leftDice.setImageResource(diceArray[number]);

              number = randomNumberGenerator.nextInt(6);
              rightDice.setImageResource(diceArray[number]);
          }
      });


    }
}

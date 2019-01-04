package com.mdsakibulislam.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView rightDice, leftDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = (Button) findViewById(R.id.rollButton);
        rightDice = (ImageView) findViewById(R.id.image_dice_rignt);
        leftDice = (ImageView) findViewById(R.id.image_dice_left);

        final int[] numberArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,


        };


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rendomNumber = new Random();
                int number = rendomNumber.nextInt(6);
                leftDice.setImageResource(numberArray[number]);


                number = rendomNumber.nextInt(6);
                rightDice.setImageResource(numberArray[number]);






            }
        });




    }
}

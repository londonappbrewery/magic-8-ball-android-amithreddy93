package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = (Button)findViewById(R.id.playbutton);
        final ImageView futurepredictor = (ImageView)findViewById(R.id.Decisionmaker);

        final int[] decisionarray = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random Randomgenerator = new Random();
                int number = Randomgenerator.nextInt(5);
                futurepredictor.setImageResource(decisionarray[number]);
            }
        });
    }
}

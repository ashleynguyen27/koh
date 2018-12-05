package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmotionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotions);

//        for each button
//            button listener
//              send to next page: emotion_def
//              pass in the word of the emotion


//        title
//        button color
//        look of a button being pushed? not necessary

        Button happyButton = (Button) findViewById(R.id.happy_button);
        happyButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionsActivity.this, Emotion_defActivity.class);
                intent.putExtra("emotion", "happy");
                startActivity(intent);
            }
        });

        Button jealousButton = (Button) findViewById(R.id.jealous_button);
        jealousButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionsActivity.this, Emotion_defActivity.class);
                intent.putExtra("emotion", "jealous");
                startActivity(intent);
            }
        });


        Button angryButton = (Button) findViewById(R.id.angry_button);
        angryButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionsActivity.this, Emotion_defActivity.class);
                intent.putExtra("emotion", "angry");
                startActivity(intent);
            }
        });

        Button sadButton = (Button) findViewById(R.id.sad_button);
        sadButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionsActivity.this, Emotion_defActivity.class);
                intent.putExtra("emotion", "sad");
                startActivity(intent);
            }
        });

        Button scaredButton = (Button) findViewById(R.id.scared_button);
        scaredButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionsActivity.this, Emotion_defActivity.class);
                intent.putExtra("emotion", "scared");
                startActivity(intent);
            }
        });


        Button worriedButton = (Button) findViewById(R.id.worried_button);
        worriedButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmotionsActivity.this, Emotion_defActivity.class);
                intent.putExtra("emotion", "worried");
                startActivity(intent);
            }
        });

    }
}

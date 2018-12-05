package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Game3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
        String emotion = getIntent().getStringExtra("emotion");
        String wrongEmotion = "happy";
        if (emotion.equals("happy"))
            wrongEmotion = "angry";

        TextView headerView = (TextView) findViewById(R.id.prompt3);
        headerView.setText("What image best represents being " + emotion + "?");

        ImageView imageLeft = (ImageView) findViewById(R.id.imageLeft3);
        int resourceImage = getResources().getIdentifier(wrongEmotion + "_scenario2", "drawable", getPackageName());
        imageLeft.setImageResource(resourceImage);


        ImageView imageRight = (ImageView) findViewById(R.id.imageRight3);
        int resourceImage2 = getResources().getIdentifier(emotion + "_scenario2", "drawable", getPackageName());
        imageRight.setImageResource(resourceImage2);
    }

    public void wrongAnswer3(View view) {
        TextView textView = findViewById(R.id.message3);
        textView.setText("Try again!");
    }

    public void rightAnswer3(View view) {
        Intent intent = new Intent(this, CongratsActivity.class);
        intent.putExtra("emotion", getIntent().getStringExtra("emotion"));
        startActivity(intent);
    }
}

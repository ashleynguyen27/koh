package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Game2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        String emotion = getIntent().getStringExtra("emotion");
        String wrongEmotion = "sad";
        if (emotion.equals("sad"))
            wrongEmotion = "happy";

        TextView headerView = (TextView) findViewById(R.id.prompt2);
        headerView.setText("What image best represents being " + emotion + "?");

        ImageView imageLeft = (ImageView) findViewById(R.id.imageLeft2);
        int resourceImage = getResources().getIdentifier(wrongEmotion + "_scenario1", "drawable", getPackageName());
        imageLeft.setImageResource(resourceImage);


        ImageView imageRight = (ImageView) findViewById(R.id.imageRight2);
        int resourceImage2 = getResources().getIdentifier(emotion + "_scenario1", "drawable", getPackageName());
        imageRight.setImageResource(resourceImage2);
    }

    public void wrongAnswer2(View view) {
        TextView textView = findViewById(R.id.message2);
        textView.setText("Try again!");
    }

    public void rightAnswer2(View view) {
        Intent intent = new Intent(this, Game3Activity.class);
        intent.putExtra("emotion", getIntent().getStringExtra("emotion"));
        startActivity(intent);
    }
}

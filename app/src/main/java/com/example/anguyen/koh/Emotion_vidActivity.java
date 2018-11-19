package com.example.anguyen.koh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;


public class Emotion_vidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion_vid);

        String emotion = getIntent().getStringExtra("emotion");


        TextView headerView = (TextView) findViewById(R.id.header);
        headerView.setText("How does being " + emotion + " feel like?");

        TextView descriptionView = (TextView) findViewById(R.id.description);
        descriptionView.setText(getResources().getIdentifier(emotion + "_des" , "string", getPackageName()));

        VideoView view = (VideoView)findViewById(R.id.video);
        String path = "android.resource://" + getPackageName() + "/" + "raw/" + emotion + "_vid";
        view.setVideoURI(Uri.parse(path));
        view.start();

        Button nextButton = (Button) findViewById(R.id.quiz_button);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emotion_vidActivity.this, Game1Activity.class);
                intent.putExtra("emotion", getIntent().getStringExtra("emotion"));
                startActivity(intent);
            }
        });

        Button homeButton = (Button) findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emotion_vidActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }

}



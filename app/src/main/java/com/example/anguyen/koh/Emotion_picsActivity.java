package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Emotion_picsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion_pics);

        String emotion = getIntent().getStringExtra("emotion");



        TextView headerView = (TextView) findViewById(R.id.header);
        headerView.setText("When does being " + emotion + " feel like?");



        ImageView img1= (ImageView) findViewById(R.id.scenario1_pic);
        img1.setImageResource(getResources().getIdentifier(emotion + "_scenario1" , "drawable", getPackageName()));
        TextView scenario1View = (TextView) findViewById(R.id.scenario1_text);
        scenario1View.setText(getResources().getIdentifier(emotion + "_scenario1" , "string", getPackageName()));

        ImageView img2= (ImageView) findViewById(R.id.scenario2_pic);
        img2.setImageResource(getResources().getIdentifier(emotion + "_scenario2" , "drawable", getPackageName()));
        TextView scenario2View = (TextView) findViewById(R.id.scenario2_text);
        scenario2View.setText(getResources().getIdentifier(emotion + "_scenario2" , "string", getPackageName()));

        ImageView img3= (ImageView) findViewById(R.id.scenario3_pic);
        img3.setImageResource(getResources().getIdentifier(emotion + "_scenario3" , "drawable", getPackageName()));
        TextView scenario3View = (TextView) findViewById(R.id.scenario3_text);
        scenario3View.setText(getResources().getIdentifier(emotion + "_scenario3" , "string", getPackageName()));





        Button nextButton = (Button) findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emotion_picsActivity.this, Emotion_vidActivity.class);
                intent.putExtra("emotion", getIntent().getStringExtra("emotion"));
                startActivity(intent);
            }
        });


    }
}

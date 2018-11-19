package com.example.anguyen.koh;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Emotion_defActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emotion_def);


//        get the name of the emotion that was passed in
//        retrieve data of that emotion from values
//        display information
//            need to replace the header (header)
//            display the picture (emotion_pic)
//            display the definition of the emotion (emotion_def)

//        button listener for (next_button)
//            takes to next page (emotion_pic)
//            passes the emotion name again

        String emotion = getIntent().getStringExtra("emotion");



        TextView headerView = (TextView) findViewById(R.id.header);
        headerView.setText("What does being " + emotion + " mean?");

        TextView defView = (TextView) findViewById(R.id.definition);
        defView.setText(getResources().getIdentifier(emotion + "_def" , "string", getPackageName()));


        ImageView image = (ImageView) findViewById(R.id.pic);
        int resourceImage = getResources().getIdentifier(emotion + "_pic", "drawable", getPackageName());
        image.setImageResource(resourceImage);

        Button nextButton = (Button) findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Emotion_defActivity.this, Emotion_picsActivity.class);
                intent.putExtra("emotion", getIntent().getStringExtra("emotion"));
                startActivity(intent);
            }
        });

    }
}

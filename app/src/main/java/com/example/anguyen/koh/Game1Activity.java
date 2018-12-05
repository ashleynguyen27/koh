package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Game1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
        String emotion = getIntent().getStringExtra("emotion");

        TextView headerView = (TextView) findViewById(R.id.prompt1);
        headerView.setText("What image best represents being " + emotion + "?");
    }

    public void wrongAnswer(View view) {
        TextView textView = findViewById(R.id.message1);
        textView.setText("Try again!");
    }

    public void rightAnswer(View view) {
        Intent intent = new Intent(this, Game2Activity.class);
        intent.putExtra("emotion", getIntent().getStringExtra("emotion"));
        startActivity(intent);
    }
}

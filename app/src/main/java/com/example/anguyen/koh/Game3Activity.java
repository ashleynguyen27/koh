package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Game3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
    }

    public void wrongAnswer3(View view) {
        TextView textView = findViewById(R.id.message3);
        textView.setText("Try again!");
    }

    public void rightAnswer3(View view) {
        Intent intent = new Intent(this, CongratsActivity.class);
        intent.putExtra("GAME_1", "");
        startActivity(intent);
    }
}

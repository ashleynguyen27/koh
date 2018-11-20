package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Game2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
    }

    public void wrongAnswer2(View view) {
        TextView textView = findViewById(R.id.message2);
        textView.setText("Try again!");
    }

    public void rightAnswer2(View view) {
        Intent intent = new Intent(this, Game3Activity.class);
        intent.putExtra("GAME_1", "");
        startActivity(intent);
    }
}

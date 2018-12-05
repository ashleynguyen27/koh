package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
    }

    public void playGameHappy(View view) {
        Intent intent = new Intent(this, Game1Activity.class);
        intent.putExtra("emotion", "happy");
        startActivity(intent);
    }

    public void playGameSad(View view) {
        Intent intent = new Intent(this, Game1Activity.class);
        intent.putExtra("emotion", "sad");
        startActivity(intent);
    }

    public void playGameWorried(View view) {
        Intent intent = new Intent(this, Game1Activity.class);
        intent.putExtra("emotion", "worried");
        startActivity(intent);
    }

}

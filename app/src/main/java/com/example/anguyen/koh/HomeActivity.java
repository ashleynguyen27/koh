package com.example.anguyen.koh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewEmotions(View view) {
        Intent intent = new Intent(this, EmotionsActivity.class);
        startActivity(intent);
    }

    public void viewGames(View view) {
        Intent intent = new Intent(this, GamesActivity.class);
        startActivity(intent);
    }
}

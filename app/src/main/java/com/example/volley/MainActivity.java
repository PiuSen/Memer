package com.example.volley;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView  meme=findViewById(R.id.meme);
        Button startButton=findViewById(R.id.startButton);

        startButton.setOnClickListener(v -> {
            Intent i=new Intent(MainActivity.this,NextActivity.class);
            startActivity(i);
        });
    }
}
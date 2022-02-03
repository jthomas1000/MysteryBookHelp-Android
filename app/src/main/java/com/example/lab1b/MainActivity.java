package com.example.lab1b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String[] assistance = getResources().getStringArray(R.array.help);
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = assistance[ r.nextInt(15)];
        TextView e = findViewById(R.id.programOutput);
        e.setText(s);
    }
}
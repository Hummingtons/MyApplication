package com.example.practicecodinghere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String tag = "Main Activity";

        Log.v(tag, "This is a verbose log");
        Log.d(tag, "This is a debug log");
        Log.i(tag, "This is an info log");
        Log.w(tag, "This is a warn log");
        Log.e(tag, "This is an error log");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(tag, "Button Clicked");
            }
        });

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
}
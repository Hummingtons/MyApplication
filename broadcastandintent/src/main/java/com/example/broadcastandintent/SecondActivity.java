package com.example.broadcastandintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.broadcastandintent.databinding.ActivitySecond2Binding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecond2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = (TextView) findViewById(R.id.text_second);

        Intent intent = getIntent();
        String fromMain = intent.getStringExtra("PASS_ME");

        textView.setText(fromMain);

    }

}




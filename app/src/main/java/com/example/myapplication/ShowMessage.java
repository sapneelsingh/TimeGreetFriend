package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.textclassifier.TextClassification;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        Intent i = getIntent();
        String message = i.getStringExtra("message");

        TextView textMessage = (TextView) findViewById(R.id.textMessage);
        textMessage.setText(message);

    }
}

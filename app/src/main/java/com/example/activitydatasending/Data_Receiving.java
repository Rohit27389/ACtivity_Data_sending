package com.example.activitydatasending;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Data_Receiving extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_receiving);
        TextView text = findViewById(R.id.textView);
        String intentData = getIntent().getStringExtra("key");
        Integer integer = getIntent().getIntExtra("tag", 0);
        text.setText(intentData.toString() + integer.toString());
    }
}

package com.example.activitydatasending;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.event_click);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Data_Receiving.class);
                //intent.putExtra("key", "Android Intent");
                EditText editText = findViewById(R.id.edit);
                String st = editText.getText().toString();
                intent.putExtra("key", st);
                intent.putExtra("tag", 33);
                startActivity(intent);
            }
        });
    }
}
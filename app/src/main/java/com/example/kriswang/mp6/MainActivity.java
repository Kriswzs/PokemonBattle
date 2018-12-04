package com.example.kriswang.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton b001;
    private ImageButton b002;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b001 = findViewById(R.id.b001);
        b001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityp001();
            }
        });
        b002 = findViewById(R.id.b002);
        b002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityp002();
            }
        });
    }

    public void openActivityp001() {
        Intent intent = new Intent(this, p001.class);
        startActivity(intent);
    }

    public void openActivityp002() {
        Intent intent = new Intent(this, p002.class);
        startActivity(intent);
    }
}

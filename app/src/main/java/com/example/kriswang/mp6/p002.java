package com.example.kriswang.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class p002 extends AppCompatActivity {
    private ImageButton nb001;
    private ImageButton nb002;
    private ImageButton nb003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p002);

        nb001 = findViewById(R.id.mb001);
        nb001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitynp001();
            }
        });
        nb002 = findViewById(R.id.mb002);
        nb002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitynp002();
            }
        });
        nb003 = findViewById(R.id.mb003);
        nb003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitynp003();
            }
        });
    }

    public void openActivitynp001() {
        Intent intent = new Intent(this, np001.class);
        startActivity(intent);
    }

    public void openActivitynp002() {
        Intent intent = new Intent(this, np002.class);
        startActivity(intent);
    }

    public void openActivitynp003() {
        Intent intent = new Intent(this, np003.class);
        startActivity(intent);
    }
}

package com.example.kriswang.mp6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class p001 extends AppCompatActivity {
    private ImageButton mb001;
    private ImageButton mb002;
    private ImageButton mb003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p001);

        mb001 = findViewById(R.id.mb001);
        mb001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityp101();
            }
        });
        mb002 = findViewById(R.id.mb002);
        mb002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityp102();
            }
        });
        mb003 = findViewById(R.id.mb003);
        mb003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityp103();
            }
        });
    }

    public void openActivityp101() {
        Intent intent = new Intent(this, mp001.class);
        startActivity(intent);
    }

    public void openActivityp102() {
        Intent intent = new Intent(this, mp002.class);
        startActivity(intent);
    }

    public void openActivityp103() {
        Intent intent = new Intent(this, mp003.class);
        startActivity(intent);
    }
}

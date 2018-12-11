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
    private ImageButton mb004;
    private ImageButton mb005;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p001);

        mb001 = findViewById(R.id.mb001);
        mb001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitymp001();
            }
        });
        mb002 = findViewById(R.id.mb002);
        mb002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitymp002();
            }
        });
        mb003 = findViewById(R.id.mb003);
        mb003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitymp003();
            }
        });
        mb004 = findViewById(R.id.mb004);
        mb004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitymp004();
            }
        });
        mb005 = findViewById(R.id.mb005);
        mb005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitymp005();
            }
        });
    }

    public void openActivitymp001() {
        Intent intent = new Intent(this, mp001.class);
        startActivity(intent);
    }

    public void openActivitymp002() {
        Intent intent = new Intent(this, mp002.class);
        startActivity(intent);
    }

    public void openActivitymp003() {
        Intent intent = new Intent(this, mp003.class);
        startActivity(intent);
    }

    public void openActivitymp004() {
        Intent intent = new Intent(this, mp004.class);
        startActivity(intent);
    }

    public void openActivitymp005() {
        Intent intent = new Intent(this, mp005.class);
        startActivity(intent);
    }
}

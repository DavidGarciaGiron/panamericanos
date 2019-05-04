package com.app.panamericanos.panamericanos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnPanamericanos);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn1 = new Intent(MainActivity.this, panamericanos.class);
                startActivity(btn1);
            }
        });

        btn2 = (Button) findViewById(R.id.btnParapanamericanos);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent btn2 = new Intent(MainActivity.this, parapanamericanos.class);
                startActivity(btn2);
            }
        });
    }
}

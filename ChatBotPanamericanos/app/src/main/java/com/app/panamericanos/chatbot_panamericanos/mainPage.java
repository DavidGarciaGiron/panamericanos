package com.app.panamericanos.chatbot_panamericanos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
    }

    public void chatbot(View view){
        Intent intent = new Intent(mainPage.this, MainActivity.class);
        startActivity(intent);
    }
}

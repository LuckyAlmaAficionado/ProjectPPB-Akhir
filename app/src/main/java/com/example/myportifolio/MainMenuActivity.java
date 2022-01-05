package com.example.myportifolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity {

    ImageView background;
    GridLayout menu;
    float v = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        background = findViewById(R.id.bg);
        menu = findViewById(R.id.grid);

        background.setTranslationY(800);
        menu.setTranslationY(800);

        background.setAlpha(v);
        menu.setAlpha(v);

        background.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        menu.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();



    }
//
//    public void education(View view) {
//        Intent i = new Intent(MainMenuActivity.this, iEducation.class);
//        startActivity(i);
//    }
//
    public void calendar(View view) {
        Intent i = new Intent(MainMenuActivity.this, Kalender.class);
        startActivity(i);
    }
//
//    public void payment(View view) {
//        Intent i = new Intent(MainMenuActivity.this, iPayment.class);
//        startActivity(i);
//    }
//
//    public void about(View view) {
//        Intent i = new Intent(MainMenuActivity.this, iAbout.class);
//        startActivity(i);
//    }
}
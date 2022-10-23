package com.binus.sunibresto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button seeMoreBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        seeMoreBtn = findViewById(R.id.SeeMoreBtn);

        seeMoreBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, Reservation.class);
            startActivity(intent);
        });

    }
}
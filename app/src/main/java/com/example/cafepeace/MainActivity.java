package com.example.cafepeace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toMenu(View view) {
        Intent intent = new Intent(this, ShowMenu.class);
        startActivity(intent);
    }

    public void toMap(View view) {
        Intent intent = new Intent(this, ShowLocation.class);
        startActivity(intent);
    }

    public void toAboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void toContact(View view) {
        Intent intent = new Intent(this, ShowContact.class);
        startActivity(intent);
    }
}
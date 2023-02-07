package com.example.camping;

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

    public void addNew(View view) {
        Intent addNewIntent = new Intent(MainActivity.this, NewCampoutActivity.class);
        startActivity(addNewIntent);
    }
}
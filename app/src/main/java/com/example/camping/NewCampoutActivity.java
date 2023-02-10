package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewCampoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_campout);
    }

    public void goBack(View view) {
        Intent backIntent = new Intent(NewCampoutActivity.this, MainActivity.class);
        startActivity(backIntent);
    }

    public void goNext(View view) {
        Intent nextIntent = new Intent(NewCampoutActivity.this, NewCampoutActivity2.class);
        startActivity(nextIntent);
    }
}
package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewCampoutActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_campout2);
    }

    public void goBack(View view) {
        Intent backIntent = new Intent(NewCampoutActivity2.this, NewCampoutActivity.class);
        startActivity(backIntent);
    }
}
package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewCampoutActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_campout4);
    }

    public void goBack(View view) {
        Intent backIntent = new Intent(NewCampoutActivity4.this, NewCampoutActivity3.class);
        startActivity(backIntent);
    }

    public void saveCampout(View view) {
        //need to save the data into variables
        //onPause()
        //go back to main screen
        Intent saveIntent = new Intent(NewCampoutActivity4.this, NewCampoutActivity3.class);
        startActivity(saveIntent);
    }
}
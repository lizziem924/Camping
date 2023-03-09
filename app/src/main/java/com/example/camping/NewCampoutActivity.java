package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class NewCampoutActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_campout);
    }

    public void goBack(View view) {
        Intent backIntent = new Intent(NewCampoutActivity.this, MainActivity.class);
        startActivity(backIntent);
        //don't need to do anything here because I don't want any data to be saved here
        //this is essentially a cancel button
    }

    public void goNext(View view) {
        Intent nextIntent = new Intent(NewCampoutActivity.this, NewCampoutActivity2.class);

        SharedPreferences sp = getSharedPreferences("sharedPref", MODE_PRIVATE);
        //then go on once all the data is saved
        startActivity(nextIntent);
    }
}

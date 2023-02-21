package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        //save the data and move on
        //name
        EditText nameField = findViewById(R.id.answer1);
        String name = nameField.getText().toString(); //save name to a string
        //campsite fee
        EditText campsiteFeeField = findViewById(R.id.answer2);
        String campsiteFeeValue = campsiteFeeField.getText().toString(); //save campsite fee to a string
        int campsiteFee = Integer.parseInt(campsiteFeeValue); //convert to an int
        //distance from camp
        EditText distanceField = findViewById(R.id.answer3);
        String distanceValue = distanceField.getText().toString(); //save distance to a string
        int campDistance = Integer.parseInt(distanceValue); //convert to an int
        //miles per gallon
        EditText mpgField = findViewById(R.id.answer4);
        String mpgValue = mpgField.getText().toString(); //save mpg to a string
        int mpg = Integer.parseInt(campsiteFeeValue); //convert to an int
        //price of gas
        EditText gasPriceField = findViewById(R.id.answer5);
        String gasPriceValue = gasPriceField.getText().toString(); //save campsite fee to a string
        double gasPrice = Double.parseDouble(gasPriceValue); //convert to an int

        //put it into a new campout
        //pass in an empty participant list as a placeholder until I can do that later
        List<Participant> placeholder = new ArrayList<>();
        //create new campout item
        Campout campout = new Campout(name, placeholder, campsiteFee, campDistance, mpg, gasPrice);

        //then go on once all the data is saved
        startActivity(nextIntent);
    }
}
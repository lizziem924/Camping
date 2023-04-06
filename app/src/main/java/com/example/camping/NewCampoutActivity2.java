package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class NewCampoutActivity2 extends AppCompatActivity {

    ArrayList<Campout> campoutList = ListContainer.getCampoutList();
    ArrayList<Participant> participantArrayList = ListContainer.getParticipantArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_campout2);
    }

    public void goBack(View view) {
        Intent backIntent = new Intent(NewCampoutActivity2.this, NewCampoutActivity.class);
        startActivity(backIntent);
    }

    public void saveCampout(View view) {
        //need to save the data into variables
        Intent saveIntent = new Intent(NewCampoutActivity2.this, MainActivity.class);

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
        int mpg = Integer.parseInt(mpgValue); //convert to an int
        //price of gas
        EditText gasPriceField = findViewById(R.id.answer5);
        String gasPriceValue = gasPriceField.getText().toString(); //save campsite fee to a string
        double gasPrice = Double.parseDouble(gasPriceValue); //convert to an int


        //create new campout item
        Campout campout = new Campout(name, participantArrayList, campsiteFee, campDistance, mpg, gasPrice);
        campoutList.add(campout);

        //go back to main screen
        startActivity(saveIntent);
    }

    public void addNewParticipant(View view) {
        Intent i = new Intent(NewCampoutActivity2.this, NewCampoutActivity3.class);
        startActivity(i);
    }
}
package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class NewCampoutActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_campout3);
    }

    List<Participant> participants = new ArrayList<>();

    public void goBack(View view) {
        Intent backIntent = new Intent(NewCampoutActivity3.this, NewCampoutActivity2.class);
        startActivity(backIntent);
    }

    public void saveParticipants(View view) {
        //need to save the data into variables

        //onPause()
        //go back to main screen
        Intent saveIntent = new Intent(NewCampoutActivity3.this, NewCampoutActivity2.class);

        Bundle extras = saveIntent.getExtras();
        if (extras != null) {
            String name = (String) extras.get("nameKey");
            Boolean isAdult = (Boolean) extras.get("ageKey");
            Participant p = new Participant(name, isAdult);
            participants.add(p);
        }

        startActivity(saveIntent);
    }
    //only difference between these two is that the back button does not save, the done button will save the participants and then go back

    public void addNewParticipant(View view) {
        //go to new screen that has a slot for a name and a checkbox for adult/youth
        //save each as a participant item and add each participant to it's own food group list and the participant list
        Intent i = new Intent(NewCampoutActivity3.this, NewCampoutActivity4.class);
        startActivity(i);
    }
}
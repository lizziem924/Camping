package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

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

    ArrayList<Campout> campoutList = ListContainer.getCampoutList();
    //empty the participant list because this is a new campout
    ArrayList<Participant> participantArrayList = ListContainer.getParticipantArrayList();


}
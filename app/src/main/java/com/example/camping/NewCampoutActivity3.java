package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class NewCampoutActivity3 extends AppCompatActivity {

    ArrayList<Campout> campoutList = ListContainer.getCampoutList();
    List<Participant> participants = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_campout3);
    }

    public static final String MyPREFERENCES = "MyPrefs";
    SharedPreferences sp;

    public void goBack(View view) {
        Intent backIntent = new Intent(NewCampoutActivity3.this, NewCampoutActivity2.class);
        startActivity(backIntent);
    }

    public void save(View view) {
        //need to save the data into variables
        EditText nameField = findViewById(R.id.enterName);
        String name = nameField.getText().toString(); //save name to a string
        CheckBox age = (CheckBox) findViewById(R.id.age_checkbox);
        boolean isAdult = age.isChecked(); //true = adult, false = youth
        //take the data and put it into a participant
        Participant p = new Participant(name, isAdult);
        participants.add(p);

        //go back to screen 2
        Intent saveIntent = new Intent(NewCampoutActivity3.this, NewCampoutActivity2.class);
        /* shared prefs the participant info so it can be used in screen 3
        String Name = "nameKey";
        String Age = "ageKey";
        sp = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(Name, name);
        editor.putBoolean(Age, isAdult);
        editor.commit();

        saveIntent.putExtra(Name, name);
        saveIntent.putExtra(Age, isAdult);
         */

        startActivity(saveIntent);
    }
}
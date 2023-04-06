package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    ArrayList<Campout> campoutList = ListContainer.getCampoutList();
    //empty the participant list because this is a new campout
    ArrayList<Participant> participantArrayList = ListContainer.getParticipantArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.campout_list);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new RecycleViewAdapter(campoutList, MainActivity.this);
        recyclerView.setAdapter(mAdapter);
    }

    public void addNew(View view) {
        Intent addNewIntent = new Intent(MainActivity.this, NewCampoutActivity.class);
        startActivity(addNewIntent);
    }



}
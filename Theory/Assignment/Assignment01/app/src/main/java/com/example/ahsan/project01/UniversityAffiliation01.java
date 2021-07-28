package com.example.ahsan.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UniversityAffiliation01 extends AppCompatActivity {

    TextView showName;
    TextView showDOB;
    TextView showNID;
    TextView showBG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_affiliation01);


        showName = findViewById(R.id.showName);
        showDOB = findViewById(R.id.showDOB);
        showNID = findViewById(R.id.showNID);
        showBG = findViewById(R.id.showBloodGroup);

        Intent getMainActDetail = getIntent();
        showName.setText(getMainActDetail.getStringExtra("nameData"));
        showDOB.setText(getMainActDetail.getStringExtra("DOBData"));
        showNID.setText(getMainActDetail.getStringExtra("NIDData"));
        showBG.setText(getMainActDetail.getStringExtra("BloodGroupData"));
    }
}
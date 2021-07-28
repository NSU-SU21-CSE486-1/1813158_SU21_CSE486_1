package com.example.ahsan.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalActivity01 extends AppCompatActivity {



    TextView showName;
    TextView showDOB;
    TextView showNID;
    TextView showBG;
    TextView showUniName;
    TextView showDepartment;
    TextView showStID;
    TextView showStudyLevel;
    TextView showEmail;
    TextView showPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final01);

        showName = findViewById(R.id.showName);
        showDOB = findViewById(R.id.showDOB);
        showNID = findViewById(R.id.showNID);
        showBG = findViewById(R.id.showBloodGroup);
//        showUniName = findViewById(R.id.autoCompleteUniName);
//        showDepartment = findViewById(R.id.autoCompleteDeptName);
        showStID = findViewById(R.id.showStudentID);
//        showStudyLevel = findViewById(R.id.autoCompleteStudyLevel);
        showEmail =findViewById(R.id.showEmail);
        showPhoneNumber = findViewById(R.id.showPhoneNumber);

        Intent getMainActDetail = getIntent();
        showName.setText(getMainActDetail.getStringExtra("nameData"));
        showDOB.setText(getMainActDetail.getStringExtra("DOBData"));
        showNID.setText(getMainActDetail.getStringExtra("NIDData"));
        showBG.setText(getMainActDetail.getStringExtra("BloodGroupData"));

        Intent getUniAffDetail = getIntent();
//        showUniName.setText(getUniAffDetail.getStringExtra("UniversityName"));
//        showDepartment.setText(getUniAffDetail.getStringExtra("Department"));
        showStID.setText(getUniAffDetail.getStringExtra("StudentID"));
//        showStudyLevel.setText(getUniAffDetail.getStringExtra("StudyLevel"));

        Intent getConInfoDetail = getIntent();
        showEmail.setText(getConInfoDetail.getStringExtra("Email"));
        showPhoneNumber.setText(getConInfoDetail.getStringExtra("PhoneNumber"));
    }
}
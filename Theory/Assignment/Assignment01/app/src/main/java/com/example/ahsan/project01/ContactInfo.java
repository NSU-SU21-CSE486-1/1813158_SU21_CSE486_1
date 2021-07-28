package com.example.ahsan.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ContactInfo extends AppCompatActivity {

    TextView showName;
    TextView showDOB;
    TextView showNID;
    TextView showBG;
    TextView showUniName;
    TextView showDepartment;
    TextView showStID;
    TextView showStudyLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        showName = findViewById(R.id.showName);
        showDOB = findViewById(R.id.showDOB);
        showNID = findViewById(R.id.showNID);
        showBG = findViewById(R.id.showBloodGroup);
        showUniName = findViewById(R.id.autoCompleteUniName);
        showDepartment = findViewById(R.id.autoCompleteDeptName);
        showStID = findViewById(R.id.showStudentID);
        showStudyLevel = findViewById(R.id.autoCompleteStudyLevel);


        Intent getMainActDetail = getIntent();
        showName.setText(getMainActDetail.getStringExtra("nameData"));
        showDOB.setText(getMainActDetail.getStringExtra("DOBData"));
        showNID.setText(getMainActDetail.getStringExtra("NIDData"));
        showBG.setText(getMainActDetail.getStringExtra("BloodGroupData"));

        Intent getUniAffiDetail = getIntent();
        showUniName.setText(getUniAffiDetail.getStringExtra("UniversityName"));
        showDepartment.setText(getUniAffiDetail.getStringExtra("Department"));
        showStID.setText(getUniAffiDetail.getStringExtra("StudentID"));
        showStudyLevel.setText(getUniAffiDetail.getStringExtra("StudyLevel"));


        showName.setText(" ");
        showDOB.setText(" ");
        showNID.setText(" ");
        showBG.setText(" ");
        showUniName.setText(" ");
        showDepartment.setText(" ");
        showStID.setText(" ");
        showStudyLevel.setText(" ");
    }
}
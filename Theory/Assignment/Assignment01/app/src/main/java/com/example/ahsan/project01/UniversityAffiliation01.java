package com.example.ahsan.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class UniversityAffiliation01 extends AppCompatActivity {

    TextView showName;
    TextView showDOB;
    TextView showNID;
    TextView showBG;
    AutoCompleteTextView universityNameDD;
    AutoCompleteTextView departmentNameDD;
    AutoCompleteTextView studyLevelDD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university_affiliation01);


        showName = findViewById(R.id.showName);
        showDOB = findViewById(R.id.showDOB);
        showNID = findViewById(R.id.showNID);
        showBG = findViewById(R.id.showBloodGroup);
        universityNameDD = findViewById(R.id.autoCompleteUniName);
        departmentNameDD = findViewById(R.id.autoCompleteDeptName);
        studyLevelDD =findViewById(R.id.autoCompleteStudyLevel);

        Intent getMainActDetail = getIntent();
        showName.setText(getMainActDetail.getStringExtra("nameData"));
        showDOB.setText(getMainActDetail.getStringExtra("DOBData"));
        showNID.setText(getMainActDetail.getStringExtra("NIDData"));
        showBG.setText(getMainActDetail.getStringExtra("BloodGroupData"));

        String [] option_university = {"NSU","DU","BUET","SUST"};
        ArrayAdapter arrayAdapterUni = new ArrayAdapter(this, R.layout.dropdown_item, option_university);
        universityNameDD.setText(arrayAdapterUni.getItem(0).toString(), false); //to make default value
        universityNameDD.setAdapter(arrayAdapterUni);

        String [] option_department = {"CSE","EEE","Civil Engineering","Mechanical Engineering"};
        ArrayAdapter arrayAdapterDept = new ArrayAdapter(this, R.layout.dropdown_item, option_department);
        departmentNameDD.setText(arrayAdapterDept.getItem(0).toString(), false); //to make default value
        departmentNameDD.setAdapter(arrayAdapterDept);

        String [] option_study_level = {"Undergraduate", "MS", "PhD", "Post-Doc"};
        ArrayAdapter arrayAdapterStudyLevel = new ArrayAdapter(this, R.layout.dropdown_item, option_study_level);
        studyLevelDD.setText(arrayAdapterStudyLevel.getItem(0).toString(), false); //to make default value
        studyLevelDD.setAdapter(arrayAdapterStudyLevel);
    }
}
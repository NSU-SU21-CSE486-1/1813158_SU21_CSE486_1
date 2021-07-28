package com.example.ahsan.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UniversityAffiliation01 extends AppCompatActivity {

    TextView showName;
    TextView showDOB;
    TextView showNID;
    TextView showBG;
    AutoCompleteTextView universityNameDD;
    AutoCompleteTextView departmentNameDD;
    EditText StudentID;
    AutoCompleteTextView studyLevelDD;
    Button uniAffNext;

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
        StudentID = findViewById(R.id.emailField);
        studyLevelDD =findViewById(R.id.autoCompleteStudyLevel);
        uniAffNext = findViewById(R.id.uniAffButton);

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


        uniAffNext.setOnClickListener (new View.OnClickListener( ){
            public void onClick(View view){
                Intent UniAffiData = new Intent (UniversityAffiliation01.this, ContactInfo.class);
                UniAffiData.putExtra ("nameData", showName.getText().toString());
                UniAffiData.putExtra ("DOBData", showDOB.getText().toString());
                UniAffiData.putExtra ("NIDData", showNID.getText().toString());
                UniAffiData.putExtra ("BloodGroupData", showBG.getText().toString());
                UniAffiData.putExtra("UniversityName", universityNameDD.getAutofillValue().toString() );
                UniAffiData.putExtra("Department", departmentNameDD.getAutofillValue().toString());
                UniAffiData.putExtra("StudentID", StudentID.getText().toString());
                UniAffiData.putExtra("StudyLevel",studyLevelDD.getAutofillValue().toString());


                showName.setText(" ");
                showDOB.setText(" ");
                showNID.setText(" ");
                showBG.setText(" ");
                universityNameDD.setText(" ");
                departmentNameDD.setText(" ");
                StudentID.setText(" ");
                studyLevelDD.setText(" ");
                startActivity(UniAffiData);
            }

        });
    }
}
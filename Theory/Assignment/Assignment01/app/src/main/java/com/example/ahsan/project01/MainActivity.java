package com.example.ahsan.project01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        EditText name;
        EditText dateOfBirth;
        EditText nid;
        EditText bloodGroup;
        Button mainNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameField);
        dateOfBirth= findViewById(R.id.dateOfBirthFiled);
        nid = findViewById(R.id.nidField);
        bloodGroup = findViewById(R.id.bloodGroupField);
        mainNext = findViewById(R.id.mainActButton);

        mainNext.setOnClickListener (new View.OnClickListener( ){
            public void onClick(View view){
                Intent mainActData = new Intent (MainActivity.this, UniversityAffiliation01.class);
                mainActData.putExtra ("nameData", name.getText().toString());
                mainActData.putExtra ("DOBData", dateOfBirth.getText().toString());
                mainActData.putExtra ("NIDData", nid.getText().toString());
                mainActData.putExtra ("BloodGroupData", bloodGroup.getText().toString());

                name.setText(" ");
                dateOfBirth.setText(" ");
                nid.setText(" ");
                bloodGroup.setText(" ");
                startActivity(mainActData);
            }

        });

    }
}
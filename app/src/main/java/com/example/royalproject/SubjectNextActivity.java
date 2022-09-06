package com.example.royalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class SubjectNextActivity extends AppCompatActivity {

    EditText batch,description,duration,facultyN,subjectid,subjectname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_next);
        batch = findViewById(R.id.batch);
        description = findViewById(R.id.description);
        duration = findViewById(R.id.duration);
        facultyN = findViewById(R.id.facultyname);
        subjectid = findViewById(R.id.subjectid);
        subjectname = findViewById(R.id.subjectname);

        
    }
}
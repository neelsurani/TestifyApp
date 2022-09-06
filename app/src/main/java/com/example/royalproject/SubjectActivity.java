package com.example.royalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SubjectActivity extends AppCompatActivity {

    EditText batch,description,duration,facultyN,subjectid,subjectname;
    Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        batch = findViewById(R.id.batch);
        description = findViewById(R.id.description);
        duration = findViewById(R.id.duration);
        facultyN = findViewById(R.id.facultyname);
        subjectid = findViewById(R.id.subjectid);
        subjectname = findViewById(R.id.subjectname);
        click = findViewById(R.id.btn_submit);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strbname = batch.getText().toString();
                String strdescription = description.getText().toString();
                String strduration = duration.getText().toString();
                String strfname = facultyN.getText().toString();
                String strsubjectid = subjectid.getText().toString();
                String strsubjectname = subjectname.getText().toString();

                Intent i = new Intent(SubjectActivity.this,CActivity.class);
                i.putExtra("bname",strbname);
                i.putExtra("description",strdescription);
                i.putExtra("duration",strduration);
                i.putExtra("fname",strfname);
                i.putExtra("subjectid",strsubjectid);
                i.putExtra("subjectname",strsubjectname);
                startActivity(i);
            }
        });
    }
}
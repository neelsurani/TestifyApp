package com.example.royalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {

    GridView gridView;
    String strLang[] = {"Exam", "Question", "Member", "Subject"};
    Integer imgLang[] = {};
    private ArrayList<LangModel> langModelArraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        gridView = findViewById(R.id.gridview);
        langModelArraylist = new ArrayList<LangModel>();
        for (int i=0;strLang.length>i;i++){

            GalleryModel langmodel = new GalleryModel(strLang[i],imgLang[i]);
            langModelArraylist.add(langmodel);

        }
        BaseAdapter baseAdapter = new MyGridBaseAdapter(this,R.layout.raw_grid,R.id.tv_data,strLang);
        gridView.setAdapter(baseAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent I =new Intent(DashboardActivity.this,CActivity.class);
                startActivity(I);
            }
        });
    }
}
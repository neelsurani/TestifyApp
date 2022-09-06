package com.example.royalproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MyGridBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<LangModel> langModelArrayList;
    public MyGridBaseAdapter(DashboardActivity dashboardActivity, int raw_grid, int tv_data, String[] strLang) {
        this.context = context;
        this.langModelArrayList = langModelArrayList;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}

package com.example.admin.listlikeviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.admin.listlikeviews.adapter.RecyclerListAdapter;
import com.example.admin.listlikeviews.data.AnimalFactory;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        bindRecyclerView();
    }

    private void bindRecyclerView() {
        RecyclerView rvMain = findViewById(R.id.rvMain);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerListAdapter adapter = new RecyclerListAdapter(AnimalFactory.createAnimals());
        rvMain.setAdapter(adapter);
        rvMain.setLayoutManager(layoutManager);
    }
}

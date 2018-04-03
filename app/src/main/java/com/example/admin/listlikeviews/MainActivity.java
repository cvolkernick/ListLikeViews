package com.example.admin.listlikeviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.listlikeviews.R;
import com.example.admin.listlikeviews.adapter.CustomListAdapter;
import com.example.admin.listlikeviews.data.AnimalFactory;
import com.example.admin.listlikeviews.listeners.SimpleListListener;

public class MainActivity extends AppCompatActivity {

    private ListView lvCustom;
    private ListView lvSimple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        bindSimpleList();
        bindCustomListView();
    }

    private void bindCustomListView() {
        CustomListAdapter customListAdapter = new CustomListAdapter(
                this,
                R.layout.simple_list_item,
                AnimalFactory.createAnimals()
        );

        lvCustom.setAdapter(customListAdapter);
    }

    private void bindSimpleList() {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                AnimalFactory.createSimpleAnimals());

        lvSimple.setAdapter(arrayAdapter);
        lvSimple.setOnItemClickListener(new SimpleListListener());
    }

    private void bindViews() {
        lvSimple = findViewById(R.id.lvSimple);
        lvCustom = findViewById(R.id.lvCustom);
    }

    public void goToRecyclerActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), RecyclerActivity.class);
        startActivity(intent);
    }
}

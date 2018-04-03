package com.example.admin.listlikeviews.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.admin.listlikeviews.R;
import com.example.admin.listlikeviews.model.Animal;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter<Animal> {

    public CustomListAdapter(@NonNull Context context, int resource, List<Animal> animalList) {
        super(context, resource, animalList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_list_item, null);
        }

        // bind views
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvWeight = convertView.findViewById(R.id.tvWeight);
        TextView tvType = convertView.findViewById(R.id.tvType);

        // bind views with data
        Animal animal = getItem(position);

        if (animal != null) {
            tvName.setText(animal.getName());
            tvWeight.setText(animal.getWeight());
            tvType.setText(animal.getType());
        }

        return convertView;
    }

    @Nullable
    @Override
    public Animal getItem(int position) {
        return super.getItem(position);
    }
}

package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyArrayAdapter  extends ArrayAdapter<Data> {
    public MyArrayAdapter(@NonNull Context context, ArrayList<Data> list) {
        super(context, R.layout.item_layout, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Data data = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, null);
        }
        TextView textName = ((TextView) convertView.findViewById(R.id.text));
        textName.setText(data.name);
        TextView textSurname = ((TextView) convertView.findViewById(R.id.surname_text));
        textSurname.setText(data.surname);
        textName.setText(data.name);
        textName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),data.name,Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}

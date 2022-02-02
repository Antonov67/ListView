package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Data> list = new ArrayList<>();
        list.add(new Data("1 имя", "1 фамилия"));
        list.add(new Data("2 имя", "2 фамилия"));
        list.add(new Data("3 имя", "3 фамилия"));
        list.add(new Data("4 имя", "4 фамилия"));
        list.add(new Data("5 имя", "5 фамилия"));
        MyArrayAdapter arrayAdapter = new MyArrayAdapter(this,list);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);


        }
}
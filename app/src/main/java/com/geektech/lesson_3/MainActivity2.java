package com.geektech.lesson_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String>  regionList = new ArrayList<>()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recyclerView = findViewById(R.id.recyclerview);


        regionList.add("Chyskiy region");
        regionList.add("Talasskiy region");
        regionList.add("Jalal-Abadsky region");
        regionList.add("Issyk-Kulsky region");
        regionList.add("Batkensky region");
        regionList.add("Oshsky region");
        regionList.add("Narynsky region");

    }
}
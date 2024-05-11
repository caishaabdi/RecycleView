package com.example.recycleview;



import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        List<items> items = new ArrayList<items>();

        items.add(new items("Leyuna","Leyuna@gmail.come",R.drawable.a));
        items.add(new items("Aisha","Aisha@gmail.come",R.drawable.b));
        items.add(new items("Abdi","Abdi@gmail.come",R.drawable.c));
        items.add(new items("Xuseen","Xuseen@gmail.come",R.drawable.d));
        items.add(new items("Ahmed","Ahmed@gmail.come",R.drawable.e));
        items.add(new items("Ali","Ali@gmail.come",R.drawable.f));
        items.add(new items("Maymuun","Maymuun@gmail.come",R.drawable.g));
        items.add(new items("Amran","Amran@gmail.come",R.drawable.h));
        items.add(new items("Muno","Muno@gmail.come",R.drawable.a));
        items.add(new items("SuSu","SuSu@gmail.come",R.drawable.f));
        items.add(new items("Fartuun","Fartuun@gmail.come",R.drawable.b));



        RecyclerView recyclerView =findViewById(R.id.RecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdepter(getApplicationContext(),items));
    }
}
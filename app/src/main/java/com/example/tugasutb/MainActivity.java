package com.example.tugasutb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasutb.recyclerview.AdapterList;
import com.example.tugasutb.recyclerview.ItemList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ItemList> itemList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            itemList.add(new ItemList("Title "+i, "Description "+ i, "https://fakeimg.pl/600x400?text=Fake+"+ i));
        }

        AdapterList myAdapter = new AdapterList(itemList);
        recyclerView.setAdapter(myAdapter);
    }
}

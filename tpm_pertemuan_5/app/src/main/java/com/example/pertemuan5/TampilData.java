package com.example.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.pertemuan5.database.AppDatabase;
import com.example.pertemuan5.database.DataDiri;

public class TampilData extends AppCompatActivity {
    private AppDatabase appDatabase;
    private RecyclerView rc;

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);
        recyclerView = findViewById(R.id.list_data);
    }

    @Override
    protected void onResume() {
        super.onResume();
        read();
    }

    public void read(){
        Adapter adapter = new Adapter(appDatabase.dao().getData(), this);
        rc.setAdapter(adapter);
    }


}


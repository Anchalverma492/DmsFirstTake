package com.yoekisoft.myapplication123.firstActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.yoekisoft.myapplication123.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    Context context;
    List<RequisitionModel> datalist;

    RequistionAdapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    public static MainActivity instance;
    public static MainActivity getInstance(){
        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.requisition);
        instance = this;
        context = getApplicationContext();
        datalist = new ArrayList<>();
        RequisitionModel item = new RequisitionModel("123456", "22-02-2020", "asdfghj", "success", "12");
        RequisitionModel item1 = new RequisitionModel("1256", "72-02-2020", "cvbnm", "success", "2");
        datalist.add(item);
        datalist.add(item1);


//        recylerViewLayoutManager = new LinearLayoutManager(context);
//
//        recyclerView.setLayoutManager(recylerViewLayoutManager);

        recyclerViewAdapter = new RequistionAdapter(context, datalist);

        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

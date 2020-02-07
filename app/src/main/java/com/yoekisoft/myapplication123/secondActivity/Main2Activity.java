package com.yoekisoft.myapplication123.secondActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.yoekisoft.myapplication123.R;
import com.yoekisoft.myapplication123.firstActivity.MainActivity;
import com.yoekisoft.myapplication123.firstActivity.RequisitionModel;
import com.yoekisoft.myapplication123.firstActivity.RequistionAdapter;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    RecyclerView recyclerView;
    Context context;
    List<RequisitionitemModel> itemlist;

    RequisitionitemAdapter recycleritemAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    public static Main2Activity instance;

    public static Main2Activity getInstance() {
        return instance;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.requisitionTitle);
        recyclerView = findViewById(R.id.requisitionitem);
        instance = this;
        context = getApplicationContext();
        itemlist = new ArrayList<>();
        Intent i = getIntent();
        textView.setText(i.getStringExtra("RequestNo"));

        RequisitionitemModel item = new RequisitionitemModel("Anchalanchalanchal", "22-02-2020", "09876");
        RequisitionitemModel item1 = new RequisitionitemModel("Vermavermaverma", "72-02-2020", "12345");
        RequisitionitemModel item2 = new RequisitionitemModel("Vermavermaverma", "72-02-2020", "12345");

        itemlist.add(item);
        itemlist.add(item1);
        itemlist.add(item2);

        recycleritemAdapter = new RequisitionitemAdapter(context, itemlist);

        recyclerView.setAdapter(recycleritemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

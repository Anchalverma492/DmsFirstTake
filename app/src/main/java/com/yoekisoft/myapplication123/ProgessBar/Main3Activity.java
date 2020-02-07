package com.yoekisoft.myapplication123.ProgessBar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.wang.avi.AVLoadingIndicatorView;
import com.yoekisoft.myapplication123.R;

public class Main3Activity extends AppCompatActivity {

AVLoadingIndicatorView avi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        avi=findViewById(R.id.avi);
        avi.setIndicator("BallClipRotatePulseIndicator");
    }

    public void hideClick(View view) {
        avi.hide();

    }

    public void showClick(View view) {
        avi.show();

    }


}


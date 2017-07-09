package com.example.trantung.hocimagebuttonandimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton radRong, radZalo;
    ImageView imgHinh;

    ImageButton btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addContronls();
        addEvents();
    }

    private void addContronls() {
        radRong = (RadioButton) findViewById(R.id.radRong);
        radZalo = (RadioButton) findViewById(R.id.radZalo);
        imgHinh = (ImageView) findViewById(R.id.imgHinh);
        btnThoat = (ImageButton) findViewById(R.id.btnThoat);
    }

    private void addEvents() {
        radRong.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    imgHinh.setImageResource(R.drawable.rong);
                }
            }
        });
        radZalo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    imgHinh.setImageResource(R.drawable.zalo);
                }
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

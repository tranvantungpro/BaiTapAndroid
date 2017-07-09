package com.example.trantung.hoccackythuatxulysukien;

import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener{

    EditText txta, txtb;
    Button btnTru;

    Button btnNhan, btnChia, btnAn, btnThoat;

    View.OnClickListener suKienChiaSe = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
    }

    private void addControls() {
        txta= (EditText) findViewById(R.id.txta);
        txtb= (EditText) findViewById(R.id.txtb);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        btnAn = (Button) findViewById(R.id.btnAn);
        btnThoat = (Button) findViewById(R.id.btnThoat);
    }

    private void addEvent() {
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyPhepTru();
            }
        });

        suKienChiaSe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId()==R.id.btnNhan)
                {
                    xyLyPhepNhan();
                }
                if(v.getId()==R.id.btnChia)
                {
                    xyLyPhepChia();
                }
            }
        };

        btnNhan.setOnClickListener(suKienChiaSe);
        btnChia.setOnClickListener(suKienChiaSe);
        btnAn.setOnLongClickListener(this);
        btnThoat.setOnClickListener(new MyEvent());

    }

    private void xyLyPhepChia() {
        int a = Integer.parseInt(txta.getText().toString());
        int b = Integer.parseInt(txtb.getText().toString());
        int c = a/b;
        Toast.makeText(MainActivity.this, "Chia bang c: "+c, Toast.LENGTH_LONG).show();
    }

    private void xyLyPhepNhan() {
        int a = Integer.parseInt(txta.getText().toString());
        int b = Integer.parseInt(txtb.getText().toString());
        int c = a*b;
        Toast.makeText(MainActivity.this, "Nhan bang c: "+c, Toast.LENGTH_LONG).show();
    }

    public void xuLyPhepCong(View v)
    {
        int a = Integer.parseInt(txta.getText().toString());
        int b = Integer.parseInt(txtb.getText().toString());
        int c = a+b;
        Toast.makeText(MainActivity.this, "Tong bang c: "+c, Toast.LENGTH_LONG).show();
    }

    private void XuLyPhepTru() {
        int a = Integer.parseInt(txta.getText().toString());
        int b = Integer.parseInt(txtb.getText().toString());
        int c = a-b;
        Toast.makeText(MainActivity.this, "Tru bang c: "+c, Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onLongClick(View v) {

        if(v.getId()==R.id.btnAn)
        {
            btnAn.setVisibility(v.INVISIBLE);
        }
        return false;
    }

    public class MyEvent implements View.OnLongClickListener, View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.btnThoat)
                finish();
        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }
    }

    public void XuLyDoiManHinh(View v)
    {
        Button btnMoi = new Button(MainActivity.this)
        {
            @Override
            public boolean performClick() {

                setContentView(R.layout.activity_main);
                addControls();
                addEvent();


                return super.performClick();
            }
        };
        btnMoi.setText("Quay ve");
        btnMoi.setWidth(200);
        btnMoi.setHeight(200);

        setContentView(btnMoi);

    }
}

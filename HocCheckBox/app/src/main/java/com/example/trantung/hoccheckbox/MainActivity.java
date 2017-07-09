package com.example.trantung.hoccheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox chkAndroid, chkIOS, chkWin;
    Button btnChon;
    TextView txtMonHoc, txtMH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }


    private void addControls() {
        chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
        chkIOS = (CheckBox) findViewById(R.id.chkIOS);
        chkWin = (CheckBox) findViewById(R.id.chkWin);
        txtMonHoc= (TextView) findViewById(R.id.txtMonHoc);
        txtMH = (TextView) findViewById(R.id.txtMH);
        btnChon = (Button) findViewById(R.id.btnChon);

    }

    private void addEvents() {
        btnChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyMonHoc();
            }
        });
    }

    private void XuLyMonHoc() {
        String s="";
        if(chkAndroid.isChecked())
        {
            s+=chkAndroid.getText().toString()+"\n";
        }
        if(chkWin.isChecked())
        {
            s+=chkWin.getText().toString()+"\n";
        }
        if(chkIOS.isChecked())
        {
            s+=chkIOS.getText().toString();
        }
        txtMonHoc.setText(s);
        txtMH.setText(s);
    }
}

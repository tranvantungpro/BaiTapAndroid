package com.example.trantung.hocradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radRTV, radTV, radBTH;
    Button btnBinhChon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addControls() {

        radBTH = (RadioButton) findViewById(R.id.radBTH);
        radRTV = (RadioButton) findViewById(R.id.radRTV);
        radTV = (RadioButton) findViewById(R.id.radTV);

        btnBinhChon = (Button) findViewById(R.id.btnBinhChon);
    }

    private void addEvents() {
        btnBinhChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyBinhChon();
            }
        });
    }

    private void XuLyBinhChon() {
        String s="";
        if(radRTV.isChecked())
        {
            s=radRTV.getText().toString();
        }
        else if (radTV.isChecked()  )
        {
            s=radTV.getText().toString();
        }
        else
            if(radBTH.isChecked())
            {
                s=radBTH.getText().toString();
            }
        Toast.makeText(MainActivity.this, "ban chon: "+s,Toast.LENGTH_LONG).show();
    }
}

package com.example.aderahmatn.kalkulator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nilai1 = (EditText) findViewById(R.id.textNilai1);
        final TextView viewHasil = (TextView) findViewById(R.id.viewHasil);
        Button tambah = (Button) findViewById(R.id.buttonTambah);
        tambah.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                int n1 = Integer.parseInt(nilai1.getText().toString());

                int m;      // m for square of the n
                int a;      // a for taking reminder
                int s=0;    // for summation

                m=n1*n1;      // Squaring of the number n
                while(m!=0)
                {
                    a=m%10; // Claculating reminder
                    s=s+a;  // adding the reminder to s
                    m=m/10; // Integer division to truncate the last digit
                }
                if(s == n1)  // Checking the original number to the summation
                {

                    viewHasil.setText(String.valueOf("Neon Number"));

                }
                else
                {
                    viewHasil.setText(String.valueOf("Bukan Neon Number"));
                }
            }
        });
    }
}
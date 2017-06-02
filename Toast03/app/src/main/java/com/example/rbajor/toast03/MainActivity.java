package com.example.rbajor.toast03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Today is Wednesday",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"It is January",
                Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"It is the eleventh",
                Toast.LENGTH_LONG).show();

    }
}

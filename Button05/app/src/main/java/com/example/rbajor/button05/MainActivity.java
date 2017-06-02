package com.example.rbajor.button05;

import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button) findViewById(R.id.buttonMyButton01);
        buttonObject01.setText("PRESS ME!");
        buttonObject01.setOnClickListener(this);
        buttonObject01.setBackgroundColor(Color.rgb(66, 176, 244));

        Button buttonObject02 = (Button) findViewById(R.id.button02);
        buttonObject02.setText("I am a button");
        buttonObject02.setOnClickListener(this);
        buttonObject02.setBackgroundColor(Color.rgb(141, 40, 150));

        Button buttonObject03 = (Button) findViewById(R.id.button03);
        buttonObject03.setText("I am the best button");
        buttonObject03.setOnClickListener(this);
        buttonObject03.setBackgroundColor(Color.rgb(40, 130, 150));

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.buttonMyButton01)
        {
            Toast.makeText(this, "You pressed me!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You pressed me!");
        }
        if (view.getId() == R.id.button02)
        {
            Toast.makeText(this, "You pressed button02!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You pressed button02!");
        }
        if (view.getId() == R.id.button03)
        {
            Toast.makeText(this, "You pressed the best button!", Toast.LENGTH_SHORT).show();
            Log.i("info", "You pressed the best button!");
        }
    }
}

package com.example.rbajor.button03;

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

        Button buttonObject02 = (Button) findViewById(R.id.button02);
        buttonObject02.setText("I am a button");
        buttonObject02.setOnClickListener(this);

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
}
}

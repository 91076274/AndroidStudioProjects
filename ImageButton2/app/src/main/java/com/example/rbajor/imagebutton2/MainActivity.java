package com.example.rbajor.imagebutton2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static com.example.rbajor.imagebutton2.R.id.button1;
import static com.example.rbajor.imagebutton2.R.id.button2;
import static com.example.rbajor.imagebutton2.R.id.button3;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton buttonObject1 = (ImageButton)findViewById(R.id.button1);
        buttonObject1.setOnClickListener(this);

        ImageButton buttonObject2 = (ImageButton)findViewById(R.id.button2);
        buttonObject2.setOnClickListener(this);

        ImageButton buttonObject3 = (ImageButton)findViewById(R.id.button3);
        buttonObject3.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if (view.getId()==button1)
        {
            Log.i("info","You pressed the right arrow");
            Toast.makeText(this, "You pressed the right arrow", Toast.LENGTH_SHORT).show();

        }
        if (view.getId()== button2)
        {
            Log.i("info","You pressed the stop sign");
            Toast.makeText(this, "You pressed the stop sign", Toast.LENGTH_SHORT).show();

        }
        if (view.getId()== button3)
        {
            Log.i("info","You pressed the left arrow");
            Toast.makeText(this, "You pressed the left arrow", Toast.LENGTH_SHORT).show();

        }
    }
}

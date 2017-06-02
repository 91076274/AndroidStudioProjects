package com.example.rbajor.imageview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView buttonObject1 = (ImageView) findViewById(R.id.image1);
        buttonObject1.setOnClickListener(this);

        ImageView buttonObject2 = (ImageView) findViewById(R.id.image2);
        buttonObject2.setOnClickListener(this);

        ImageView buttonObject3 = (ImageView) findViewById(R.id.image3);
        buttonObject3.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if (view.getId() == R.id.image1)
        {
            Log.i("info", "Welcome to your contacts");
            Toast.makeText(this, "Welcome to your contacts", Toast.LENGTH_SHORT).show();
        }
        if (view.getId() == R.id.image2)
        {
            Log.i("info", "Welcome to your email");
            Toast.makeText(this, "Welcome to your email", Toast.LENGTH_SHORT).show();
        }
        if (view.getId()== R.id.image3)
        {
            Log.i("info", "Welcome to your messages");
            Toast.makeText(this, "Welcome to your messages", Toast.LENGTH_SHORT).show();
        }
    }
}

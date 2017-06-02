package com.example.rbajor.buttonchallenge1;

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

        Button buttonObject1 = (Button) findViewById(R.id.button1);
        buttonObject1.setText("Contacts");
        buttonObject1.setBackgroundColor(0xff0000ff);
        buttonObject1.setOnClickListener(this);

        Button buttonObject2 = (Button) findViewById(R.id.button2);
        buttonObject2.setText("Email");
        buttonObject2.setBackgroundColor(0xff888888);
        buttonObject2.setOnClickListener(this);

        Button buttonObject3 = (Button) findViewById(R.id.button3);
        buttonObject3.setText("Messages");
        buttonObject3.setBackgroundColor(0xffff0000);
        buttonObject3.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.button1 )
        {
            Toast.makeText(this, "This is your contacts", Toast.LENGTH_SHORT).show();
            Log.i("info", "This is your contacts");
        }
        if(view.getId() == R.id.button2 )
        {
            Toast.makeText(this, "This is your email", Toast.LENGTH_SHORT).show();
            Log.i("info", "This is your email");
        }
        if(view.getId() == R.id.button3)
        {
            Toast.makeText(this, "This is your messages", Toast.LENGTH_SHORT).show();
            Log.i("info", "This is your messages");
        }
    }
}

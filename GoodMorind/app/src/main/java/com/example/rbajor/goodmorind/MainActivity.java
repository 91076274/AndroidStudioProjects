package com.example.rbajor.goodmorind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textView_sayHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button JasmineElizalde = (Button) findViewById(R.id.button);
        textView_sayHello = (TextView) findViewById(R.id.textView_sayHello);
        JasmineElizalde.setOnClickListener(this);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.button)
        {
            textView_sayHello.setText("Hi");
        }

    }
}

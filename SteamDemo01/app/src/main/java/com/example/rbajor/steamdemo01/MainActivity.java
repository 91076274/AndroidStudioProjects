package com.example.rbajor.steamdemo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

         textView = (TextView)findViewById(R.id.textView);
    }
    public void onClick(View view)
    {
        textView.setText("YOU HAVE PRESSED A GLORIOUS BUTTON");
    }
}

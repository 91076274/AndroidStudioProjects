package com.example.rbajor.mathfestival2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        textView =(TextView) findViewById(R.id.textView);
        button.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.button)
        {
            textView.setText("HI");
        }
    }
}

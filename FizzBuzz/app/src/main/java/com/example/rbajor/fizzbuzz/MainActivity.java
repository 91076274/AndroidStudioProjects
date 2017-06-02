package com.example.rbajor.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    TextView textView = (TextView) findViewById(R.id.textView);
    EditText et = (EditText) findViewById(R.id.edittextid);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer.valueOf(EditText.getText());

//        if( i++ % 3 == 0)
//        {
//            textView.setText("Fizz");
//        }
//        if(i++ % 5 == 0)
//        {
//            textView.setText("Buzz");
//
//        }
//        if(i++ % 3 == 0 && i++ % 5 ==0)
//        {
//            textView.setText("FizzBuzz");
//
//        }
    }
}

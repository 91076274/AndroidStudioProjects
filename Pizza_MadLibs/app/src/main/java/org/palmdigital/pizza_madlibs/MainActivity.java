package org.palmdigital.pizza_madlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText)findViewById(R.id.editText);
        EditText editText2 = (EditText)findViewById(R.id.editText2);
        EditText editText3 = (EditText)findViewById(R.id.editText3);
        EditText editText4 = (EditText)findViewById(R.id.editText4);
        EditText editText5 = (EditText)findViewById(R.id.editText5);
        EditText editText6 = (EditText)findViewById(R.id.editText6);
        EditText editText7 = (EditText)findViewById(R.id.editText7);
        EditText editText8 = (EditText)findViewById(R.id.editText8);
        String editText1 = editText.getText().toString();
        char aan = editText1.charAt(0);

        textView = (TextView)findViewById(R.id.textView);
        if (aan == 'a'|| aan == 'e'||aan == 'i'||aan == 'o'||aan == 'u')
        {
            textView.setText("Pizza was invented by an " + editText.getText().toString() + " " + editText2.getText().toString() + " chef named " + editText3.getText().toString() + ". To make a pizza, you need to take a lump of " + editText4.getText().toString() + " and make a thin round " + editText5.getText().toString() + " " + editText6.getText().toString() + ". Then you cover it with " + editText7.getText().toString() + " sauce and " + editText8.getText().toString() + " cheese.");
        }
        else
        {
            textView.setText("Pizza was invented by a " + editText.getText().toString() + " " + editText2.getText().toString() + " chef named " + editText3.getText().toString() + ". To make a pizza, you need to take a lump of " + editText4.getText().toString() + " and make a thin round " + editText5.getText().toString() + " " + editText6.getText().toString() + ". Then you cover it with " + editText7.getText().toString() + " sauce and " + editText8.getText().toString() + " cheese.");
        }

    }
}

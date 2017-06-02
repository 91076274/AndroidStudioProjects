package org.palmdigital.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editText = (EditText)findViewById(R.id.editText);
         textView = (TextView)findViewById(R.id.textView_output);

    }
    public void getAnswer(View view)
    {
        String str_editText = editText.getText().toString();
        int input = Integer.parseInt(str_editText);

        if (input%3 ==0)
        {
            if (input%5==0)
            {
                textView.setText("FizzBuzz");
            }
            else
            {
                textView.setText("Fizz");
            }
        }
        else if(input%5==0)
        {
            textView.setText("Buzz");
        }
        else
        {
            textView.setText(str_editText);
        }
    }
}

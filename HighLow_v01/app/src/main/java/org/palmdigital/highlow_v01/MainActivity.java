package org.palmdigital.highlow_v01;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Random number = new Random();
    int num = number.nextInt(100) + 1;
    TextView output;
    String sInput;
    int iInput;
    Button check;
    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(clicks>8)
        {
            check=(Button)findViewById(R.id.buttonCheck);
            check.setEnabled(false);
        }


    }
    public void newGame(View view)
    {
        Random number = new Random();
        num = number.nextInt(100) + 1;
        output.setText("");
        iInput=0;

    }
    public void check(View view)
    {
        clicks++;

        output=(TextView) findViewById(R.id.textViewHighLow);
        EditText input = (EditText) findViewById(R.id.editTextInput);

         sInput = input.getText().toString();
        if(sInput.isEmpty())
        {
            iInput=0;
        }
        else
        {
            iInput = Integer.parseInt(sInput);
        }
        if(iInput<1||iInput>99)
        {
            output.setText("Please Enter a Valid Number");
        }
        else
        {
                if (iInput == num)
                {
                    output.setText("You won!");
                }
                else if (iInput > num)
                {
                    output.setText("Too High!");
                }
                else if (iInput < num)
                {
                    output.setText("Too Low!");
                }


        }
    }
}


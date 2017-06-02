package org.palmdigital.puppy_love_madlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);
        editText5 = (EditText)findViewById(R.id.editText5);
        editText6 = (EditText)findViewById(R.id.editText6);
        editText7 = (EditText)findViewById(R.id.editText7);
        editText8 = (EditText)findViewById(R.id.editText8);
        editText9 = (EditText)findViewById(R.id.editText9);

        textView = (TextView)findViewById(R.id.textView10);


    }
    public void onClick(View view)
    {
        textView.setText("Today I saw him again. When he looks at me with those "+editText1.getText().toString() + " eyes, it makes my "+editText2.getText().toString()+" go pitterpat, and I feel as if I have "+editText3.getText().toString()+" in my stomach. When he scrunches his nose, I want to "+ editText4.getText().toString()+" him softly. He is so "+ editText5.getText().toString()+" and "+editText6.getText().toString()+ ". Tomorrow he will be mine. For now he "+ editText7.getText().toString()+ " in the store "+editText8.getText().toString()+" looking at me. "+ editText9.getText().toString()+" love is hard to resist!");
    }
}

package org.palmdigital.intentputextra1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    String newString;
    String newString2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView textViewStory2 = (TextView)findViewById(R.id.textViewStory2);
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if(extras == null)
            {
                //newString = null;
                newString2 = null;
            }
            else
            {
                //newString=extras.getString("STORY_SO_FAR");
                newString2 = extras.getString("STORY_SO_FAR2");
            }
        }
        else
        {
            //newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
            newString2 = (String) savedInstanceState.getSerializable("STORY_SO_FAR2");
        }
        textViewStory2.setText( newString2);
    }
}

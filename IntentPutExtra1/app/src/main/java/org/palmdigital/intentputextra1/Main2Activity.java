package org.palmdigital.intentputextra1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        if (savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if(extras == null)
            {
                newString = null;
                //newString2 = null;
            }
            else
            {
                newString=extras.getString("STORY_SO_FAR");
                //newString2 = extras.getString("STORY_SO_FAR2");
            }
        }
        else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
            //newString2 = (String) savedInstanceState.getSerializable("STORY_SO_FAR2");
        }
        //textViewStory2.setText(newString + newString2);

    }
    public void next02(View view)
    {
        EditText adj2 =(EditText)findViewById(R.id.adj2);
        EditText verb2 =(EditText)findViewById(R.id.verb2);
        EditText noun2 =(EditText)findViewById(R.id.noun2);
        EditText noun3 =(EditText)findViewById(R.id.noun3);
        String sAdj2 = adj2.getText().toString();
        String sVerb2 = verb2.getText().toString();
        String sNoun2 = noun2.getText().toString();
        String sNoun3 = noun3.getText().toString();
        String story2 = newString+ " and "+sAdj2+". Tommarow he will be mine. For now he "+sVerb2+" in the store "+sNoun2+" looking at me. "+sNoun3+" love is hard to resist!";
        Intent b = new Intent(this,Main3Activity.class);
        b.putExtra("STORY_SO_FAR2",story2);
        startActivity(b);
    }
}

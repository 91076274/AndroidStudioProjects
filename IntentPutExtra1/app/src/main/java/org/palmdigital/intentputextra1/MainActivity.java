package org.palmdigital.intentputextra1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void next01(View view)
    {
        EditText color =(EditText)findViewById(R.id.color);
        EditText bodyPart =(EditText)findViewById(R.id.bodyPart);
        EditText nouns =(EditText)findViewById(R.id.nouns);
        EditText verb =(EditText)findViewById(R.id.verb);
        EditText adjective =(EditText)findViewById(R.id.adjective);
        String sColor = color.getText().toString();
        String sBodyPart = bodyPart.getText().toString();
        String sNouns = nouns.getText().toString();
        String sVerb = verb.getText().toString();
        String sAdjective = adjective.getText().toString();

        String story = "Today I saw him again. When he looks at me with those " + sColor + " eyes, it makes my "+sBodyPart +" go pitterpat, and I feel as if I have "+sNouns+" in my stomach. When he scrunches his nose, I want to "+ sVerb+" him softly. He is so "+sAdjective;
        //ntent i = new Intent(this,Main3Activity.class);
        Intent a = new Intent(this,Main2Activity.class);
        a.putExtra("STORY_SO_FAR",story);
        startActivity(a);
    }
}

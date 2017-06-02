package com.example.rbajor.chooseadventurev1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView_story = (TextView) findViewById(R.id.textView_story);
        TextView textView_question = (TextView) findViewById(R.id.textView_question);

        Button buttonLeft = (Button) findViewById(R.id.button_left);
        Button buttonRight = (Button) findViewById(R.id.button_right);

        buttonLeft.setOnClickListener(this);
        buttonRight.setOnClickListener(this);

        textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
        textView_question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");

        buttonLeft.setText("Backyard");
        buttonRight.setText("Toilet");
    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.button_left)
        {
            //Intent i = new Intent(this,ToiletActivity.class);
            //startActivity(i);
        }
        if(view.getId() == R.id.button_right)
        {
            //Intent i = new Intent(this,BackyardActivity.class);
            //startActivity(i);
        }
    }
}

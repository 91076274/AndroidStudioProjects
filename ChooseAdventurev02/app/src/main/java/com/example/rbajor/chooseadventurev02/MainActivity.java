package com.example.rbajor.chooseadventurev02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView_story;
    TextView textView_question;
    Button buttonLeft;
    Button buttonRight;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_story = (TextView) findViewById(R.id.textView_story);
        textView_question = (TextView) findViewById(R.id.textView_question);
        buttonLeft = (Button) findViewById(R.id.button_left);
        buttonRight = (Button) findViewById(R.id.button_right);
        buttonLeft.setOnClickListener(this);
        buttonRight.setOnClickListener(this);
        textView_story.setText("One morning the Tortoise woke up in a dream.");
        textView_question.setText("Do you want to 'wake up' or 'explore' the dream?");
        buttonLeft.setText("Wake Up");
        buttonRight.setText("Explore");
        i = 1;
    }

    public void onClick(View view) {
        if (view.getId() == R.id.button_left && i == 1) {
            //wake up
            textView_story.setText("You wake up and have a boring day. The end.");
            textView_question.setText("");
            buttonLeft.setText("");
            buttonRight.setText("");
            buttonLeft.setVisibility(View.INVISIBLE);
            buttonRight.setVisibility(View.INVISIBLE);
        }
       else if(view.getId() == R.id.button_right && i == 1){
            //explore
            i=2;
            textView_story.setText("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
            textView_question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
            buttonLeft.setText("Backyard");
            buttonRight.setText("Toilet");
        }
        if (view.getId() == R.id.button_left && i == 2) {//backyard
            textView_story.setText("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
            textView_question.setText("As the man starts to prepare you as soup, do you... 'Scream' or 'Faint'?");
            buttonLeft.setText("Scream");
            buttonRight.setText("Faint");
        }
       else if (view.getId() == R.id.button_right && i == 2) {//toilet
            textView_story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
            textView_question.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
            buttonLeft.setText("Yes");
            buttonRight.setText("HECK YES");
            i=3;
//             if( i == 3) {
//                textView_story.setText("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
//                textView_question.setText("");
//                buttonLeft.setText("");
//                buttonRight.setText("");
//            }
        }

    }
}








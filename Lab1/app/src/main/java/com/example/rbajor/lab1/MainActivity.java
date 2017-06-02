package com.example.rbajor.lab1;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView questionTextview=(TextView) findViewById(R.id.question_text);
        final RadioButton option1RadioButton= (RadioButton) findViewById(R.id.Option_1);
        final RadioButton option2RadioButton= (RadioButton) findViewById(R.id.Option_2);
        final RadioButton option3RadioButton= (RadioButton) findViewById(R.id.Option_3);
        final RadioButton option4RadioButton= (RadioButton) findViewById(R.id.Option_4);

        Button submitButton= (Button) findViewById(R.id.submit_button);

        final Question question= new Question("What is the square root of 18?","3","4","5","6","4");
        questionTextview.setText(question.getQuestionText());

        option1RadioButton.setText(question.getOption1());
        option2RadioButton.setText(question.getOption2());
        option3RadioButton.setText(question.getOption3());
        option4RadioButton.setText(question.getOption4());

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedAnswer = "";
                if (option1RadioButton.isChecked()) {
                    selectedAnswer = option1RadioButton.getText().toString();
                } else if (option2RadioButton.isChecked()) {
                    selectedAnswer = option2RadioButton.getText().toString();
                } else if (option3RadioButton.isChecked()) {
                    selectedAnswer = option3RadioButton.getText().toString();
                } else if (option4RadioButton.isChecked()) {
                    selectedAnswer = option4RadioButton.getText().toString();
                }

                boolean isCorrect = question.isCorrect(selectedAnswer);

                Toast.makeText(v.getContext(),
                        isCorrect? "Your answer is correct.":"Your Answer is wrong",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
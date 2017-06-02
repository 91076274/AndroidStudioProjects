package com.example.rbajor.simplecalculator02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.rbajor.simplecalculator02.R.id.imageView11;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
        {
            TextView textViewDisplayTop1;
            TextView textViewDisplayTop2;
            TextView textViewDisplayTop3;

            double num1,num2;
            double total;
            ImageView imageView11;
            ImageView imageView12;
            ImageView imageView24;
            ImageView imageView25;
            int p;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
        ImageView imageView02 = (ImageView) findViewById(R.id.imageView02);
        ImageView imageView03 = (ImageView) findViewById(R.id.imageView03);
        ImageView imageView04 = (ImageView) findViewById(R.id.imageView04);
        ImageView imageView05 = (ImageView) findViewById(R.id.imageView05);
        ImageView imageView06 = (ImageView) findViewById(R.id.imageView06);
        ImageView imageView07 = (ImageView) findViewById(R.id.imageView07);
        ImageView imageView08 = (ImageView) findViewById(R.id.imageView08);
        ImageView imageView09 = (ImageView) findViewById(R.id.imageView09);
        ImageView imageView10 = (ImageView) findViewById(R.id.imageView10);
        imageView11 = (ImageView) findViewById(R.id.imageView11);
        imageView12 = (ImageView) findViewById(R.id.imageView12);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageView13);
        ImageView imageView14 = (ImageView) findViewById(R.id.imageView14);
        ImageView imageView15 = (ImageView) findViewById(R.id.imageView15);
        ImageView imageView16 = (ImageView) findViewById(R.id.imageView16);
        ImageView imageView17 = (ImageView) findViewById(R.id.imageView17);
        ImageView imageView18 = (ImageView) findViewById(R.id.imageView18);
        ImageView imageView19 = (ImageView) findViewById(R.id.imageView19);
        ImageView imageView20 = (ImageView) findViewById(R.id.imageView20);
        ImageView imageView21 = (ImageView) findViewById(R.id.imageView21);
        ImageView imageView22 = (ImageView) findViewById(R.id.imageView22);
        ImageView imageView23 = (ImageView) findViewById(R.id.imageView23);
        imageView24 = (ImageView) findViewById(R.id.imageView24);
        imageView25 = (ImageView) findViewById(R.id.imageView25);


        TextView textView1 = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView3);
        TextView textView3 = (TextView) findViewById(R.id.textView4);



        imageView01.setOnClickListener(this);
        imageView02.setOnClickListener(this);
        imageView03.setOnClickListener(this);
        imageView04.setOnClickListener(this);
        imageView05.setOnClickListener(this);
        imageView06.setOnClickListener(this);
        imageView07.setOnClickListener(this);
        imageView08.setOnClickListener(this);
        imageView09.setOnClickListener(this);
        imageView10.setOnClickListener(this);
        imageView11.setOnClickListener(this);
        imageView12.setOnClickListener(this);
        imageView13.setOnClickListener(this);
        imageView14.setOnClickListener(this);
        imageView15.setOnClickListener(this);
        imageView16.setOnClickListener(this);
        imageView17.setOnClickListener(this);
        imageView18.setOnClickListener(this);
        imageView19.setOnClickListener(this);
        imageView20.setOnClickListener(this);
        imageView21.setOnClickListener(this);
        imageView22.setOnClickListener(this);
        imageView23.setOnClickListener(this);
        imageView24.setOnClickListener(this);
        imageView25.setOnClickListener(this);

        textViewDisplayTop1 = (TextView) findViewById(R.id.textView);
        textViewDisplayTop2 = (TextView) findViewById(R.id.textView3);
        textViewDisplayTop3 = (TextView) findViewById(R.id.textView4);

        imageView11.setBackgroundColor(0);
        imageView12.setBackgroundColor(0);
        imageView24.setBackgroundColor(0);
        imageView25.setBackgroundColor(0);
    }
    public void onClick(View view)

    {


            if (view.getId() == R.id.imageView01) {
                textViewDisplayTop1.setText("0");
                num1 = 0;
            }
            if (view.getId() == R.id.imageView02) {
                textViewDisplayTop1.setText("1");
                num1 = 1;
            }
            if (view.getId() == R.id.imageView03) {
                textViewDisplayTop1.setText("2");
                num1 = 2;
            }
            if (view.getId() == R.id.imageView04) {
                textViewDisplayTop1.setText("3");
                num1 = 3;
            }
            if (view.getId() == R.id.imageView05) {
                textViewDisplayTop1.setText("4");
                num1 = 4;
            }
            if (view.getId() == R.id.imageView06) {
                textViewDisplayTop1.setText("5");
                num1 = 5;
            }
            if (view.getId() == R.id.imageView07) {
                textViewDisplayTop1.setText("6");
                num1 = 6;
            }
            if (view.getId() == R.id.imageView08) {
                textViewDisplayTop1.setText("7");
                num1 = 7;
            }
            if (view.getId() == R.id.imageView09) {
                textViewDisplayTop1.setText("8");
                num1 = 8;
            }
            if (view.getId() == R.id.imageView10) {
                textViewDisplayTop1.setText("9");
                num1 = 9;
            }
            if (view.getId() == R.id.imageView11) {
                p = 0;
                colors(p);

            }
            if (view.getId() == R.id.imageView12) {
                p = 1;
                colors(p);

            }
            if (view.getId() == R.id.imageView24) {
                p = 2;
                colors(p);
            }
            if (view.getId() == R.id.imageView25) {
                p = 3;
                colors(p);
            }
            if (view.getId() == R.id.imageView13) {
                textViewDisplayTop2.setText("0");
                num2 = 0;
            }
            if (view.getId() == R.id.imageView14) {
                textViewDisplayTop2.setText("1");
                num2 = 1;
            }
            if (view.getId() == R.id.imageView15) {
                textViewDisplayTop2.setText("2");
                num2 = 2;
            }
            if (view.getId() == R.id.imageView16) {
                textViewDisplayTop2.setText("3");
                num2 = 3;
            }
            if (view.getId() == R.id.imageView17) {
                textViewDisplayTop2.setText("4");
                num2 = 4;
            }
            if (view.getId() == R.id.imageView18) {
                textViewDisplayTop2.setText("5");
                num2 = 5;
            }
            if (view.getId() == R.id.imageView19) {
                textViewDisplayTop2.setText("6");
                num2 = 6;
            }
            if (view.getId() == R.id.imageView20) {
                textViewDisplayTop2.setText("7");
                num2 = 7;
            }
            if (view.getId() == R.id.imageView21) {
                textViewDisplayTop2.setText("8");
                num2 = 8;
            }
            if (view.getId() == R.id.imageView22) {
                textViewDisplayTop2.setText("9");
                num2 = 9;
            }
       if (num2 == 0)
       {
               textViewDisplayTop3.setText("Error");
            }
            if (view.getId() == R.id.imageView23) {
                if(p == 0)
                {
                    total = num1 + num2;
            }
               else if(p == 1)
                {
                    total = num1 - num2;
                }
                else if(p == 2)
                {
                    total = num1 * num2;
                }
                else if(p == 3)
                {
                    total = num1 / num2;
                }
                textViewDisplayTop3.setText(total + "");
            }
        }
            public void colors(int p )
            {
                if(p == 0)
                {
                    imageView11.setBackgroundColor(0xff444444);
                    imageView24.setBackgroundColor(0);
                    imageView12.setBackgroundColor(0);
                    imageView25.setBackgroundColor(0);

                }
                else if(p == 1)
                {
                    imageView12.setBackgroundColor(0xff444444);
                    imageView11.setBackgroundColor(0);
                    imageView24.setBackgroundColor(0);
                    imageView25.setBackgroundColor(0);

                }
                else if(p == 2)
                {
                    imageView24.setBackgroundColor(0xff444444);
                    imageView11.setBackgroundColor(0);
                    imageView12.setBackgroundColor(0);
                    imageView25.setBackgroundColor(0);

                }
                else if(p == 3)
                {
                    imageView25.setBackgroundColor(0xff444444);
                    imageView11.setBackgroundColor(0);
                    imageView12.setBackgroundColor(0);
                    imageView24.setBackgroundColor(0);

                }
            }
}

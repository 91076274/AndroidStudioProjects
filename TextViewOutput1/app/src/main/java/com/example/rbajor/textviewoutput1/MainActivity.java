package com.example.rbajor.textviewoutput1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
TextView textViewDisplayTop;
    int image1 = 0,image2 = 0, total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);

    }
    public void onClick(View view)
    {

        textViewDisplayTop = (TextView) findViewById(R.id.textView);
        if(view.getId()==R.id.imageView1)
        {
            // Toast.makeText(this, "You clicked 1", Toast.LENGTH_SHORT).show();
            textViewDisplayTop.setText("1");
             image1 = 1;
        }
         else if(view.getId()==R.id.imageView2)
        {
            textViewDisplayTop.setText("2");
             image1 = 2;
        }
        else if(view.getId()==R.id.imageView3)
        {
            textViewDisplayTop.setText("3");
             image1 = 3;
        }
        textViewDisplayTop = (TextView) findViewById(R.id.textView2);
        if(view.getId()==R.id.imageView4)
        {

        }
        else if(view.getId() ==R.id.imageView5)
        {
            textViewDisplayTop.setText("4");
             image2 = 4;
        }
        else if(view.getId()==R.id.imageView6)
        {
            textViewDisplayTop.setText("5");
            image2 = 5;
        }
        else if(view.getId()==R.id.imageView7)
        {
            textViewDisplayTop.setText("6");
            image2 = 6;
        }
        textViewDisplayTop = (TextView) findViewById(R.id.textView3);
        if(view.getId()==R.id.imageView8)
        {
            total = image1 + image2;
           textViewDisplayTop.setText("" + total);
        }
    }
}

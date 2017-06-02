package com.example.rbajor.simplecalculator04;

        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;

        import org.w3c.dom.Text;

        import static com.example.rbajor.simplecalculator04.R.id.imageView00;
        import static com.example.rbajor.simplecalculator04.R.id.imageViewClear;
        import static com.example.rbajor.simplecalculator04.R.id.imageViewPlus;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView textViewDisplayTop1;
    TextView textViewDisplayTop2;
    TextView textViewDisplayTop3;
    double total;
    ImageView imageViewPlus;
    ImageView imageViewminus;
    ImageView imageViewMultiply;
    ImageView imageViewDivide;
    ImageView imageViewClear;
    String imageView00;
    String imageView01;
    String imageView02;
    String imageView03;
    String imageView04;
    String imageView05;
    String imageView06;
    String imageView07;
    String imageView08;
    String imageView09;
    String imageView0;
    String imageView1;
    String imageView2;
    String imageView3;
    String imageView4;
    String imageView5;
    String imageView6;
    String imageView7;
    String imageView8;
    String imageView9;
    String imageViewEquals;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    int p;
    String num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView00 = (ImageView) findViewById(R.id.imageView00);
        ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
        ImageView imageView02 = (ImageView) findViewById(R.id.imageView02);
        ImageView imageView03 = (ImageView) findViewById(R.id.imageView03);
        ImageView imageView04 = (ImageView) findViewById(R.id.imageView04);
        ImageView imageView05 = (ImageView) findViewById(R.id.imageView05);
        ImageView imageView06 = (ImageView) findViewById(R.id.imageView06);
        ImageView imageView07 = (ImageView) findViewById(R.id.imageView07);
        ImageView imageView08 = (ImageView) findViewById(R.id.imageView08);
        ImageView imageView09 = (ImageView) findViewById(R.id.imageView09);
        imageViewPlus = (ImageView) findViewById(R.id.imageViewPlus);
        imageViewminus = (ImageView) findViewById(R.id.imageViewminus);
        imageViewMultiply = (ImageView) findViewById(R.id.imageViewMultiply);
        imageViewDivide = (ImageView) findViewById(R.id.imageViewDivide);
        ImageView imageView0 = (ImageView) findViewById(R.id.imageView0);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageView9);
        ImageView imageViewEquals = (ImageView) findViewById(R.id.imageViewEquals);
        imageViewClear = (ImageView) findViewById(R.id.imageViewClear);



        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);



        imageView00.setOnClickListener(this);
        imageView01.setOnClickListener(this);
        imageView02.setOnClickListener(this);
        imageView03.setOnClickListener(this);
        imageView04.setOnClickListener(this);
        imageView05.setOnClickListener(this);
        imageView06.setOnClickListener(this);
        imageView07.setOnClickListener(this);
        imageView08.setOnClickListener(this);
        imageView09.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
        imageViewminus.setOnClickListener(this);
        imageViewMultiply.setOnClickListener(this);
        imageViewDivide.setOnClickListener(this);
        imageView0.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);
        imageView9.setOnClickListener(this);
        imageViewEquals.setOnClickListener(this);
        imageViewClear.setOnClickListener(this);


        textViewDisplayTop1 = (TextView) findViewById(R.id.textView1);
        textViewDisplayTop2 = (TextView) findViewById(R.id.textView2);
        textViewDisplayTop3 = (TextView) findViewById(R.id.textView3);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.imageView00)
        {
            imageView00 = "0";
            num1 = num1 + imageView00;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView01)
        {
            imageView01 = "1";
            num1 = num1 + imageView01;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView02)
        {
            imageView02 = "2";
            num1 = num1 + imageView02;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView03)
        {
            imageView03 = "3";
            num1 = num1 + imageView03;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView04)
        {
            imageView04 = "4";
            num1 = num1 + imageView04;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView05)
        {
            imageView05 = "5";
            num1 = num1 + imageView05;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView06)
        {
            imageView06 = "6";
            num1 = num1 + imageView06;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView07)
        {
            imageView07 = "7";
            num1 = num1 + imageView07;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView08)
        {
            imageView08 = "8";
            num1 = num1 + imageView08;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageView09)
        {
            imageView09 = "9";
            num1 = num1 + imageView09;
            textViewDisplayTop1.setText(num1);
        }
        if (view.getId() == R.id.imageViewPlus) {
            p = 0;
            colors(p);
        }
        if (view.getId() == R.id.imageViewminus) {
            p = 1;
            colors(p);
        }
        if (view.getId() == R.id.imageViewMultiply) {
            p = 2;
            colors(p);
        }
        if (view.getId() == R.id.imageViewDivide) {
            p = 3;
            colors(p);
        }
        if (view.getId() == R.id.imageViewClear)
        {
            p = 4;
            colors(p);
            textViewDisplayTop1.setText("");
            textViewDisplayTop2.setText("");
            textViewDisplayTop3.setText("");
        }
        if (view.getId() == R.id.imageView0)
        {
            imageView0 = "0";
            num2 = num2 + imageView0;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView1)
        {
            imageView1 = "1";
            num2 = num2 + imageView1;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView2)
        {
            imageView2 = "2";
            num2 = num2 + imageView2;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView3)
        {
            imageView3 = "3";
            num2 = num2 + imageView3;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView4)
        {
            imageView4 = "4";
            num2 = num2 + imageView4;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView5)
        {
            imageView5 = "5";
            num2 = num2 + imageView5;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView6)
        {
            imageView6 = "6";
            num2 = num2 + imageView6;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView7)
        {
            imageView7 = "7";
            num2 = num2 + imageView7;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView8)
        {
            imageView8 = "8";
            num2 = num2 + imageView8;
            textViewDisplayTop2.setText(num2);
        }
        if (view.getId() == R.id.imageView9)
        {
            imageView9 = "9";
            num2 = num2 + imageView9;
            textViewDisplayTop2.setText(num2);
        }

        if (view.getId() == R.id.imageViewEquals)
        {
           opperator(p);
        }
    }
    public void colors(int p ) {
        if (p == 0) {
            imageViewPlus.setBackgroundColor(0xff444444);
            imageViewminus.setBackgroundColor(0);
            imageViewMultiply.setBackgroundColor(0);
            imageViewDivide.setBackgroundColor(0);
            imageViewClear.setBackgroundColor(0);

        } else if (p == 1) {
            imageViewminus.setBackgroundColor(0xff444444);
            imageViewPlus.setBackgroundColor(0);
            imageViewMultiply.setBackgroundColor(0);
            imageViewDivide.setBackgroundColor(0);
            imageViewClear.setBackgroundColor(0);

        } else if (p == 2) {
            imageViewMultiply.setBackgroundColor(0xff444444);
            imageViewPlus.setBackgroundColor(0);
            imageViewminus.setBackgroundColor(0);
            imageViewDivide.setBackgroundColor(0);
            imageViewClear.setBackgroundColor(0);
        } else if (p == 3) {
            imageViewDivide.setBackgroundColor(0xff444444);
            imageViewPlus.setBackgroundColor(0);
            imageViewminus.setBackgroundColor(0);
            imageViewMultiply.setBackgroundColor(0);
            imageViewClear.setBackgroundColor(0);
        } else if (p == 4) {
            imageViewClear.setBackgroundColor(0xff444444);
            imageViewDivide.setBackgroundColor(0);
            imageViewPlus.setBackgroundColor(0);
            imageViewminus.setBackgroundColor(0);
            imageViewMultiply.setBackgroundColor(0);
        }
    }
        public void opperator (int p)
{
    if (p==0)
    {
        total = Double.parseDouble(num1 + num2);
    }
    if (p==1)
    {
        total = Double.parseDouble(num1 - num2);
    }
    else if (p==2)
    {
        total = Double.parseDouble(num1 * num2);

    }
    else if (p==3)
    {
        total = Double.parseDouble(num1 / num2);

    }
    if (total = Double.parseDouble(num1 / 0);
    {
        textViewDisplayTop3.setText("Error");
    }
    else
    {
        textViewDisplayTop3.setText(total + "");
    }
}
    }


package com.example.rbajor.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //feilds
    int a;
    Double f;
    String k;
    ImageView imageView1;
    TextView textView1;
    Button button1;
    Float float1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void myAwesomeMethod01()
    {
        a =1;
        f=1.1;
        k="1";
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView);

    }
    public void myAwesomeMethod02()
    {

        a=2;
        f=1.2;
        k="2";
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView);

    }
    public void myAwesomeMethod03()
    {
        a=3;
        f=1.3;
        k="2";
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView);
    }
    public void myAwesomeMethod04()
    {
        a=4;
        f=1.4;
        k="2";
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView);
    }
    public void myAwesomeMethod05()
    {
        a=5;
        f=1.5;
        k="2";

    }

}

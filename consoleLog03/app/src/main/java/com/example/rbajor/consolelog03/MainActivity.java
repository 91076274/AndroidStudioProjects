package com.example.rbajor.consolelog03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
//fields - class level variables
    private int myInt;
    private double myDouble;
    private String myString;
    private Boolean myBoolean;
    private Float myFloat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt = "+ myInt);
        double myDouble = setDoubleValue();
        Log.i("info", "myDouble = "+ myDouble);
        myBoolean = setBoolenValue();
        Log.i("info", "myBoolean = "+ myBoolean);
        myFloat = setFloatValue();
        Log.i("info", "myFloat = "+ myFloat);
    }
    public int setIntValue()
    {
        return  10;
    }
    public double setDoubleValue()
    {
        return 10.987;
    }
    public boolean setBoolenValue()
    {
        return false;
    }
    public float setFloatValue()
    {
       return 4.1f + 5.6f;
    }
}

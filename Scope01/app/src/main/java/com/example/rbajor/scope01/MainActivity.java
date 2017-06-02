package com.example.rbajor.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//we are outside MainActivity class
//we are outside any methods
//understanding how scope works is very important!!
public class MainActivity extends AppCompatActivity
{
    //field- class wide scope -- any code in class can see and use variables
    String myString;
    //declare a double named enemyHealth
    Double enemyHealth;
    //inside class, outside methods
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //here we are inside onCrete() method, witch is inside
        // mainActivity class

        //when we declare a variable we use the following format
        //dataType variableNme; <-- this is a variable declaration
        //some examples
        int myInt; //<-- this is declaring dataType a variable dataType int myInt
        Double myDouble; //<-- this is declaring dataType a variable dataType Double myDouble
        TextView textView_story; //<-- this is declaring dataType a variable dataType TextView
        // named textView_story

        ImageView imageView_ex; //<-- this is declaring dataType a variable dataType ImageView, variable name imageView_ex

        //assigning a value to a declared variable
        //after we declare a variable, we can asssign a value to it
        // variableName = someValueOfTheSameDataTypeAsTheVariable
        // sme ex;
        myInt = 10; //<--setting the value of myiNT TO 10, MY INT HAS A DATATYPE INT & 10 IS INT
        myDouble = 20.12; //my double gets the value 20.12
        textView_story = (TextView) findViewById(R.id.textViewStory); // set the value of textView_story
        // to the UI element
        //R.id.textView_story

        imageView_ex = (ImageView) findViewById(R.id.imageViewEx);

        //you knowe you can declare and assign in the same step
        //dataType VariableName = someValueOfTheSameDataTypeAsTheVariable;
        //ex
       int myInt2 = 25; //<-- this is a declaration anad assignment
        myInt2 = 50; //what is the differance here?? <-- this is only an assignment
        //the differance is the dataType "int"
        myString = "";//<-- declaration and an assignment
        myString = "2"; //<-- this is just assignmet

        //Wherever you declkre a variable determins that variables scope
        //in other words if i declare a variable in  OnCreate() method, only
        //code in onCreate() method can see it and use it
        //nothing outside can use it... lets prove it...
         enemyHealth = 5.6;
    } //end of onCreate method

    public void A()
    {
        myString = "";
         enemyHealth = 9.8;

    }//end of A() method
    public void B()
    {
         enemyHealth = 2134.3;
    }


} //end of class

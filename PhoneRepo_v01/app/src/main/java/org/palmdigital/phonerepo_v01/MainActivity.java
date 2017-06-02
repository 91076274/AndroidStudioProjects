package org.palmdigital.phonerepo_v01;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText editTextName;
    EditText editTextID;
    EditText editTextDiscription;
    String name;
    String id ;
    String discription;
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    String databaseName = "PhoneRepoInfo";
    String studentNameKey = "studentNameKey";
    String studentIDKey = "studentIDKey";
    String phoneDescriptionKey = "phoneDescrKey";
    String defaultString = "no info added";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName=(EditText)findViewById(R.id.editTextName);
        editTextID=(EditText)findViewById(R.id.editTextID);
        editTextDiscription=(EditText)findViewById(R.id.editTextDiscription);

        prefs = getSharedPreferences(databaseName, MODE_PRIVATE);
        editor = prefs.edit();
    }
    public static void load(View view)
    {

    }
    public static void save(View view)
    {

    }
}

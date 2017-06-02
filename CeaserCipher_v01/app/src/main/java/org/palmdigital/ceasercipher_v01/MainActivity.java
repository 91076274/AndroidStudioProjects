package org.palmdigital.ceasercipher_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void encrypt(View view)
    {
        int shift;
        EditText editTextInput=(EditText)findViewById(R.id.editTextInput);;
        EditText editTextShift=(EditText)findViewById(R.id.editText_Shift);
        TextView textViewOutput=(TextView)findViewById(R.id.textViewOutput);

        String sInput = editTextInput.getText().toString();
        String sShift = editTextShift.getText().toString();
        if(sShift.isEmpty())
        {
            shift = 0;
        }
        else
        {
            shift = Integer.parseInt(sShift);
        }
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        //int shift = 1;
        if (sInput=="")
        {
            sInput=" ";
        }
        if(sShift=="")
        {
            sShift="0";
        }
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        String toUpperCase = sInput.toUpperCase();
        for (int i = 0; i < sInput.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (sInput.charAt(i) == ' ')
            {
                output += " ";
            }
            textViewOutput.setText(output);
        } // end of outer for loop
    }
    public void decrypt(View view)
    {
        int shift;
        EditText editTextInput=(EditText)findViewById(R.id.editTextInput);;
        EditText editTextShift=(EditText)findViewById(R.id.editText_Shift);
        TextView textViewOutput=(TextView)findViewById(R.id.textViewOutput);

        String sInput = editTextInput.getText().toString();
        String sShift = editTextShift.getText().toString();
        if(sShift.isEmpty())
        {
            shift = 0;
        }
        else
        {
            shift = Integer.parseInt(sShift);
        }
        int size = 26;
        char[] alphabet = new char[size];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';
        //int shift = 1;
        if (sInput=="")
        {
            sInput=" ";
        }
        if(sShift=="")
        {
            sShift="0";
        }
        int shiftCharIndex;
        int fixedCharIndex;
        String output = "";
        int deShift= 26 - shift;
        String toUpperCase = sInput.toUpperCase();
        for (int i = 0; i < sInput.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (toUpperCase.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + deShift;
                    fixedCharIndex = shiftCharIndex % 26; // now this can only be  0 through 25
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (sInput.charAt(i) == ' ')
            {
                output += " ";
            }
           textViewOutput.setText(output);
        } // end of outer for loop
    }
}

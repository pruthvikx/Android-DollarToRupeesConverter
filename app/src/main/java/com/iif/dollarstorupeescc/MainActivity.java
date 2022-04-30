package com.iif.dollarstorupeescc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        EditText editText = (EditText) findViewById(R.id.editText);
        String stringEditText = editText.getText().toString();
        double dollarEditText = Double.parseDouble(stringEditText);
        double dollarToRupees = dollarEditText * 76.52;
        String dollarToRupeesString = String.format("%.2f",dollarToRupees);
        Log.i("ruppees",stringEditText + " $ = " + dollarToRupeesString + " ru");
        Toast.makeText(this, stringEditText + " $ = " + dollarToRupeesString + " ru", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
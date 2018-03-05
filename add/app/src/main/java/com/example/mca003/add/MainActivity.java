package com.example.mca003.add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText num1= (EditText) findViewById(R.id.number1);
        final EditText num2= (EditText) findViewById(R.id.number2);
        final TextView result = (TextView) findViewById(R.id.res);
        final Button addition = (Button) findViewById(R.id.btn1);
        final Button substaction = (Button) findViewById(R.id.btn2);
        final Button multiplication = (Button) findViewById(R.id.btn3);
        final Button division = (Button) findViewById(R.id.btn4);
        final Button clr= (Button) findViewById(R.id.btnClr);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( (num1.getText().toString().equals("")) && (num2.getText().toString().equals("")) ) {
                    num1.setError("please enter number");
                    num2.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter first & second number",Toast.LENGTH_LONG).show();

                }else if(num1.getText().toString().equals("")){
                    num1.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter first number",Toast.LENGTH_LONG).show();
                }else if(num2.getText().toString().equals("")){
                    num2.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter second number",Toast.LENGTH_LONG).show();
                }else {
                    clr.setVisibility(View.VISIBLE);
                    double a;
                    a = Double.parseDouble(num1.getText().toString());
                    double b = Double.parseDouble(num2.getText().toString());
                    double c = a + b;
                    String res = "Sum = " + Double.toString(c);
                    result.setText(res);
                }

            }
        });
        substaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( (num1.getText().toString().equals("")) && (num2.getText().toString().equals("")) ) {
                    num1.setError("please enter number");
                    num2.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter first & second number",Toast.LENGTH_LONG).show();

                }else if(num1.getText().toString().equals("")){
                    num1.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter first number",Toast.LENGTH_LONG).show();
                }else if(num2.getText().toString().equals("")){
                    num2.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter second number",Toast.LENGTH_LONG).show();
                }else {
                    clr.setVisibility(View.VISIBLE);
                    double a;
                    a = Double.parseDouble(num1.getText().toString());
                    double b = Double.parseDouble(num2.getText().toString());
                    double c = a - b;
                    String res = "Difference = " + Double.toString(c);
                    result.setText(res);
                }

            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( (num1.getText().toString().equals("")) && (num2.getText().toString().equals("")) ) {
                    num1.setError("please enter number");
                    num2.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter first & second number",Toast.LENGTH_LONG).show();

                }else if(num1.getText().toString().equals("")){
                    num1.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter first number",Toast.LENGTH_LONG).show();
                }else if(num2.getText().toString().equals("")){
                    num2.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter second number",Toast.LENGTH_LONG).show();
                }else {
                    clr.setVisibility(View.VISIBLE);
                    double a;
                    a = Double.parseDouble(num1.getText().toString());
                    double b = Double.parseDouble(num2.getText().toString());
                    double c = a * b;
                    String res = "Product = " + Double.toString(c);
                    result.setText(res);
                }

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( (num1.getText().toString().equals("")) && (num2.getText().toString().equals("")) ) {
                    num1.setError("please enter number");
                    num2.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter first & second number",Toast.LENGTH_LONG).show();

                }else if(num1.getText().toString().equals("")){
                    num1.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter first number",Toast.LENGTH_LONG).show();
                }else if(num2.getText().toString().equals("")){
                    num2.setError("please enter number");
                    Toast.makeText(MainActivity.this,"Enter second number",Toast.LENGTH_LONG).show();
                }else {
                    clr.setVisibility(View.VISIBLE);
                    double a;
                    a = Double.parseDouble(num1.getText().toString());
                    double b = Double.parseDouble(num2.getText().toString());
                    double c = a / b;
                    String res = "Quotiont = " + Double.toString(c);
                    result.setText(res);
                }

            }
        });


        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clr.setVisibility(View.INVISIBLE);
                num1.setText("");
                num2.setText("");
                result.setText("");
                num1.requestFocus();
            }
        });

    }
}

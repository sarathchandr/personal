package com.example.mca003.intentlogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.mca003.intentlogin.RegActivity.PASS;
import static com.example.mca003.intentlogin.RegActivity.NAME;
import static com.example.mca003.intentlogin.RegActivity.USERNAME;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    Button button;
    EditText editText1,editText2;
    String uname,passwd,tempuname,temppass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText usrname = findViewById(R.id.idname);
        final EditText password = findViewById(R.id.idpas);
        Button login = findViewById(R.id.btn);
        Button register = findViewById(R.id.btnReg);
        sharedPreferences= getSharedPreferences("MySharedPreference",MODE_PRIVATE);
        final SharedPreferences.Editor editor=sharedPreferences.edit();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (usrname.getText().toString().equals("") && password.getText().toString().equals("")) {
                    usrname.setError("Enter Username");
                    password.setError("Enter Password");
                } else if (usrname.getText().toString().equals("")) {
                    usrname.setError("Enter Username");
                } else if (password.getText().toString().equals("")) {
                    password.setError("Enter Password");
                } else {

                    tempuname = usrname.getText().toString();
                    temppass = password.getText().toString();
                    if (sharedPreferences.contains(USERNAME)) {
                        uname = sharedPreferences.getString(USERNAME, "");
                    }
                    if (sharedPreferences.contains(PASS)) {
                        passwd = sharedPreferences.getString(PASS, "");
                    }

                    if (tempuname.equals(uname) && temppass.equals(passwd)) {
                        Toast.makeText(getApplicationContext(), "Login Granded", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                        startActivity(intent);
                        usrname.setText("");
                        usrname.setText("");
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid Username Or Password", Toast.LENGTH_LONG).show();

                    }

                }
            }

        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(),RegActivity.class);
                startActivity(intent1);
            }
        });

        }
    }

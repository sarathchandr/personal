package com.example.mca003.intentlogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegActivity extends AppCompatActivity {
    public static final String NAME = "keyname";
    public static final String USERNAME = "keyusrnme";
    public static final String PASS = "keypass";
    public static final String PASS1 = "keycpass";

    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        final EditText nme=findViewById(R.id.txtName);
        final EditText usr=findViewById(R.id.txtUser);
        final EditText pass1=findViewById(R.id.txtPass1);
        final EditText pass2=findViewById(R.id.txtPass2);
        Button sub=findViewById(R.id.btnSub);
        sharedPreferences= getSharedPreferences("MySharedPreference",MODE_PRIVATE);
        final SharedPreferences.Editor editor=sharedPreferences.edit();

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //checking for blank fields
                if ( (nme.getText().toString()=="") && (usr.getText().toString()=="") && (pass1.getText().toString()=="") && (pass2.getText().toString()=="")){
                    nme.setError("Enter Name");
                    usr.setError("Enter Username");
                    pass1.setError("Enter password");
                    pass2.setError("confirm password");

                }else if(nme.getText().toString()==""){
                    nme.setError("Enter Name");
                }else if(usr.getText().toString()==""){
                    usr.setError("Enter username");
                }else if(pass1.getText().toString()==""){
                    pass1.setError("Enter password");

                }else if(pass2.getText().toString()=="") {
                    pass2.setError("Confirm password");
                }
                else if((pass1.getText().toString().equals(pass2.getText().toString()))){

                    //putting value to the variables in shared preference
                    editor.putString(NAME, String.valueOf(nme.getText()));
                    editor.putString(USERNAME, String.valueOf(usr.getText()));
                    editor.putString(PASS, String.valueOf(pass1.getText()));
                    editor.putString(PASS1, String.valueOf(pass2.getText()));

                    //commiting to sahred preference
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Successfully Added to Shred preference",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(RegActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(getApplicationContext(),"password don't match",Toast.LENGTH_LONG).show();
                }
            }

        });

    }
}

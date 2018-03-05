package com.example.mca003.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name=findViewById(R.id.idname);
        final EditText password=findViewById(R.id.idpas);
        Button login=findViewById(R.id.btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(name.getText().toString())){
                    name.setError("please enter name");
                    Toast.makeText(MainActivity.this,"name empty", Toast.LENGTH_LONG).show();
                }else if(TextUtils.isEmpty(password.getText().toString())){
                    password.setError("please enter password");
                    Toast.makeText(MainActivity.this,"password empty",Toast.LENGTH_LONG).show();

                }else{
                    Toast.makeText(MainActivity.this,"success",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}

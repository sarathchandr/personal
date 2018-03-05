package com.example.mca003.printing;

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
        final EditText name=findViewById(R.id.txt1);
        final TextView l1=findViewById(R.id.lbl1);
        Button Print=findViewById(R.id.btn1);

        Print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(name.getText().toString())) {
                    name.setError("please enter text");
                    Toast.makeText(MainActivity.this, "name empty", Toast.LENGTH_LONG).show();
                    l1.setText("Empty Text");
                }
                else{
                        l1.setText(name.getText().toString());

                    }

            }
        });

    }
}

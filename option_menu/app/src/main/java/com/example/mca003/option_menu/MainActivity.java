package com.example.mca003.option_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           Button contextMenuButton = (Button) findViewById(R.id.button);
           registerForContextMenu(contextMenuButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.omenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.conmenu,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.id1){
            Intent i=new Intent(getApplicationContext(),BackActivity.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"This is on item1",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.id2){
            Toast.makeText(getApplicationContext(),"This is on item2",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.id3){
            Toast.makeText(getApplicationContext(),"This is on item3",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.id4){
            Toast.makeText(getApplicationContext(),"This is on item4",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.id5){
            Toast.makeText(getApplicationContext(),"This is on item5",Toast.LENGTH_LONG).show();
        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if (id==R.id.id1){
            Toast.makeText(getApplicationContext(),"This is on item1",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.id2){
            Toast.makeText(getApplicationContext(),"This is on item2",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.id3){
            Toast.makeText(getApplicationContext(),"This is on item3",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.id4){
            Toast.makeText(getApplicationContext(),"This is on item4",Toast.LENGTH_LONG).show();
        }
        else if (id==R.id.id5){
            Toast.makeText(getApplicationContext(),"This is on item5",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}

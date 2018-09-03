package com.example.mortezasaadat.app48;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.settings) {

            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();

        } else if (id == R.id.settings2) {
            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();

        } else if (id == R.id.settings3) {

            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();


        } else if (id == R.id.settings4) {

            Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();


        }


        return super.onOptionsItemSelected(item);

    }
}

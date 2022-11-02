package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
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
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(MainActivity.this, "settings..", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(in);
                return true;
            case R.id.item2:
                Toast.makeText(MainActivity.this, "display..", Toast.LENGTH_SHORT).show();
                Intent in2 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(in2);
                return true;
            case R.id.item3:
                Toast.makeText(MainActivity.this, "about..", Toast.LENGTH_SHORT).show();
                Intent in3 = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(in3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
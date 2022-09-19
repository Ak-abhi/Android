package com.example.login_validate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname, pwd;
    Button b;
    String nm="admin";
    String ps="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=(EditText) findViewById(R.id.e1);
        pwd=(EditText) findViewById(R.id.e2);
        b=(Button) findViewById(R.id.b);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name=uname.getText().toString();
               String pass=pwd.getText().toString();

               if (name.isEmpty() || pass.isEmpty()){
                   Toast.makeText(getApplicationContext(), "Fields are empty!", Toast.LENGTH_SHORT).show();
               }
               else if (name.equals(nm) && pass.equals(ps)){
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
               }
               else {
                    Toast.makeText(getApplicationContext(), "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
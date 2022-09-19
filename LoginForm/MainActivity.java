package com.example.login_form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewKt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText uname, pwd;
    Button but1, but2;
    TextView t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname=(EditText) findViewById(R.id.e1);
        pwd=(EditText) findViewById(R.id.e2);

        but1=(Button) findViewById(R.id.b1);
        but2=(Button) findViewById(R.id.b2);

        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u=uname.getText().toString();
                t1.setText(u);
                String p=pwd.getText().toString();
                t2.setText(p);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uname.setText("");
                pwd.setText("");
            }
        });

    }
}
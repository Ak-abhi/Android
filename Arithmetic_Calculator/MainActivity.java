package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button but1, but2, but3, but4;
    float sol=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.e1);
        num2=findViewById(R.id.e2);
        but1=findViewById(R.id.b1);
        but2=findViewById(R.id.b2);
        but3=findViewById(R.id.b3);
        but4=findViewById(R.id.b4);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                sol=a+b;
                Toast.makeText(getApplicationContext(), "Sum is " +sol, Toast.LENGTH_SHORT).show();
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                sol=a-b;
                Toast.makeText(getApplicationContext(), "Difference is " +sol, Toast.LENGTH_SHORT).show();
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                sol=a*b;
                Toast.makeText(getApplicationContext(), "Product is " +sol, Toast.LENGTH_SHORT).show();
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a=Float.parseFloat(num1.getText().toString());
                float b=Float.parseFloat(num2.getText().toString());
                sol=a/b;
                Toast.makeText(getApplicationContext(), "Quotient is " +sol, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
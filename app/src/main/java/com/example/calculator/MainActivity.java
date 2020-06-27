package com.example.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    Button suma;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=(EditText)findViewById(R.id.numero1);
        suma=(Button) findViewById(R.id.btnsuma);
        resultado=(TextView)findViewById(R.id.resurtados);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double numero1 = Double.parseDouble(num1.getText().toString());
                Double sumatoria = numero1 + 10 ;
                resultado . setText ( Double . toString (sumatoria));

            }
        }


    }
}
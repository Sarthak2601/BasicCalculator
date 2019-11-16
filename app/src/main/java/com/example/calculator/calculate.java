package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculate extends AppCompatActivity {

    TextView result;
    EditText Op1;
    EditText Op2;
    int op1, op2;

    public void Addition(View view){
        op1 = Integer.parseInt(Op1.getText().toString());
        op2 = Integer.parseInt(Op2.getText().toString());
        result.setText(Integer.toString(op1+op2));
    }

    public void Subtraction(View view){
        op1 = Integer.parseInt(Op1.getText().toString());
        op2 = Integer.parseInt(Op2.getText().toString());
        result.setText(Integer.toString(op1-op2));
    }

    public void Multiplication(View view){
        op1 = Integer.parseInt(Op1.getText().toString());
        op2 = Integer.parseInt(Op2.getText().toString());
        result.setText(Integer.toString(op1*op2));

    }

    public void Division(View view){

        op1 = Integer.parseInt(Op1.getText().toString());
        op2 = Integer.parseInt(Op2.getText().toString());
        result.setText(Integer.toString(op1/op2));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        result = findViewById(R.id.result);
        Op1 = findViewById(R.id.Op1);
        Op2 = findViewById(R.id.Op2);




    }
}

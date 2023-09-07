package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button bAdd,bSub,bMul,bDiv;
    Button bClear,bEqual,bDot;
    EditText tres;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(this);
        b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(this);
        b0=(Button)findViewById(R.id.button0);
        b0.setOnClickListener(this);
        bAdd=(Button)findViewById(R.id.buttonplus);
        bAdd.setOnClickListener(this);
        bSub=(Button)findViewById(R.id.buttonminus);
        bSub.setOnClickListener(this);
        bMul=(Button)findViewById(R.id.buttonmult);
        bMul.setOnClickListener(this);
        bDiv=(Button)findViewById(R.id.buttondivide);
        bDiv.setOnClickListener(this);
        bClear=(Button)findViewById(R.id.buttonclear);
        bClear.setOnClickListener(this);
        bEqual=(Button)findViewById(R.id.buttonequals);
        bEqual.setOnClickListener(this);
        bDot=(Button)findViewById(R.id.buttondot);
        bDot.setOnClickListener(this);
        tres=(EditText)findViewById(R.id.res);
        tres.setText("");

    }
    @Override
    public void onClick(View v){
        if (v.equals(b0))
            tres.append("0");
        if (v.equals(b1))
            tres.append("1");
        if (v.equals(b2))
            tres.append("2");
        if (v.equals(b3))
            tres.append("3");
        if (v.equals(b4))
            tres.append("4");
        if (v.equals(b5))
            tres.append("5");
        if (v.equals(b6))
            tres.append("6");
        if (v.equals(b7))
            tres.append("7");
        if (v.equals(b8))
            tres.append("8");
        if (v.equals(b9))
            tres.append("9");
        if (v.equals(bDot))
            tres.append(".");
        if (v.equals(bAdd))
            tres.append("+");
        if (v.equals(bSub))
            tres.append("-");
        if (v.equals(bMul))
            tres.append("*");
        if (v.equals(bDiv))
            tres.append("/");
        if (v.equals(bClear))
            tres.setText("");
        if (v.equals(bEqual)){
            try {
                String data=tres.getText().toString();
                if (data.contains("/")){
                    Division(data);
                }
                else if (data.contains("*")){
                    Multiplication(data);
                }
                else if (data.contains("+")){
                    Addition(data);
                }
                else if (data.contains("-")){
                    Substraction(data);
                }
            }
            catch (Exception e){
                Toast.makeText(getBaseContext(),"Invald Input",Toast.LENGTH_LONG).show();
            }
        }

    }
    private void Multiplication(String data){
        String[] operands=data.split("\\*");
        if (operands.length==2){
            double operand1=Double.parseDouble(operands[0]);
            double operand2=Double.parseDouble(operands[1]);
            double result=operand1*operand2;
            tres.setText(String.valueOf(result));
        }
        else {
            Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
        }
    }
    private void Addition(String data){
        String[] operands=data.split("\\+");
        if (operands.length==2){
            double operand1=Double.parseDouble(operands[0]);
            double operand2=Double.parseDouble(operands[1]);
            double result=operand1+operand2;
            tres.setText(String.valueOf(result));
        }
        else {
            Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
        }
    }
    private void Substraction(String data){
        String[] operands=data.split("\\-");
        if (operands.length==2){
            double operand1=Double.parseDouble(operands[0]);
            double operand2=Double.parseDouble(operands[1]);
            double result=operand1-operand2;
            tres.setText(String.valueOf(result));
        }
        else {
            Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
        }
    }
    private void Division(String data){
        String[] operands=data.split("\\/");
        if (operands.length==2){
            double operand1=Double.parseDouble(operands[0]);
            double operand2=Double.parseDouble(operands[1]);
            double result=operand1/operand2;
            tres.setText(String.valueOf(result));
        }
        else {
            Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
        }
    }
}
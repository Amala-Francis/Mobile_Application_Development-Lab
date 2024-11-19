package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btc,btadd,btsub,btmul,btdiv,enter;
    Float first,second;
    Boolean addition=false,substraction=false,multiplication=false,division=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);
        bt9=(Button)findViewById(R.id.bt9);
        bt0=(Button)findViewById(R.id.bt10);
        btadd=(Button)findViewById(R.id.btadd);
        btsub=(Button)findViewById(R.id.btsub);
        btmul=(Button)findViewById(R.id.btmul);
        btdiv=(Button)findViewById(R.id.btdiv);
        enter=(Button)findViewById(R.id.btent);
        btc=(Button)findViewById(R.id.btc);
        result=(TextView)findViewById(R.id.text1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result!=null){
                    first=Float.parseFloat(result.getText().toString());
                    addition=true;
                }
                result.setText("");
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result!=null){
                    first=Float.parseFloat(result.getText().toString());
                    substraction=true;
                }
                result.setText("");
            }
        });
        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result!=null){
                    first=Float.parseFloat(result.getText().toString());
                    multiplication=true;
                }
                result.setText("");
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result!=null){
                    first=Float.parseFloat(result.getText().toString());
                    division=true;
                }
                result.setText("");
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second=Float.parseFloat(result.getText().toString());
                if (addition==true){
                    result.setText(String.valueOf(first+second));
                    addition=false;
                }
                if (substraction==true){
                    result.setText(String.valueOf(first-second));
                    substraction=false;
                }
                if (multiplication==true) {
                    result.setText(String.valueOf(first * second));
                    multiplication=false;
                }
                if (division==true){
                    result.setText(String.valueOf(first/second));
                    division=false;
                }
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }
        });
    }
}

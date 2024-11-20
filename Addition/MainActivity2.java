package com.example.sample;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        result=(TextView)findViewById(R.id.text1);
        Bundle b=getIntent().getExtras();
        int n1=Integer.parseInt(b.getString("number1"));
        int n2=Integer.parseInt(b.getString("number2"));

        int sum=n1+n2;
        result.setText("Sum = "+sum);
    }
}

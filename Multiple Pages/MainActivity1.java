package com.example.multiplepages;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {
    TextView qn2;
    Button previous1;
    Button next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main1);

        qn2=(TextView) findViewById(R.id.qn2);
        previous1=(Button) findViewById(R.id.previous1);
        next2=(Button) findViewById(R.id.next2);
        qn2.setText("Q2:What?");
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity1.this, MainActivity2.class);
                startActivity(i);
            }
        });

        previous1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity1.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}

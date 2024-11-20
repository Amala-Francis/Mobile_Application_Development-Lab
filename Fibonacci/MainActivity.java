package com.example.fibanocci;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText number;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        number=(EditText)findViewById(R.id.number);
        submit=(Button)findViewById(R.id.button);
        result=(TextView)findViewById(R.id.textView);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S=number.getText().toString();
                int num=Integer.parseInt(S);
                int a=0;
                int b=1;
                int i=2;
                if(num==1) {
                    result.setText(String.valueOf(a));
                }
                else{
                    result.setText(a + "," + b);
                }
                while(i<num){
                    int sum=a+b;
                    a=b;
                    b=sum;
                    i=i+1;
                    result.append(","+b);
                }
            }
        });
    }
}

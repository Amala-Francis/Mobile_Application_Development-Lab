package com.example.factorial;

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
    TextView result;
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        number=(EditText)findViewById(R.id.num);
        result=(TextView)findViewById(R.id.text1);
        enter=(Button)findViewById(R.id.button);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=number.getText().toString();
                int num=Integer.parseInt(s);
                int fact=1;

                while (num>=1){
                    fact=fact*num;
                    num=num-1;
                    result.setText("Factorial is: "+fact);
                }
            }
        });
    }
}

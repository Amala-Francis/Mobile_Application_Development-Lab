package com.example.palindrome;

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
    EditText palindrome;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        palindrome=(EditText)findViewById(R.id.pal);
        button=(Button)findViewById(R.id.button);
        result=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S=palindrome.getText().toString();
                int num=Integer.parseInt(S);
                int r;
                int sum=0;
                int temp=num;

                while (num>0){
                    r=num%10;
                    sum=(sum*10)+r;
                    num=num/10;
                }
                if (temp==sum){
                    result.setText("Palindrome number");
                }else {
                    result.setText("Not a Palindrome number");
                }
            }
        });
    }
}

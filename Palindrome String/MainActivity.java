package com.example.palindromestr;

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

        palindrome=(EditText)findViewById(R.id.Text1);
        button=(Button)findViewById(R.id.btn);
        result=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=palindrome.getText().toString();
                String rev="";

                for (int i=s.length()-1;i>=0;i--){
                    rev=rev+s.charAt(i);
                }
                if (s.equalsIgnoreCase(rev)){
                    result.setText("String is Palindrome");
                }else {
                    result.setText("String is not Palindrome");
                }
            }
        });
    }
}

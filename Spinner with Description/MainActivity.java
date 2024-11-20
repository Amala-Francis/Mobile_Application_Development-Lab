package com.example.spinnerwithdescription;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    TextView text;
    String[] Subjects={"C","C++","DBMS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Spinner sp=findViewById(R.id.spinner);
        text=(TextView)findViewById(R.id.text3);
        ArrayAdapter<String> arrayadapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,Subjects);
        sp.setAdapter(arrayadapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //i or l or sp.getSelectedItemPosition() can be use in if (condition)
                if (l==0){
                    text.setText("C is a general-purpose programming language created by Dennis Ritchie at the Bell Laboratories in 1972.");
                } else if (l==1) {
                    text.setText("C++ is a cross-platform language that can be used to create high-performance applications.");
                } else if (l==2) {
                    text.setText("Database management system (DBMS) is a software system that allows users to create, manage, and manipulate databases");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                text.setText("No Courses Selected");
            }
        });
    }
}

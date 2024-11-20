package com.example.adapterwithexceptionhandling;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] Subjects={"C","C++","DBMS","Java","SQL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        try {
            list = (ListView) findViewById(R.id.list);
            list=null;
            ArrayAdapter<String> arrayadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Subjects);
            list.setAdapter(arrayadapter);
        }
        catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(MainActivity.this,"An Error Occurred",Toast.LENGTH_SHORT).show();
        }
    }
}

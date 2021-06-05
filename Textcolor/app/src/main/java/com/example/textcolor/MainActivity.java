package com.example.textcolor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView view;
    Button   size;
    Button   color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view=(TextView)findViewById(R.id.view);
        size=(Button)findViewById(R.id.size);
        color=(Button)findViewById(R.id.color);


        size.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                view.setTextSize(TypedValue.COMPLEX_UNIT_SP,view.getTextSize()+1);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                view.setTextColor(Color.RED);
                
            }
        });
    }
}
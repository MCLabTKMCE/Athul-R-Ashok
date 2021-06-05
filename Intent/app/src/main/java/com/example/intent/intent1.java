package com.example.intent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class intent1 extends AppCompatActivity {
    private Button back;
    private TextView name,qualification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent1);
        back = findViewById(R.id.back);
        name = findViewById(R.id.displayName);
        qualification = findViewById(R.id.displayQualification);
        Intent value = getIntent();
        String Name = value.getStringExtra("Name");
        String Qualification = value.getStringExtra("Qualification");
        name.setText(Name);
        qualification.setText(Qualification);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(intent1.this,MainActivity.class);
                startActivity(next);
            }
        });
    }
}
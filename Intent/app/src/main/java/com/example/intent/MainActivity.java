package com.example.intent;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button pass;
    private EditText name,qualification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pass = findViewById(R.id.pass);
        name = findViewById(R.id.name);
        qualification = findViewById(R.id.qualification);
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(MainActivity.this,intent1.class);
                next.putExtra("Name",name.getText().toString());
                next.putExtra("Qualification",qualification.getText().toString());
                startActivity(next);
            }
        });


    }
}
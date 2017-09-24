package com.studies.sandrini.welcomeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {

    TextView welcomeOutput;
    Button outputButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        welcomeOutput = (TextView) findViewById(R.id.welcome_output);
        outputButton = (Button) findViewById(R.id.output_button);
        intent = getIntent();
        if(intent != null) {
            Bundle params = intent.getExtras();
            if(params != null) {
                String name = params.getString("msg");
                welcomeOutput.setText("Welcome, " + name);
            }
        }

        outputButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

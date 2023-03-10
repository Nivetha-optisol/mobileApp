package com.example.madrasmedicalmission;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.security.ConfirmationPrompt;
import android.widget.Toolbar;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;

public class Appointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        Button submit;
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Appointment.this, Conformation.class);

                startActivity(intent);
            }
        });
    }

}
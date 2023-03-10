package com.example.madrasmedicalmission;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        LinearLayout layout,contactlayout,admissionlayout,courselayout,gallerylayout;
        layout=(LinearLayout)findViewById(R.id.about);
        contactlayout=(LinearLayout)findViewById(R.id.contact);
        admissionlayout=(LinearLayout)findViewById(R.id.admission);
        courselayout=(LinearLayout)findViewById(R.id.course);
        gallerylayout=(LinearLayout)findViewById(R.id.gallery);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, About.class);
                startActivity(intent);
            }
        });
        contactlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Contact.class);
                startActivity(intent);
            }
        });
        admissionlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Appointment.class);
                startActivity(intent);

            }
        });
        courselayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Department.class);
                startActivity(intent);
            }
        });
        gallerylayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Gallery.class);
                startActivity(intent);
            }
        });

    }
}
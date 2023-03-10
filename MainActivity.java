package com.example.madrasmedicalmission;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText username, password;
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        final String name = "nivethakumar";
        final String pass = "1807";
        Button Loginbtn;
        Loginbtn = (Button) findViewById(R.id.Login);
        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals(name)) {
                    if (password.getText().toString().equals(pass)) {
                        Intent intent = new Intent(MainActivity.this, menu.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "invalid username", Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "invalid password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}


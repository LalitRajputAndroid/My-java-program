package com.example.logindatabase;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class login_Activity2 extends AppCompatActivity {

    MaterialButton loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        loginbtn = findViewById(R.id.loginbutton_id);

        loginbtn.setOnClickListener(view -> startActivity(new Intent(login_Activity2.this,Home_Activity4.class)));
    }
}
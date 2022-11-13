package com.example.logindatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class signup_Activity3 extends AppCompatActivity {
    MaterialButton signup;
    TextInputEditText FN,EM,Pass,C_Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup3);

        signup = findViewById(R.id.signup_btn_id);
        FN = findViewById(R.id.fullname_id);
        EM = findViewById(R.id.email_id);
        Pass = findViewById(R.id.signuppassword_id);
        C_Pass = findViewById(R.id.confirmpassword_id);



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String full_name = FN.getText().toString();
                String email = EM.getText().toString();
                String Password = Pass.getText().toString();
                String confirm_pass = C_Pass.getText().toString();

                dbhelper dbhelper = new dbhelper(signup_Activity3.this);
                dbhelper.insrtdata(full_name,email,Password);
                
                Toast.makeText(signup_Activity3.this, "data add succes", Toast.LENGTH_SHORT).show();

                startActivity( new Intent(signup_Activity3.this,Home_Activity4.class));
            }
        });
    }
}
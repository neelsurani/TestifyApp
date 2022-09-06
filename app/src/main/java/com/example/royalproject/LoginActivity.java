package com.example.royalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    Button login,signup,btn;
    EditText email,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.email);
        password = findViewById(R.id.PASSWORD);
        login = findViewById(R.id.loginn);
        signup = findViewById(R.id.SignUp);
        btn = findViewById(R.id.btn);
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(i);
//            }
//        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(LoginActivity.this,SignActivity.class);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String stremail = email.getText().toString().trim();
                String pass = password.getText().toString().trim();


                if (pass.length() < 6) {
                    password.setError("Password must contain 6 characters");
                    password.requestFocus();
                }

                if (TextUtils.isEmpty(pass)) {
                    password.setError("Please enter Password");
                    password.requestFocus();
                }

                if (!Patterns.EMAIL_ADDRESS.matcher(stremail).matches()) {
                    email.setError("Please enter Valid email");
                    email.requestFocus();
                }

                if (TextUtils.isEmpty(stremail)) {
                    email.setError("Please enter Email ID");
                    email.requestFocus();
                }

                if (!TextUtils.isEmpty(stremail) &&
                        pass.length() >= 6 &&
                        Patterns.EMAIL_ADDRESS.matcher(stremail).matches() &&
                        !TextUtils.isEmpty(pass)) {

                    //call your login service here
                }
            }
        });
    }
}
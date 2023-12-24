package com.example.hungryhub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button Login , signup;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
    Login = findViewById(R.id.btnlogin);
    signup = findViewById(R.id.btnSignUp);
    textView2 = findViewById(R.id.textView2);

    Login.setOnClickListener(v -> {
        Toast.makeText(MainActivity.this, "login has been clicked", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(MainActivity.this, SignIn_Activity.class);
        startActivity(intent);
        finish();

    });

        signup.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "login has been clicked", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this , SingUp_Activity.class);
            startActivity(intent);
            finish();

        });

        textView2.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "login has been clicked", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this , SignIn_Activity.class);
            startActivity(intent);
            finish();

        });
    }
    }
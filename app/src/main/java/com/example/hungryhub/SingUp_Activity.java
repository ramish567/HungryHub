package com.example.hungryhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingUp_Activity extends AppCompatActivity {

    Button button3;

    TextView textView13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        button3 = findViewById(R.id.button3);
        textView13 = findViewById(R.id.textView13);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingUp_Activity.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingUp_Activity.this, SignIn_Activity.class);
                startActivity(intent);
                finish();
            }
        });





    }
}
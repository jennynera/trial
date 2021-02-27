package com.example.trial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class login extends AppCompatActivity {

    Button callSignUp, login_btn;
    TextView logoText, sloganText;
    TextInputLayout email, password;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        logoText = findViewById(R.id.logo_name);
        sloganText = findViewById(R.id.slogan_name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login_btn = findViewById(R.id.login_btn);
        callSignUp = findViewById(R.id.callSignUp);

callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        mAuth = FirebaseAuth.getInstance();
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String Email  = email.getEditText().getText().toString().trim();
                final String Password = password.getEditText().getText().toString().trim();

                mAuth.signInWithEmailAndPassword(Email, Password)
                        .addOnCompleteListener(login.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {

                                    startActivity(new Intent(login.this, navigationdrawer.class));

                                } else {

                                    Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                                }


                            }
                        });









            }
        });

    }
}

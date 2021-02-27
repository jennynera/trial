package com.example.trial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class display extends AppCompatActivity {
    TextView Fullname, Username,emailD,PhoneNo;

    //String email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

       // Intent intent=getIntent();
        //email=intent.getStringExtra("email");

        Fullname= findViewById(R.id.fullnameD);
        Username = findViewById(R.id.usernameD);
        emailD = findViewById(R.id.emailD);
        PhoneNo = findViewById(R.id.phoneNoD);

        FirebaseAuth mAuth= FirebaseAuth.getInstance();
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        //DatabaseReference userRef=database.getReference("users");
        DatabaseReference userRef= database.getReference(mAuth.getCurrentUser().getUid());
        // Database reference pointing to root of database
     /*   userRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                UserHelperClass helperClass=snapshot.getValue(UserHelperClass.class);
                Fullname.setText(helperClass.getName());
                Username.setText(helperClass.getUsername());
                emailD.setText(helperClass.getEmail());
                PhoneNo.setText(helperClass.getPhoneNo());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(getApplicationContext(),error.getCode(),Toast.LENGTH_SHORT).show();

            }
        }); /*







        /*userRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
               // String value= snapshot.getValue(String.class);
                String EmailFromDB = snapshot.child(email).child("email").getValue(String.class);
                if(EmailFromDB.equals(email)) {


                    String Name = snapshot.child("name").getValue(String.class);
                    Fullname.setText(Name);
                    String UserName = snapshot.child("username").getValue(String.class);
                    Username.setText(UserName);
                    //String Email = snapshot.child("email").getValue(String.class);
                    //emailD.setText(Email);
                   String phoneno = snapshot.child("phoneNo").getValue(String.class);
                    PhoneNo.setText(phoneno);
                }


                }


            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        }); */

        //showAllUserData();
    }


   /* private void showAllUserData() {
        Intent intent = getIntent();
        //String user_username = intent.getStringExtra("username");
        String user_name = intent.getStringExtra("name");
        String user_email = intent.getStringExtra("email");
        String user_phoneNo = intent.getStringExtra("phoneNo");

        fullName.getEditText().setText(user_name);
        email.getEditText().setText(user_email);
        phoneNo.getEditText().setText(user_phoneNo);
    }*/


}

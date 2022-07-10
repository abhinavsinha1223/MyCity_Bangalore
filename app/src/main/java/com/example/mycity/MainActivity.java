package com.example.mycity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    EditText uid;
    EditText password;
    Button btn;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    FirebaseAuth mAuth;
    FirebaseUser mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uid = findViewById(R.id.uid);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.button);
        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
    }

    public void btn(View view) {
        prfmlogin();
    }

    private void prfmlogin() {

        String muid = uid.getText().toString();
        String mpassword = password.getText().toString();

        if (!muid.matches(emailPattern)) {
            uid.setError("enter correct email");
        } else if (mpassword.isEmpty() || mpassword.length() < 6) {
            password.setError("enter proper password");
        } else {
            mAuth.signInWithEmailAndPassword(muid,mpassword).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        gotologin();
                        Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(MainActivity.this, "Login ERROR ", Toast.LENGTH_LONG).show();
                    }
                }


            });
        }


    }


    private void gotologin() {
        Intent intent = new Intent(MainActivity.this, home.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    public void register(View view) {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

   /* public void login(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }*/



}
package com.example.mycity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class call extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
    }

    public void ext(View view) {

            Intent i=new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:+91 6204426701"));
            startActivity(i);

    }

    public void amb(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:108"));
        startActivity(i);
    }

    public void pol(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:101"));
        startActivity(i);
    }

    public void fire(View view) {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:103"));
        startActivity(i);
    }

    public void abhi(View view) {Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+91 919986293"));
        startActivity(i);
    }
}
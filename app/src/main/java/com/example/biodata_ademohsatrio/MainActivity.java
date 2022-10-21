package com.example.biodata_ademohsatrio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alamat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/6%C2%B057'08.2%22S+108%C2%B059'17.1%22E/@-6.95227,108.9875418,316m/data=!3m2!1e3!4b1!4m6!3m5!1s0x0:0x6ec483b61a37cfa2!7e2!8m2!3d-6.9522699!4d108.9880885"));
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:keseimbangan93@gmail.com"));
        startActivity(intent);
    }
    public void telepon(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=6285227338132"));
        startActivity(intent);
    }

}


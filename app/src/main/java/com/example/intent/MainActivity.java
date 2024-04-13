package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo Boton fragmentos
    public void fragmentos(View view){
        Intent fragmentos = new Intent(this, ActivityFragmentos.class);
        startActivity(fragmentos);
    }

    public void Listview(View view){
        Intent listview = new Intent(this, AcvityNews.class);
        startActivity(listview);
    }
}
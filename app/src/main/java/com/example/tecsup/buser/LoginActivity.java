package com.example.tecsup.buser;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity{
    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        nombre = (TextView) findViewById(R.id.nombre);
    }

    public void MainActivity(View v){
        String entrada = nombre.getText().toString();

        SharedPreferences preferencias=getSharedPreferences("dato",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString("nombre", entrada);
        editor.commit();

        Intent MainActivity = new Intent(this, MainActivity.class);
        finish();
        startActivity(MainActivity);
    }
}
package com.OscarA07.ProyectoAndroidGrupo06;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Ocultar Action Bar
        getSupportActionBar().hide();

        //Cambiar texto
        tv1 = (TextView) findViewById(R.id.textView3);
        tv1.setText("Recordar Contraseña");
        tv1.setTextColor(Color.BLUE);

    }
}
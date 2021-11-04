package com.OscarA07.ProyectoAndroidGrupo06;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    TextView tv1;
    EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Ocultar Action Bar
        getSupportActionBar().hide();

        //Cambiar texto
        tv1 = (TextView) findViewById(R.id.textView3);
        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.editTextTextPassword);
//        tv1.setText("Recordar Contraseña");  //Para colocar texto
        //Cargar un enlace
//        String link = "<a href='https://imaster.academy/course/view.php?id=999&section=1'>iMaster</a>";
        String texto = "<a href=' '>Recordar Contraseña </a>";
        tv1.setTextColor(Color.BLUE);
        tv1.setLinkTextColor(Color.BLUE);
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv1.setText(Html.fromHtml(texto));
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(loginActivity.this, "Su contraseña es: admin", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void iniciarSesion(View view){
        //FALTA CREACION DE CODIGO PARA LA BASE DATOS//
        if(et1.getText().toString().equals("admin") && et2.getText().toString().equals("admin")){
            Intent newIntent = new Intent(this, MainActivity.class);
            startActivity(newIntent);
            finish();
        }
        else {
            Toast.makeText(this, "Datos Incorrectos", Toast.LENGTH_SHORT).show();
        }
        if(et1.getText().toString().equals("")){
            Toast.makeText(this, "Por favor, ingrese el usuario", Toast.LENGTH_SHORT).show();
            et1.requestFocus();
        }
        else if (et2.getText().toString().equals("")){
            Toast.makeText(this, "Por favor ingrese la contraseña", Toast.LENGTH_SHORT).show();
            et2.requestFocus();
        }
    }
}
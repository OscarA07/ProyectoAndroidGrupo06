package com.OscarA07.ProyectoAndroidGrupo06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        //Activar el supoorte para la actividad
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //Destruir la aplicación o actividad
    public void onBackPressed(){
        finish();
    }

    //cuando el usuario oprime algun boton del celular
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId(); //codigo de lo que toco el ususario
        if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

}
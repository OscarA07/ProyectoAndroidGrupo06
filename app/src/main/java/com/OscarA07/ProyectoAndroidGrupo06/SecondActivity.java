package com.OscarA07.ProyectoAndroidGrupo06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Activar el supoorte para la actividad
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getParametros();
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

    private void getParametros() {
        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("msg");
        int year = extras.getInt("year");
        Toast.makeText(this, msg + " " + year, Toast.LENGTH_SHORT).show();
    }

    public void goToActivityMain(View view){
        Intent newIntent = new Intent(this, MainActivity.class);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent);
    }
}
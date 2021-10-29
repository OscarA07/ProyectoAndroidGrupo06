package com.OscarA07.ProyectoAndroidGrupo06;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.i("Información","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    public void goToActivitySecond(View view){
        Intent newIntent = new Intent(this, SecondActivity.class);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        newIntent.putExtra("msg","Hola MinTIC");
        newIntent.putExtra("year", 2020);
        startActivity(newIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //cuando el usuario oprime en el submenu para ir a la segunda aplicacion
    public boolean onOptionsItemSelected(MenuItem menuItem){
        int id = menuItem.getItemId(); //codigo de lo que toco el ususario
        if (id == R.id.mnu_second_activity) {
            Intent newIntent = new Intent(this, SecondActivity.class);
            newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            newIntent.putExtra("msg","Hola MinTIC");
            newIntent.putExtra("year", 2020);
            startActivity(newIntent);
        }
        else if (id == R.id.mnu_third_activity) {
            Intent newIntent = new Intent(this, ThirdActivity.class);
            startActivity(newIntent);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    //Mensajes de confirmación
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        //alert dialogo
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            new AlertDialog.Builder(this, R.style.Theme_AppCompat_Dialog_Alert)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Información")
                    .setMessage("¿Desea Salir?")
                    .setNegativeButton("No", null)
                    .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            MainActivity.this.finish();
                        }
                    }).show();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
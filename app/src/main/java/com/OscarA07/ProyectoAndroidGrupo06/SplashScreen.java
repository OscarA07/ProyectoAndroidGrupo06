package com.OscarA07.ProyectoAndroidGrupo06;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;


public class SplashScreen extends AppCompatActivity {

    //CONSTANTE PARA EL TEMPORIZADOR
    private static final long SPLASH_SCREEN_DALEY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //Bloquear la rotación de pantalla
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Ocultar la barra de notificaciones
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Ocultar Action Bar
        getSupportActionBar().hide();

        //Crear Tarea de temporización
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent newIntent = new Intent(SplashScreen.this, loginActivity.class);
                startActivity(newIntent);
                finish();
            }
        };
        //CONSTANTE
        Timer timer = new Timer();
        timer.schedule(timerTask, SPLASH_SCREEN_DALEY);

    }
}
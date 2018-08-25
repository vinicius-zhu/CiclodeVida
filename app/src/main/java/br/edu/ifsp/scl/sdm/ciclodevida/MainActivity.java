package br.edu.ifsp.scl.sdm.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String CDV_LOGCAT_TAG = "CDV_LOGCAT_TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // iniciando o ciclo de vida COMPLETO
        Log.v(CDV_LOGCAT_TAG, "onCreate: Iniciando ciclo COMPLETO");
    }

    @Override
    protected void onStart(){
        super.onStart();

        // Iniciando o ciclo de vida VISÍVEL
        Log.v(CDV_LOGCAT_TAG, "onStart: Iniciando ciclo VISÍVEL");
    }

    @Override
    protected void onResume(){
        super.onResume();

        // Iniciando o ciclo de vida em PRIMEIRO PLANO
        Log.v(CDV_LOGCAT_TAG, "onResume: Iniciando ciclo em PRIMEIRO PLANO");
    }

    @Override
    protected void onPause(){
        super.onPause();

        // Finalizando o ciclo de vida em PRIMEIRO PLANO
        Log.v(CDV_LOGCAT_TAG, "onPause: Finalizando ciclo em PRIMEIRO PLANO");
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Finalizando o ciclo de vida VISÍVEL
        Log.v(CDV_LOGCAT_TAG, "onStop: Finalizando ciclo VISÍVEL");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Finalizando o ciclo de vida COMPLETO
        Log.v(CDV_LOGCAT_TAG, "onDestroy: Finalizando ciclo COMPLETO");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        // Preparando execução do onStart
        Log.v(CDV_LOGCAT_TAG, "onRestart: Preparando execução do onStart");
    }

}

package br.edu.ifsp.scl.sdm.ciclodevida;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String CDV_LOGCAT_TAG = "CDV_LOGCAT_TAG";

    // Views dinâmicas
    private TextView telefoneTextView;
    private EditText telefoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telefoneTextView = new TextView(this);
        telefoneTextView.setText("Telefone");

        telefoneEditText = new EditText(this);
        telefoneEditText.setHint("Digite aqui seu telefone");
        telefoneEditText.setInputType(InputType.TYPE_CLASS_PHONE);

        /*
        if (savedInstanceState != null) {
            String telefone = savedInstanceState.getString("TELEFONE", null);
            if (telefone != null)
            {
                telefoneEditText.setText(telefone);
            }
        }
        */

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        linearLayout.addView(telefoneTextView, 4);
        linearLayout.addView(telefoneEditText, 5);

        // iniciando o ciclo de vida COMPLETO
        Log.v(CDV_LOGCAT_TAG, "onCreate: Iniciando ciclo COMPLETO");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Salvar os dados de estado dinâmico
        outState.putString("TELEFONE",telefoneEditText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            String telefone = savedInstanceState.getString("TELEFONE", null);
            if (telefone != null)
            {
                telefoneEditText.setText(telefone);
            }
        }
    }

    public void fecharTela(View botao){
        if (botao.getId() == R.id.button){
            finish();
        }
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

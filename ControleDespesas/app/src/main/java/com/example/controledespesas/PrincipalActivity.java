package com.example.controledespesas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class PrincipalActivity extends AppCompatActivity {

    private Spinner spinnerContas;
    private EditText editTextValor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        spinnerContas = (Spinner) findViewById(R.id.spinnerContas);

        ArrayAdapter adapter = ArrayAdapter
                .createFromResource(this,
                        R.array.contas, android.R.layout.simple_spinner_item);
        spinnerContas.setAdapter(adapter);
    }

    public void limparCampos(View view){
        editTextValor.setText(null);
    }
}
package com.example.controledespesaspessoais;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerContas;
    //private EditText editTextValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerContas = (Spinner) findViewById(R.id.spinnerContas);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.contas, android.R.layout.simple_spinner_item);
        spinnerContas.setAdapter(adapter);

        //editTextValor = findViewById(R.id.editTextValor);

    }

    /*public void limparCampos(View view){
        editTextValor.setText(null);
    }*/

}
package br.com.primeiroapp.calcularidadevoto.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.primeiroapp.calcularidadevoto.R;
import br.com.primeiroapp.calcularidadevoto.control.ResultadoControl;

public class ResultadoActivity extends AppCompatActivity {

    ResultadoControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        control = new ResultadoControl(this);
        control.showResultadoAction();
    }

    public void retornar(View v){
        control.retornarAction();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "passou pelo onDestroy", Toast.LENGTH_SHORT).show();
    }
}

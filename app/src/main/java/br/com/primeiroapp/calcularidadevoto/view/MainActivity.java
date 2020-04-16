package br.com.primeiroapp.calcularidadevoto.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.primeiroapp.calcularidadevoto.R;
import br.com.primeiroapp.calcularidadevoto.control.MainControl;

public class MainActivity extends AppCompatActivity {

    private MainControl control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        control = new MainControl(this);
    }

    public void concluir(View v){
        control.concluirAction();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "passou pelo estart", Toast.LENGTH_SHORT).show();
    }
}

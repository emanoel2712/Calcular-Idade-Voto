package br.com.primeiroapp.calcularidadevoto.control;

import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

import br.com.primeiroapp.calcularidadevoto.R;
import br.com.primeiroapp.calcularidadevoto.model.Eleitor;
import br.com.primeiroapp.calcularidadevoto.model.EleitorBO;
import br.com.primeiroapp.calcularidadevoto.view.ResultadoActivity;

public class MainControl {

    private Activity activity;

    private EditText editNome;

    private NumberPicker npIdade;

    public MainControl(Activity activity) {
        this.activity = activity;
        initComponents();
    }


    private void initComponents(){

        editNome = activity.findViewById(R.id.editNome);
        npIdade = activity.findViewById(R.id.npIdade);
        configNumberPicker();
    }


    private void configNumberPicker(){
        npIdade.setMaxValue(120);
        npIdade.setMinValue(0);
        npIdade.setValue(20);
    }

    private boolean valida(EleitorBO eleitorBO){

        if (!eleitorBO.validaNome()){
            editNome.setError("Informe seu nome");
            return false;
        }

        if (!eleitorBO.validaIDade()){
            Toast.makeText(activity, "Informe sua idade", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true ;
    }


    public void concluirAction(){

        Eleitor eleitor = new Eleitor();

        eleitor.setNome(editNome.getText().toString());
        eleitor.setIdade(npIdade.getValue());

        EleitorBO eleitorBO = new EleitorBO(eleitor);

        if (valida(eleitorBO)){
            Intent it = new Intent(activity , ResultadoActivity.class);
            it.putExtra("eleitor", eleitor);
            activity.startActivity(it);
        }
    }
}

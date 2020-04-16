package br.com.primeiroapp.calcularidadevoto.control;

import android.app.Activity;
import android.widget.TextView;

import br.com.primeiroapp.calcularidadevoto.R;
import br.com.primeiroapp.calcularidadevoto.model.Eleitor;
import br.com.primeiroapp.calcularidadevoto.model.EleitorBO;

public class ResultadoControl {

    private Activity activity;

    private TextView tvNome;

    private  TextView tvIdade;

    private  TextView tvPodeVotar;



    public ResultadoControl(Activity activity) {
        this.activity = activity;
        initComponents();


    }

    private void initComponents(){

        tvNome = activity.findViewById(R.id.tvNome);
        tvIdade = activity.findViewById(R.id.tvIdade);
        tvPodeVotar = activity.findViewById(R.id.tvPodeVotar);

    }

    public void showResultadoAction(){

        Eleitor eleitor = (Eleitor) activity.getIntent().getSerializableExtra("eleitor");

        EleitorBO eleitorBO =  new EleitorBO(eleitor);

        tvNome.setText("Nome: " + eleitor.getNome());
        tvIdade.setText("Idade: " + eleitor.getIdade());
        tvPodeVotar.setText("Pode Votar " + eleitorBO.getTextPodeVotar());

    }

    public void retornarAction(){
        activity.finish();
    }
}

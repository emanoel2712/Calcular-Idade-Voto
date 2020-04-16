package br.com.primeiroapp.calcularidadevoto.model;

public class EleitorBO {

    private Eleitor eleitor;

    public EleitorBO(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public boolean isPodeVoltar() {
        return eleitor.getIdade() > 16;

    }

    public String getTextPodeVotar() {

        if (isPodeVoltar()) {
            return "Sim";
        }
        return "não";
    }

    public boolean validaNome() {
        return eleitor.getNome() != null && !eleitor.getNome().isEmpty();

    }

    public boolean validaIDade() {
        return eleitor.getIdade() != null && eleitor.getIdade() >= 0;
    }

}

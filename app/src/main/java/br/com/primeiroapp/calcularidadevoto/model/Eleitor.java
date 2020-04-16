package br.com.primeiroapp.calcularidadevoto.model;

import java.io.Serializable;

public class Eleitor implements Serializable {

    private String nome;

    private Integer idade;


    public Eleitor() {

    }

    public Eleitor(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

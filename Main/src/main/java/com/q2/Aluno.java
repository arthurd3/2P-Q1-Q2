package com.q2;

public class Aluno {

    private String nome;
    private int votos;

    public Aluno(String nome) {
        this.nome = nome;
        this.votos = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setVotos(int voto) {
        this.votos += voto;
    }

    public int getVotos() {
        return this.votos;
    }
}

package com.q1;

public class Despesa {
    private int mesAno;
    private String descricao;
    private double valor;
    private boolean taxaExtra;

    public Despesa(int mesAno, String descricao, double valor, boolean taxaExtra) {
        this.mesAno = mesAno;
        this.descricao = descricao;
        this.valor = valor;
        this.taxaExtra = taxaExtra;
    }

    public int getMesAno() {
        return mesAno;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isTaxaExtra() {
        return taxaExtra;
    }


    public void setMesAno(int mesAno) {
        this.mesAno = mesAno;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTaxaExtra(boolean taxaExtra) {
        this.taxaExtra = taxaExtra;
    }

}

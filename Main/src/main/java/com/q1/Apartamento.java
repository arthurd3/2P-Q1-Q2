package com.q1;


public class Apartamento extends Imovel {
    private int nroQuarto;

    public Apartamento(int numero, int metrosQuadrados, String proprietario , int nroQuarto) {
        super(numero, metrosQuadrados, proprietario);
        this.nroQuarto = nroQuarto;
    }

    @Override
    public double valorVenal() {
        return super.valorVenal() + (nroQuarto * 500);
    }

    public int getNroQuarto() {
        return nroQuarto;
    }

    public void setNroQuarto(int nroQuarto) {
        this.nroQuarto = nroQuarto;
    }
}

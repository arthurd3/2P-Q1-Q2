package com.q1;

public class Cobertura extends Imovel {

    private boolean duplex;
    private boolean triplex;

    public Cobertura(int numero, int metrosQuadrados, String proprietario , boolean duplex , boolean triplex) {
        super(numero, metrosQuadrados, proprietario);
        this.duplex = duplex;
        this.triplex = triplex;
    }

    @Override
    public double valorVenal() {
        double valorVenal = super.valorVenal();
        if (this.duplex) {
            valorVenal = valorVenal * 2;
        }else if(this.triplex) {
            valorVenal = valorVenal * 3;
        }
        return valorVenal;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public boolean isTriplex() {
        return triplex;
    }

    public void setTriplex(boolean triplex) {
        this.triplex = triplex;
    }
}

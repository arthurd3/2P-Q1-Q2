package com.q1;

public class Pagamento {
    private int mesAno;
    private double valorPago;
    private Condominio condominio;


    public Pagamento(int mesAno, double valorPago, Condominio condominio) {
        this.mesAno = mesAno;
        this.valorPago = valorPago;
        this.condominio = condominio;
    }

    public int getMesAno() {
        return mesAno;
    }

    public void setMesAno(int mesAno) {
        this.mesAno = mesAno;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

}

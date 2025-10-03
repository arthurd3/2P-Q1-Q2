package com.q1;

public class Imovel {

    private int numero;
    protected int metrosQuadrados;
    private String proprietario;
    private Condominio condominio;
    private Pagamento pagamento;

    public Imovel(int numero, int metrosQuadrados, String proprietario) {
        this.numero = numero;
        this.metrosQuadrados = metrosQuadrados;
        this.proprietario = proprietario;
    }

    public double valorVenal(){
        return this.metrosQuadrados * 1000;
    }

    public double valorVenda(){
        double valorVenda = valorVenal();
        double IRRF = valorVenda * 0.15;
        return valorVenda - IRRF;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMetrosQuadrados() {
        return metrosQuadrados;
    }

    public void setMetrosQuadrados(int metrosQuadrados) {
        this.metrosQuadrados = metrosQuadrados;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

}

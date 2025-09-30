package com.q1;

public class Casa extends Imovel implements CondominioFechado{

    // Variável para a área DO TERRENO
    private int metragemTerreno;

    public Casa(int numero, int metrosQuadrados, String proprietario , int metragemTerreno) {
        super(numero, metrosQuadrados, proprietario); // 'metrosQuadrados' aqui é a área DA CASA
        this.metragemTerreno = metragemTerreno;
    }

    @Override
    public double valorVenal() {
        return metrosQuadrados * 1500;
    }

    @Override
    public double valorVenda() {
        return super.valorVenda() + valorTerreno();
    }

    // a metragem quadrada de quê? Do terreno ou da casa?
    // no caso e o valor do terreno
    @Override
    public double valorTerreno() {
        return this.metragemTerreno * 350;
    }

    public int getMetragemTerreno() {
        return metragemTerreno;
    }

    public void setMetragemTerreno(int metragemTerreno) {
        this.metragemTerreno = metragemTerreno;
    }
}

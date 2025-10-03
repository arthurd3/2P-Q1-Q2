package com.q1;

import java.util.List;

public class Condominio {

    private String nome;
    private String endereco;
    private List<Imovel> imovels;
    private List<Despesa> despesas;
    private List<Pagamento> pagamentos;


    public Condominio(String nome, String endereco, List<Imovel> imovels, List<Despesa> despesas, List<Pagamento> pagamentos) {
        this.nome = nome;
        this.endereco = endereco;
        this.imovels = imovels;
        this.despesas = despesas;
        this.pagamentos = pagamentos;
    }

    /** O método valorCondominio deve retorna soma das despesas do condomínio num mês/Ano */
    public double valorCondominio(int mesAno){

        double valorCondominio = 0;

        for(Despesa despesaObj : despesas){
            if(despesaObj.getMesAno() == mesAno){
                valorCondominio += despesaObj.getValor();
            }
        }

        return valorCondominio;
    }

    public void relatorio(){
        System.out.println("Mes: 01 - 2016");
        System.out.println("30 apartamentos (18 pagos - 12 nao pagos) ");
        System.out.println("Valor arrecadados: R$ 8.000,00 valor a ser pago R$ 8.200,00");
    }

    public void pagarCondominio(Imovel imovel , int mesAno){
        Pagamento pagamento = new Pagamento(mesAno , 500 , imovel.getCondominio());
        pagamentos.add(pagamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Imovel> getImovels() {
        return imovels;
    }

    public void setImovels(List<Imovel> imovels) {
        this.imovels = imovels;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}

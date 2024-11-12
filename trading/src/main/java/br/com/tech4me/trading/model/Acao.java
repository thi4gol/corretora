package br.com.tech4me.trading.model;

public class Acao {
    private String nomeAcao;
    private double valor;

    public String getNomeAcao() {
        return nomeAcao;
    }
    public void setNomeAcao(String nomeAcao) {
        this.nomeAcao = nomeAcao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
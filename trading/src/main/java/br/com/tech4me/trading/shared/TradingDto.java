package br.com.tech4me.trading.shared;

import br.com.tech4me.trading.model.Acao;

public class TradingDto {
    private String nomeInvestidor;
    private String idAcao;
    private Acao dadosAcao;
    private double valor;

    public String getNomeInvestidor() {
        return nomeInvestidor;
    }
    public void setNomeInvestidor(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }
    public String getIdAcao() {
        return idAcao;
    }
    public void setIdAcao(String idAcao) {
        this.idAcao = idAcao;
    }
    public Acao getDadosAcao() {
        return dadosAcao;
    }
    public void setDadosAcao(Acao dadosAcao) {
        this.dadosAcao = dadosAcao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
package br.com.tech4me.acoes.shared;

import org.springframework.data.annotation.Id;

public class AcaoDto {
    @Id
    private String id;
    private String nomeAcao;
    private double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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

package br.com.tech4me.acoes.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("acoes")
public class Acao {
    @Id
    private String id;
    private String nomeEmpresa;
    private String nomeAcao;
    private double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
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
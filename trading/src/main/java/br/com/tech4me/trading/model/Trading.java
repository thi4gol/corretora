package br.com.tech4me.trading.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("tradings")
public class Trading {
    @Id
    private String id;
    private String nomeInvestidor;
    private String idAcao;
    private Double valor;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
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
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
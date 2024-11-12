package br.com.tech4me.trading.shared;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class TradingCompletoDto {
    private String id;
    private String nomeInvestidor;
    @NotEmpty(message = "Campo Acao deve ser informado")
    @NotBlank(message = "Tem que informar os caracteres")
    private String idAcao;
    @Positive(message = "Valor deve ser informado")
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
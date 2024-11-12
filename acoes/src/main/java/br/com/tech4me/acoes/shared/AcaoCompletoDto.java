package br.com.tech4me.acoes.shared;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public class AcaoCompletoDto {
    private String id;
    @NotEmpty(message = "Campo nomeEmpresa deve ser informado")
    @NotBlank(message = "Tem que informar os caracteres")
    private String nomeEmpresa;
    @NotEmpty(message = "Campo nomeAcao deve ser informado")
    private String nomeAcao;
    @Positive(message = "Valor deve ser informado!")
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
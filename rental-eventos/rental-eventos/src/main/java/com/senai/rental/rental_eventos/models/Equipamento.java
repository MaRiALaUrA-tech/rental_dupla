package com.senai.rental.rental_eventos.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="equipamento")
public class Equipamento {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @NotBlank(message = "Adicione um equipamento")
    @Column(name="equipamento_id")
    private Integer equipamentoId;

    @NotBlank(message = "Coloque o nome do equipamento")
    @Column(name="nome_equipamento")
    private String nomeEquipamento;

    @NotBlank(message = "Coloque a marca do equipamento")
    @Column(name="marca")
    private String marca;

    @NotBlank(message = "Coloque o modelo do equipamento")
    @Column(name="modelo")
    private String modelo;

    @NotBlank(message = "Coloque a potência do equipamento")
    @Column(name="potencia")
    private String potencia;

    @NotBlank(message = "Coloque o material do equipamento")
    @Column(name="material")
    private String material;

    @NotNull(message="Coloque o peso")
    @Column(name="peso")
    private BigDecimal peso;

    @NotBlank(message="Coloque as dimensões")
    @Column(name="dimensoes")
    private String dimensoes;

    @NotBlank(message="Coloque a cor/cores do equipamento")
    @Column(name="cor")
    private String cor;

    @NotNull(message="Indique a quantidade total")
    @Column(name="qtd_total")
    private Integer qtdTotal;

    @NotNull(message="Indique a quantidade disponível")
    @Column(name="qtd_disponivel")
    private Integer qtdDisponivel;

    @NotNull(message="Indique a quantidade mínima")
    @Column(name="qtd_minima")
    private Integer qtdMinima;

    @Column(name="status_equipamento")
    private Boolean statusEquipamento;

    public Equipamento(){}

    public Equipamento(Integer equipamentoId, String nomeEquipamento, String marca, String modelo, String potencia,
            String material, BigDecimal peso, String dimensoes, String cor, Integer qtdTotal, Integer qtdDisponivel,
            Integer qtdMinima, Boolean statusEquipamento) {
        this.equipamentoId = equipamentoId;
        this.nomeEquipamento = nomeEquipamento;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.material = material;
        this.peso = peso;
        this.dimensoes = dimensoes;
        this.cor = cor;
        this.qtdTotal = qtdTotal;
        this.qtdDisponivel = qtdDisponivel;
        this.qtdMinima = qtdMinima;
        this.statusEquipamento = statusEquipamento;
    }

    public Integer getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(Integer equipamentoId) {
        this.equipamentoId = equipamentoId;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNome(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQtdTotal() {
        return qtdTotal;
    }

    public void setQtdTotal(Integer qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public Integer getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(Integer qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    public Integer getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(Integer qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public Boolean getStatusEquipamento() {
        return statusEquipamento;
    }

    public void setStatusEquipamento(Boolean statusEquipamento) {
        this.statusEquipamento = statusEquipamento;
    }

    
    
}

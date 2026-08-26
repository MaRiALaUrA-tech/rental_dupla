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

    @Column(name="equipamento_id")
    private Integer equipamentoId;

    @Column(name="nome")
    private String nome;

    @Column(name="marca")
    private String marca;

    @Column(name="modelo")
    private String modelo;

    @Column(name="potencia")
    private String potencia;

    @Column(name="material")
    private String material;

    @Column(name="peso")
    private BigDecimal peso;

    @Column(name="dimensoes")
    private String dimensoes;

    @Column(name="cor")
    private String cor;

    @Column(name="qtd_total")
    private Integer qtdTotal;

    @Column(name="qtd_disponivel")
    private Integer qtdDisponivel;

    @Column(name="qtd_minima")
    private Integer qtdMinima;

    @Column(name="status_equipamento")
    private Boolean statusEquipamento;

    public Equipamento(){}

    public Equipamento(Integer equipamentoId, String nome, String marca, String modelo, String potencia,
            String material, BigDecimal peso, String dimensoes, String cor, Integer qtdTotal, Integer qtdDisponivel,
            Integer qtdMinima, Boolean statusEquipamento) {
        this.equipamentoId = equipamentoId;
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

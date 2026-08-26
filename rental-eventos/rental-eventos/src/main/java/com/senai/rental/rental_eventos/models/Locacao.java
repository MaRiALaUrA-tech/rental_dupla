package com.senai.rental.rental_eventos.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="locacao")
public class Locacao {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="locacao_id")
    private Integer locacaoId;

    @Column(name="qtd_locacao")
    private BigDecimal qtdLocacao;

    @Column(name="data_locacao")
    private LocalDate dataLocacao;

    @Column(name="data_devolucao_prevista")
    private LocalDate dataDevolucaoPrevista;

    @Column(name="data_devolucao")
    private LocalDate dataDevolucao;

    @Column(name="status_locacao")
    private Boolean statusLocacao;

    @Column(name="obs_locacao")
    private String obsLocacao;

    public Locacao(){}

    public Locacao(Integer locacaoId, BigDecimal qtdLocacao, LocalDate dataLocacao, LocalDate dataDevolucaoPrevista,
            LocalDate dataDevolucao, Boolean statusLocacao, String obsLocacao) {
        this.locacaoId = locacaoId;
        this.qtdLocacao = qtdLocacao;
        this.dataLocacao = dataLocacao;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucao = dataDevolucao;
        this.statusLocacao = statusLocacao;
        this.obsLocacao = obsLocacao;
    }

    public Integer getLocacaoId() {
        return locacaoId;
    }

    public void setLocacaoId(Integer locacaoId) {
        this.locacaoId = locacaoId;
    }

    public BigDecimal getQtdLocacao() {
        return qtdLocacao;
    }

    public void setQtdLocacao(BigDecimal qtdLocacao) {
        this.qtdLocacao = qtdLocacao;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDate dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Boolean getStatusLocacao() {
        return statusLocacao;
    }

    public void setStatusLocacao(Boolean statusLocacao) {
        this.statusLocacao = statusLocacao;
    }

    public String getObsLocacao() {
        return obsLocacao;
    }

    public void setObsLocacao(String obsLocacao) {
        this.obsLocacao = obsLocacao;
    }

    
}

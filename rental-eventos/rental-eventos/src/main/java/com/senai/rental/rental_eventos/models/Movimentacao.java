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
@Table(name="Movimentacao")
public class Movimentacao {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="movimentacao_id")
    private Integer movimentacaoId;

    @Column(name="tipo_movimentacao")
    private String tipoMovimentacao;

    @Column(name="qtd_movimentacao")
    private BigDecimal qtdMovimentacao;

    @Column(name="data_movimentacao")
    private LocalDate dataMovimentacao;

    @Column(name="obs_movimentacao")
    private String obsMovimentacao;

    public Movimentacao () {}

    public Movimentacao(Integer movimentacaoId, String tipoMovimentacao, BigDecimal qtdMovimentacao, LocalDate dataMovimentacao, String obsMovimentacao) {
        this.movimentacaoId = movimentacaoId;
        this.tipoMovimentacao = tipoMovimentacao;
        this.qtdMovimentacao = qtdMovimentacao;
        this.dataMovimentacao = dataMovimentacao;
        this.obsMovimentacao = obsMovimentacao;
    }

    public Integer getMovimentacaoId() {
        return movimentacaoId;
    }

    public void setMovimentacaoId(Integer movimentacaoId) {
        this.movimentacaoId = movimentacaoId;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public BigDecimal getQtdMovimentacao() {
        return qtdMovimentacao;
    }

    public void setQtdMovimentacao(BigDecimal qtdMovimentacao) {
        this.qtdMovimentacao = qtdMovimentacao;
    }

    public LocalDate getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(LocalDate dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public String getObsMovimentacao() {
        return obsMovimentacao;
    }

    public void setObsMovimentacao(String obsMovimentacao) {
        this.obsMovimentacao = obsMovimentacao;
    }

    
}


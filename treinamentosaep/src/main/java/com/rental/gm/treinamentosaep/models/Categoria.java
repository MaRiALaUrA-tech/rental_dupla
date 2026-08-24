package com.rental.gm.treinamentosaep.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
@Table(name="categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="categoria_id")
    private Integer categoriaId;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    public Categoria (){}

    public Categoria(Integer categoriaId, String descricao, String nome) {
        this.categoriaId = categoriaId;
        this.descricao = descricao;
        this.nome = nome;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    
}

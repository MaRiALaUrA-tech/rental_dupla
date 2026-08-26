package com.senai.rental.rental_eventos.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="usuario_id")
    private Integer usuarioId;

    @Column(name="nome_completo")
    private String nomeCompleto;

    @Column(name="cpf")
    private String cpf;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private String senha;

    @Column(name="tipo_usuario")
    private String tipoUsuario;

    @Column(name="codigo_verif_func")
    private Integer codigoVerifFunc;

    public Usuario () {}

    public Usuario(Integer usuarioId, String nomeCompleto, String cpf, String email, String senha, String tipoUsuario,
            Integer codigoVerifFunc) {
        this.usuarioId = usuarioId;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.codigoVerifFunc = codigoVerifFunc;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Integer getCodigoVerifFunc() {
        return codigoVerifFunc;
    }

    public void setCodigoVerifFunc(Integer codigoVerifFunc) {
        this.codigoVerifFunc = codigoVerifFunc;
    }

    

    

    
    

}

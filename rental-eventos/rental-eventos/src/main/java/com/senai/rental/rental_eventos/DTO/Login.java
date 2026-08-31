package com.senai.rental.rental_eventos.DTO;

public class Login{
    @NotBlank(message="E-mail obrigatório.")
    private String email;

    @NotBlank(message="Senha obrigatória.")
    private String senha;

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
}
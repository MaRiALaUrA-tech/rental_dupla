package com.senai.rental.rental_eventos.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.senai.rental.rental_eventos.DTO.Login;
import com.senai.rental.rental_eventos.models.Usuario;
import com.senai.rental.rental_eventos.repositories.UsuarioRepository;


//Login - 4
@Service
public class LoginService{

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;


    public LoginService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder, TokenService tokenService) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
        this.tokenService = tokenService;
    }

    public String logar(Login login){
        Usuario usuario = usuarioRepository.findByEmail(login.getEmail())
            .orElseThrow(() -> new RuntimeException("Usuário ou senha inválidos."));
            if (!passwordEncoder.matches(login.getSenha(), usuario.getSenha())){
                throw new RuntimeException("Usuário ou senha inválidos");
            }
            return tokenService.gerarToken(usuario); 
    }
}

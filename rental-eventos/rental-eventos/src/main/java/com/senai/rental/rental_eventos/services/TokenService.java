package com.senai.rental.rental_eventos.services;

import java.time.Instant;

import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.senai.rental.rental_eventos.models.Usuario;

@Service
public class TokenService {
    private String chaveSecreta = "kikuzinholindo"; // Definição da assinatura da minha API. Evitar hackers.

    public String gerarToken(Usuario usuario){
        Algorithm algoritmo = Algorithm.HMAC256(chaveSecreta);
        return JWT.create()
                .withSubject(usuario.getEmail())
                .withExpiresAt(Instant.now().plusSeconds(7200))
                .sign(algoritmo);
    }
    
}

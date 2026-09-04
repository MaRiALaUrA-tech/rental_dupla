package com.senai.rental.rental_eventos.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.rental.rental_eventos.DTO.Login;
import com.senai.rental.rental_eventos.services.LoginService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public ResponseEntity<String> logar(@RequestBody @Valid Login login){
        String token = loginService.logar(login);
        return ResponseEntity.ok(token);
    }
    
}

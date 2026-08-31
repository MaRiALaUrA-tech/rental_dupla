package com.senai.rental.rental_eventos.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Rental Eventos em Dupla :-)",
        version = "1.0",
        description = "API de simulado prático SAEP 2026"
    )
)
public class Swagger {}
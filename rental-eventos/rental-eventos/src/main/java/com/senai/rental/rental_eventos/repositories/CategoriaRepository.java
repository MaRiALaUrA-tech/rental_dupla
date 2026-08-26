package com.senai.rental.rental_eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.rental.rental_eventos.models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{}

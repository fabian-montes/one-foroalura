package com.aluracursos.aluraforo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aluracursos.aluraforo.modelos.Topico;

public interface Repositorio extends JpaRepository<Topico, Long> {

}
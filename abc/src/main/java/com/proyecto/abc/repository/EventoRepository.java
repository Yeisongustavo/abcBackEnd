package com.proyecto.abc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.abc.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}

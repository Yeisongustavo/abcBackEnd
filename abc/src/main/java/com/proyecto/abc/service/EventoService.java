package com.proyecto.abc.service;

import java.util.List;

import com.proyecto.abc.model.Evento;

public interface EventoService {

	List<Evento> buscarTodos();
	void guardar(Evento evento);
	void eliminar(Long id);
	
}

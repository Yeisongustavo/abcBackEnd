package com.proyecto.abc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.abc.model.Evento;
import com.proyecto.abc.service.EventoService;

@RestController
@RequestMapping("/api")
public class EventoController {

	@Autowired
	private EventoService eventoService;

	@GetMapping("/consultar")
	public List<Evento> buscarTodos() {
		return eventoService.buscarTodos();
	}

	@PostMapping("/guardar")
	public List<Evento> guardar(@RequestBody Evento evento) {
		eventoService.guardar(evento);
		return eventoService.buscarTodos();
	}

	@PutMapping("/actualizar")
	public List<Evento> actualizar(@RequestBody Evento evento) {
		eventoService.guardar(evento);
		return eventoService.buscarTodos();
	}

	@DeleteMapping("/eliminar/{id}")
	public List<Evento> eliminar(@PathVariable("id") Long id) {
		eventoService.eliminar(id);
		return eventoService.buscarTodos();
	}

}

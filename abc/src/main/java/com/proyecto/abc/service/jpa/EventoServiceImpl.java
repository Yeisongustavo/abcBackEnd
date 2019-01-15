package com.proyecto.abc.service.jpa;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.abc.model.Evento;
import com.proyecto.abc.repository.EventoRepository;
import com.proyecto.abc.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService {

	@Autowired
	private EventoRepository eventoRepository;

	@Override
	public List<Evento> buscarTodos() {
		return eventoRepository.findAll();
	}

	@Override
	public void guardar(Evento evento) {
		if (evento.getIdEvento() == null) {
			evento.setFechaCreacion(new Date());
		} else {
			evento.setFechaCreacion(new Date());
		}
		eventoRepository.save(evento);
	}

	@Override
	public void eliminar(Long id) {
		eventoRepository.deleteById(id);
	}

}

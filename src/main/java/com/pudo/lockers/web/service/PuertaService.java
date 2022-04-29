package com.pudo.lockers.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pudo.lockers.web.interfaces.I_PuertasInterface;
import com.pudo.lockers.web.model.PuertaBloqueada;
import com.pudo.lockers.web.repository.I_PuertasRepository;

@Service
public class PuertaService implements I_PuertasInterface {

	@Autowired
	private I_PuertasRepository prepo;
	
	@Override
	public List<PuertaBloqueada> buscarTodas() {
		return prepo.findAll();
	}

	@Override
	public PuertaBloqueada buscarPorId(Integer idPuerta) {
		Optional<PuertaBloqueada> opt = prepo.findById(idPuerta);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public void guardar(PuertaBloqueada puerta) {
		prepo.save(puerta);

	}

	@Override
	public void eliminar(Integer idPuerta) {
		prepo.deleteById(idPuerta);

	}

}

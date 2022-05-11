package com.pudo.lockers.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pudo.lockers.web.interfaces.I_ConectividadInterface;
import com.pudo.lockers.web.model.Conectividad;
import com.pudo.lockers.web.repository.I_ConectividadRepository;

@Service
public class ConectividadService implements I_ConectividadInterface {

	@Autowired
	private I_ConectividadRepository crepo;
	
	@Override
	public List<Conectividad> buscarTodas() {
		return crepo.findAll();
	}

	@Override
	public Conectividad buscarPorId(Integer idConectividad) {
		Optional<Conectividad> opt = crepo.findById(idConectividad);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public void guardar(Conectividad conectividad) {
		crepo.save(conectividad);

	}

	@Override
	public void eliminar(Integer idConectividad) {
		crepo.deleteById(idConectividad);

	}


}

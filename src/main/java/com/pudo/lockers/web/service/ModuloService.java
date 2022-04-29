package com.pudo.lockers.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pudo.lockers.web.interfaces.I_ModuloInterface;
import com.pudo.lockers.web.model.Modulo;
import com.pudo.lockers.web.repository.I_ModuloRepository;

@Service
public class ModuloService implements I_ModuloInterface {

	@Autowired
	private I_ModuloRepository mrepo;
	
	@Override
	public List<Modulo> buscarTadas() {
		return mrepo.findAll();
	}

	@Override
	public Modulo buscarPorId(Integer idModulo) {
		Optional<Modulo> opt = mrepo.findById(idModulo);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public void guardar(Modulo modulo) {
		mrepo.save(modulo);		
	}

	@Override
	public void eliminar(Integer idModulo) {
		mrepo.deleteById(idModulo);
		
	}

}

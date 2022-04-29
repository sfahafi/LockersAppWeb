package com.pudo.lockers.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pudo.lockers.web.interfaces.I_HistoricoInterface;
import com.pudo.lockers.web.model.Historico;
import com.pudo.lockers.web.repository.I_HistoricoRepository;

@Service
public class HistoricoService implements I_HistoricoInterface{

	@Autowired
	private I_HistoricoRepository hrepo;
	
	@Override
	public List<Historico> buscarTodas() {
		return hrepo.findAll();
	}

	@Override
	public Historico buscarPorId(Integer idHistorico) {
		Optional<Historico> opt = hrepo.findById(idHistorico);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public void guardar(Historico historico) {
		hrepo.save(historico);
		
	}

	@Override
	public void eliminar(Integer idHistorico) {
		hrepo.deleteById(idHistorico);
		
	}

}

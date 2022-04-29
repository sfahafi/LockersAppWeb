package com.pudo.lockers.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pudo.lockers.web.interfaces.I_TerminalInterface;
import com.pudo.lockers.web.model.Terminal;
import com.pudo.lockers.web.repository.I_TerminalRepository;

@Service
public class TerminalService implements I_TerminalInterface {

	@Autowired
	private I_TerminalRepository trepo;
	
	@Override
	public List<Terminal> buscarTodas() {
		return trepo.findAll();
	}

	@Override
	public Terminal buscarPorId(Integer idTerminal) {
		Optional<Terminal> opt = trepo.findById(idTerminal);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public void guardar(Terminal terminal) {
		trepo.save(terminal);

	}

	@Override
	public void eliminar(Integer idTerminal) {
		trepo.deleteById(idTerminal);

	}

}

package com.pudo.lockers.web.interfaces;

import java.util.List;

import com.pudo.lockers.web.model.Terminal;

public interface I_TerminalInterface {

	List<Terminal> buscarTodas();
	Terminal buscarPorId(Integer idTerminal);
	void guardar(Terminal terminal);
	void eliminar(Integer idTerminal);
	
}

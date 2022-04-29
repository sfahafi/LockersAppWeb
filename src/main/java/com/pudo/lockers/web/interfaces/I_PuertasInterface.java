package com.pudo.lockers.web.interfaces;

import java.util.List;

import com.pudo.lockers.web.model.PuertaBloqueada;

public interface I_PuertasInterface {

	List<PuertaBloqueada> buscarTodas();
	PuertaBloqueada buscarPorId(Integer idPuerta);
	void guardar(PuertaBloqueada puerta);
	void eliminar(Integer idPuerta);
	
}

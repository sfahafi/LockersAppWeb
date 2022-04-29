package com.pudo.lockers.web.interfaces;

import java.util.List;

import com.pudo.lockers.web.model.Modulo;

public interface I_ModuloInterface {

	List<Modulo> buscarTadas();
	Modulo buscarPorId(Integer idModulo);
	void guardar(Modulo modulo);
	void eliminar(Integer idModulo);
	
}

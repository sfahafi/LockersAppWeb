package com.pudo.lockers.web.interfaces;

import java.util.List;

import com.pudo.lockers.web.model.Conectividad;

public interface I_ConectividadInterface {

	List<Conectividad> buscarTodas();
	Conectividad buscarPorId(Integer idConectividad);
	void guardar(Conectividad conectividad);
	void eliminar(Integer idConectividad);
}

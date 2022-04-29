package com.pudo.lockers.web.interfaces;

import java.util.List;

import com.pudo.lockers.web.model.Historico;

public interface I_HistoricoInterface {

	List<Historico> buscarTodas();
	Historico buscarPorId(Integer idHistorico);
	void guardar(Historico historico);
	void eliminar(Integer idHistorico);
	
}

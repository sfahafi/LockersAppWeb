package com.pudo.lockers.web.interfaces;

import java.util.List;

import com.pudo.lockers.web.model.Usuario;

public interface I_UsuarioInterface {

	List<Usuario> buscarTodas();
	Usuario buscarPorId(Integer idUsuario);
	void guardar(Usuario usuario);
	void eliminar(Integer idUsuario);
	
}

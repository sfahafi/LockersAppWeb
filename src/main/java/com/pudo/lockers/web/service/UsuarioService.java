package com.pudo.lockers.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pudo.lockers.web.interfaces.I_UsuarioInterface;
import com.pudo.lockers.web.model.Usuario;
import com.pudo.lockers.web.repository.I_UsuarioRepository;

@Service
public class UsuarioService implements I_UsuarioInterface {

	@Autowired
	private I_UsuarioRepository urepo;
	
	@Override
	public List<Usuario> buscarTodas() {
		return urepo.findAll();
	}

	@Override
	public Usuario buscarPorId(Integer idUsuario) {
		Optional<Usuario> opt = urepo.findById(idUsuario);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public void guardar(Usuario usuario) {
		urepo.save(usuario);

	}

	@Override
	public void eliminar(Integer idUsuario) {
		urepo.deleteById(idUsuario);

	}

}

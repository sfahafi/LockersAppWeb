package com.pudo.lockers.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pudo.lockers.web.model.Usuario;

public interface I_UsuarioRepository extends JpaRepository<Usuario, Integer> {

}

package com.pudo.lockers.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pudo.lockers.web.model.Conectividad;

public interface I_ConectividadRepository extends JpaRepository<Conectividad, Integer> {

	Conectividad findByIdTerminal(int idTerminal);
	
}

package com.pudo.lockers.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pudo.lockers.web.model.PuertaBloqueada;

public interface I_PuertasRepository extends JpaRepository<PuertaBloqueada, Integer> {

}

package com.pudo.lockers.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pudo.lockers.web.model.Terminal;

public interface I_TerminalRepository extends JpaRepository<Terminal, Integer> {

}

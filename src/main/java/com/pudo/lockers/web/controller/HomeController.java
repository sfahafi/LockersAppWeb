package com.pudo.lockers.web.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pudo.lockers.web.interfaces.I_TerminalInterface;
import com.pudo.lockers.web.model.Terminal;

@Controller
public class HomeController {

	@Autowired
	private I_TerminalInterface terminal;
	
	@GetMapping("/tabla")
	public String listaTerminales(Model model) {
		List<Terminal> lista = terminal.buscarTodas();
		model.addAttribute("terminales", lista);
		return "listTerm";
	}
	
	@GetMapping("/tablas")
	public String mostrarTablas() {

		return "listTerminales";
	}
	
}

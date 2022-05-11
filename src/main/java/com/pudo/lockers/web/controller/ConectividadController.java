package com.pudo.lockers.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pudo.lockers.web.model.Conectividad;
import com.pudo.lockers.web.repository.I_ConectividadRepository;
import com.pudo.lockers.web.service.ConectividadService;

@Controller
@RequestMapping("/conectividades")
public class ConectividadController {

	
	@Autowired
	private ConectividadService conectServ;
	
	@GetMapping("/mostrar/{id}")
	public String verConectividad(@PathVariable("id") int idTerminal, Model model) {
		
		Conectividad conectividad = conectServ.(idTerminal);
		model.addAttribute("conectividad", conectividad);
		return "terminales/conectividad";
	}
	
}

package com.pudo.lockers.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pudo.lockers.web.interfaces.I_ConectividadInterface;
import com.pudo.lockers.web.model.Conectividad;

@Controller
@RequestMapping("/conectividades")
public class ConectividadController {

	@Autowired
	private I_ConectividadInterface iConectividad;
	
	@GetMapping("/lista")
	public String lista(Model model) {
		List<Conectividad> lista = iConectividad.buscarTodas();
		model.addAttribute("conectividades", lista);
		return "conectividades/listConectividades8";
	}
	
}

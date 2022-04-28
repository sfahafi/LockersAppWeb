package com.pudo.lockers.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

	@GetMapping("/tabla")
	public String mostrarTabla() {

		return "listTerm";
	}
	
	@GetMapping("/tablas")
	public String mostrarTablas() {

		return "listTerminales";
	}
	
}

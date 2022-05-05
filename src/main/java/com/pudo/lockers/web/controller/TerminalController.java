package com.pudo.lockers.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pudo.lockers.web.interfaces.I_TerminalInterface;
import com.pudo.lockers.web.model.Terminal;

@Controller
@RequestMapping("/terminales")
public class TerminalController {

	
	@Autowired
	private I_TerminalInterface terminal;
	
	@GetMapping("/caba")
	public String listaCaba(Model model) {
		List<Terminal> lista = terminal.buscarTodas();
		model.addAttribute("terminales", lista);
		return "terminales/listCaba";
	}
	
}

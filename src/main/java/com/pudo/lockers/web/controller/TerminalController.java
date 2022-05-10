package com.pudo.lockers.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	@GetMapping("/create")
	public String crear(Terminal terminal) {
		return "terminales/formTerminales";
	}

	// Metodo save utilizando Data Binding
	@PostMapping("/save")
	public String guardar(Terminal term, BindingResult result, RedirectAttributes attributes) { // BindingResult captura el error en la bariable
																		// result
		if (result.hasErrors()){		
			System.out.println("Existieron errores");
			return "terminales/formTerminales";
		}


		terminal.guardar(term);
		attributes.addFlashAttribute("msg", "El equipo se registro con éxito!");
		//System.out.println("Terminal: " + term);

		return "redirect:/terminales/caba";
	}

	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	
	
	
}

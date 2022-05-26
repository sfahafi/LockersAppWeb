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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pudo.lockers.web.interfaces.I_ConectividadInterface;
import com.pudo.lockers.web.interfaces.I_TerminalInterface;
import com.pudo.lockers.web.model.Conectividad;

@Controller
@RequestMapping("/conectividades")
public class ConectividadController {

	@Autowired
	private I_ConectividadInterface iConectividad;
	
	@Autowired
	private I_TerminalInterface iTerminal;
	
	@GetMapping("/lista")
	public String lista(Model model) {
		List<Conectividad> lista = iConectividad.buscarTodas();
		model.addAttribute("conectividades", lista);
		return "conectividades/listConectividad";
	}
	
	@GetMapping("/create")
	public String crearConeccion(Conectividad conectividad, Model model) {
		return "conectividades/formConectividad";
	}
	
	@PostMapping("/save")
	public String guardar(Conectividad conectividad, BindingResult result, RedirectAttributes attributes) { // BindingResult captura el error en la bariable
																		// result
		if (result.hasErrors()){		
			System.out.println("Existieron errores");
			return "conectividades/formConectividad";
		}


		iConectividad.guardar(conectividad);
		attributes.addFlashAttribute("msg", "Los datos se registraron con éxito!");
		System.out.println("Conectividad: " + conectividad);

		return "redirect:/conectividades/lista";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") Integer idConectividad, Model model) {
		Conectividad conectividad = iConectividad.buscarPorId(idConectividad);
		model.addAttribute("conectividad", conectividad);
		return "conectividades/formConectividad";
	} 

	
	@ModelAttribute
	public void setGenericos(Model model) {
		model.addAttribute("terminales", iTerminal.buscarTodas());
	}
	
	
	
}

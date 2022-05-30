package com.pudo.lockers.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
//import org.springframework.data.domain.Example;
//import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pudo.lockers.web.interfaces.I_TerminalInterface;
import com.pudo.lockers.web.model.Terminal;

@Controller
@RequestMapping("/terminales")
public class TerminalController {

	
	@Autowired
	private I_TerminalInterface iTerminal;
	
	/*
	@Autowired
	private I_ConectividadInterface iConectividad;
	*/
	
	@GetMapping("/caba")
	public String listaCaba(Model model) {
		List<Terminal> lista = iTerminal.buscarTodas();
		model.addAttribute("terminales", lista);
		return "terminales/listCaba";
	}
	
	@GetMapping("/create")
	public String crear(Terminal terminal) {
		return "terminales/formTerminales";
	}

	// Metodo save utilizando Data Binding
	@PostMapping("/save")
	public String guardar(Terminal terminal, BindingResult result, RedirectAttributes attributes) { // BindingResult captura el error en la bariable
																		// result
		if (result.hasErrors()){		
			System.out.println("Existieron errores");
			return "terminales/formTerminales";
		}


		iTerminal.guardar(terminal);
		attributes.addFlashAttribute("msg", "El equipo se registro con éxito!");
		//System.out.println("Terminal: " + term);

		return "redirect:/terminales/caba";
	}

	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") Integer idTerminal, Model model) {
		Terminal terminal = iTerminal.buscarPorId(idTerminal);
		model.addAttribute("terminal", terminal);
		return "terminales/formTerminales";
	}
	
	@GetMapping("/delete/{id}")
	public String eliminar(@PathVariable("id") int idTerminal, RedirectAttributes attributes) {
		System.out.println("Borrando terminal con id: " + idTerminal);

		try {

			iTerminal.eliminar(idTerminal);
			attributes.addFlashAttribute("msg", "La terminal fue eliminada!"); // para desplegar mensaje en la vista
			// model.addAttribute("id", idVacante);
			
		} catch (Exception ex) {
			attributes.addFlashAttribute("msg", "No es posible eliminar la terminal seleccionada!.");
		}
		
		return "redirect:/terminales/caba";
	}
	
	
	
	/*
    @ModelAttribute
	public void setGenericos(Model model) {
		model.addAttribute("categorias", serviceCategorias.buscarTodas());
	}

	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idVacante, Model model) {

		Vacante vacante = serviceVacantes.buscarPorId(idVacante);

		System.out.println("vacante" + vacante);
		model.addAttribute("vacante", vacante);
		return "detalle";
	}
	 
	 
	 
	 
	 
	@GetMapping("/mostrar")
	public String verConectividad() {
		
		return "terminales/conectividad";
	}
	
	@GetMapping("/search/{id}")
	public String buscar(@ModelAttribute("search") Conectividad conectividad, Model model) {
		System.out.println("Buscando por: " + conectividad);
		
		ExampleMatcher matcher = ExampleMatcher.matching() // equivale a where descripcion like '%?%'
				.withMatcher("idTerminal", ExampleMatcher 
				.GenericPropertyMatchers.contains());
		
		Example<Conectividad> example = Example.of(conectividad, matcher);
		List<Conectividad> lista = iConectividad.buscarByExample(example);
		model.addAttribute("conectividades", lista);
		
		return "verConectividad";
	} 
	*/
	
}

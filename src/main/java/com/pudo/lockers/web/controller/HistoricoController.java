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

import com.pudo.lockers.web.interfaces.I_HistoricoInterface;
import com.pudo.lockers.web.interfaces.I_TerminalInterface;
import com.pudo.lockers.web.model.Historico;

@Controller
@RequestMapping("/historicos")
public class HistoricoController {

	@Autowired
	private I_HistoricoInterface iHistorico;
	
	@Autowired
	private I_TerminalInterface iTerminal;
	
	@GetMapping("/lista")
	public String lista(Model model) {
		List<Historico> lista = iHistorico.buscarTodas();
		model.addAttribute("historicos", lista);
		return "historicos/listHistorico";
	}
	
	@GetMapping("/create")
	public String crearHistorico(Historico historico, Model model) {
		return "historicos/formHistorico";
	}
	
	@PostMapping("/save")
	public String guardar(Historico historico, BindingResult result, RedirectAttributes attributes) {
		
		if (result.hasErrors()){		
			System.out.println("Existieron errores");
			return "historicos/formHistorico";
		}
		
		historico.setEstatus("Pendiente");
		
		iHistorico.guardar(historico);
		attributes.addFlashAttribute("msg", "Se registro la incidencia con éxito!");
		System.out.println("Historico: " + historico);

		return "redirect:/historicos/lista";
	}
	
	
	@GetMapping("/edit/{id}")
	public String editar(@PathVariable("id") Integer idHistorico, Model model) {
		Historico historico = iHistorico.buscarPorId(idHistorico);
		model.addAttribute("historico", historico);
		return "historicos/formHistorico";
	}
	
	@GetMapping("/solved/{id}")
	public String solucion(@PathVariable("id") Integer idHistorico, Model model) {
		Historico historico = iHistorico.buscarPorId(idHistorico);
		historico.setEstatus("Resuelto");
		historico.getTerminal();
		historico.getFechaReporte();
		historico.getReporte();
		historico.getTipo();
		iHistorico.guardar(historico);
		model.addAttribute("historico", historico);
		return "historicos/formSolucion";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@ModelAttribute
	public void setGenericos(Model model) {
		model.addAttribute("terminales", iTerminal.buscarTodas());
	}
	
}

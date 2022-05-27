package com.pudo.lockers.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pudo.lockers.web.interfaces.I_HistoricoInterface;

@Controller
@RequestMapping("/historicos")
public class HistoricoController {

	@Autowired
	private I_HistoricoInterface iHistorico;
	
}

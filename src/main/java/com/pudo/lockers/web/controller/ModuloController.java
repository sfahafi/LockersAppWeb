package com.pudo.lockers.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pudo.lockers.web.interfaces.I_ModuloInterface;

@Controller
@RequestMapping("/modulos")
public class ModuloController {

	@Autowired
	private I_ModuloInterface iModulo;
	
}

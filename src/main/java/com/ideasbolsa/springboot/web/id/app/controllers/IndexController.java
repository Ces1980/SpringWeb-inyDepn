package com.ideasbolsa.springboot.web.id.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ideasbolsa.springboot.web.id.app.models.service.InterfazServicio;



@Controller
public class IndexController {
	
	
	private InterfazServicio servicio;
	
	/**
	 * 
	 *Inyectar dependencia vía método constructor
	 */

	@Autowired
	public IndexController(InterfazServicio servicio) {
		this.servicio = servicio;
	}

	@GetMapping({"/","","/index"})
	public String index(Model model) {
		model.addAttribute("objeto", servicio.operacion());
		return "index";
	}

	

	public void setServicio(InterfazServicio servicio) {
		this.servicio = servicio;
	}
	
	
	

}

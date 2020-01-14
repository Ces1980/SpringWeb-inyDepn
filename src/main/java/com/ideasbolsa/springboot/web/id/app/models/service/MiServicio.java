package com.ideasbolsa.springboot.web.id.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * 
 *
 */
//@Component("miServicioSimple")
public class MiServicio implements InterfazServicio{


	@Override
	public String operacion() {
		return "Ejecutando algún proceso simple con bean....";
	}
	
	
}

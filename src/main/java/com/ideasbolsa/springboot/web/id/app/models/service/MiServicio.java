package com.ideasbolsa.springboot.web.id.app.models.service;

import org.springframework.stereotype.Service;

@Service("miServicioSimple")
public class MiServicio implements InterfazServicio{

//	@Override indica que el método es implementado por herencia 
	@Override
	public String operacion() {
		return "Ejecutando algún proceso importante..inyectando dependencias desde el constructor";
	}
	
	
}

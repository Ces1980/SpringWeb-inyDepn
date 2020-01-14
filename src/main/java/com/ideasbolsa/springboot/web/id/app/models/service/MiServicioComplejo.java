package com.ideasbolsa.springboot.web.id.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


/**
 * Tenemos dos clases que implementan la interfaz "InterfazServicio"
 * Con la anotación @Primary se le da prioridad a la clase que se quiere implementar
 * 
 */
@Primary
@Service("miServicioComplejo")
public class MiServicioComplejo implements InterfazServicio{

	
	@Override
	public String operacion() {
		return "Ejecutando algún proceso complejo....";
	}
	
	
}

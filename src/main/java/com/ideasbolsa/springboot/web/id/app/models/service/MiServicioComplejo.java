package com.ideasbolsa.springboot.web.id.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("miServicioComplejo")
public class MiServicioComplejo implements InterfazServicio{


	@Override
	public String operacion() {
		return "Ejecutando algún proceso complejo....";
	}
	
	
}

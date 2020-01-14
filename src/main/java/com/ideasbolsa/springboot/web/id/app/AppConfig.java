package com.ideasbolsa.springboot.web.id.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ideasbolsa.springboot.web.id.app.models.service.InterfazServicio;
import com.ideasbolsa.springboot.web.id.app.models.service.MiServicio;
import com.ideasbolsa.springboot.web.id.app.models.service.MiServicioComplejo;

/**
 * Se crean componentes que se pueden inyectar usando una clase de tipo
 * @Configuration. En la clase @Configuration se crea un método que permita instanciar un
 * objeto yal mismo tiempo retornarlo y anotada con la anotación @Bean se pueda inyectar 
 * *Cuando se tiene más de una implementación de una interfaz se puede dar el nombre
 * ejemplo: @Bean("miServicioSimple") o con la anotación @Primary para que Spring tome
 * la interfaz que se quiere que tenga prioridad implementar*
 */
@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	@Primary
	public InterfazServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public InterfazServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
}

package com.ideasbolsa.springboot.web.id.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.ideasbolsa.springboot.web.id.app.models.domain.ItemFactura;
import com.ideasbolsa.springboot.web.id.app.models.domain.Producto;
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
	

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Bicicleta Biachi", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		return Arrays.asList(linea1, linea2);
		}

	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarOficina(){
		Producto producto1 = new Producto("Monitor LG LCD ", 250);
		Producto producto2 = new Producto("Notebook ASUS", 500);
		Producto producto3 = new Producto("Impresora HP Multifuncional", 80);
		Producto producto4 = new Producto("Escritorio oficina", 500);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		return Arrays.asList(linea1, linea2, linea3, linea4);
		}
}

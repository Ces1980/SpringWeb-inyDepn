package com.ideasbolsa.springboot.web.id.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


@Component
@RequestScope
public class Factura {

	@Value("${factura.descripcion}")
	private String descripcion;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	@Qualifier("itemsFacturaOficina")
	private List<ItemFactura> items;
	
	
	@PostConstruct
	public void inicializar() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat("Vargas"));
		descripcion = descripcion.concat(" del cliente").concat(cliente.getNombre());
	}
	
	/**
	 * @PreDestroy destruye cuando se termina de ejecutar el programa o se
	 * ordena el termino de ejecucion de nuestro programa en el servidor
	 *
	 */
	@PreDestroy
	public void destruir() {
		System.out.println("Factura destruida: ".concat(descripcion));
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

}

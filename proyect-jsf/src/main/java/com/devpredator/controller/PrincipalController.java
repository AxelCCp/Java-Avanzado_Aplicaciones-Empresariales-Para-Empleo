package com.devpredator.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.model.entity.Empleado;
import com.devpredator.model.service.EmpleadoService;

//1 define q es un controlador de jsf.
//2 permite mantener la informacion hasta q nos pasamos a otra pantalla jsf.
//3 el init se va a ejecutar una vez la pagina empiece a crear un bean para este controlador. o sea cuando se carga la pantalla

/**
 * @author axelccp
 * Clase controller que procesa la informacion para pantalla principal.xhtml 
 */
@ManagedBean 	//1
@ViewScoped		//2	
public class PrincipalController {

	@PostConstruct		//3
	public void init() {
		this.consultarEmpleados();
	}
	
	public void consultarEmpleados() {
		this.empleados = empleadoService.consultarEmpleados();
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	private List<Empleado>empleados;
	private EmpleadoService empleadoService = new  EmpleadoService();
}

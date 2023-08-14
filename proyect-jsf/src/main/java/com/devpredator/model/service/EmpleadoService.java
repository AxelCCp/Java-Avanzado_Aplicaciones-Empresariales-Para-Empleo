package com.devpredator.model.service;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.model.entity.Empleado;

/**
 * @author axelccp
 * Clase que permite logica del negocio de empleados.
 */
public class EmpleadoService {
	/**
	 * Metodo que permite consultar la lista de empleados.
	 * @return {@link Empleado} lista de empleados.
	 */
	public List<Empleado>consultarEmpleados(){
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Rey");
		empleadoIBM.setPrimerApellido("Pilaf");
		empleadoIBM.setSegundoApellido("....");
		empleadoIBM.setPuesto("Rey");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Dragon");
		empleadoMicrosoft.setPrimerApellido("de cuatro");
		empleadoMicrosoft.setSegundoApellido("estrellas");
		empleadoMicrosoft.setPuesto("dragon de las 7 esferas");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Rey");
		empleadoApple.setPrimerApellido("Vegeta");
		empleadoApple.setSegundoApellido("...");
		empleadoApple.setPuesto("Rey");
		empleadoApple.setEstatus(false);
		
		List<Empleado> listaEmp = new ArrayList<>();
		listaEmp.add(empleadoIBM);
		listaEmp.add(empleadoMicrosoft);
		listaEmp.add(empleadoApple);
		
		return listaEmp;
	}

}

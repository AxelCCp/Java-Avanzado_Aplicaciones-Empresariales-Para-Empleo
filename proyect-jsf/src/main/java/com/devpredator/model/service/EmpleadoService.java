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
		
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHp = new Empleado();
		
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDeloitte = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
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
		
		empleadoNetflix.setNombre("Bra");
		empleadoNetflix.setPrimerApellido("nnnn");
		empleadoNetflix.setSegundoApellido("...");
		empleadoNetflix.setPuesto("xxx");
		empleadoNetflix.setEstatus(true);
		
		empleadoAmazon.setNombre("Amazon");
		empleadoAmazon.setPrimerApellido("zzzz");
		empleadoAmazon.setSegundoApellido("...");
		empleadoAmazon.setPuesto("dev");
		empleadoAmazon.setEstatus(false);
		
		empleadoHp.setNombre("Boo");
		empleadoHp.setPrimerApellido("majin");
		empleadoHp.setSegundoApellido("...");
		empleadoHp.setPuesto("gggggg");
		empleadoHp.setEstatus(true);
		
		empleadoOracle.setNombre("Up");
		empleadoOracle.setPrimerApellido("sdfsfd");
		empleadoOracle.setSegundoApellido("iiiii");
		empleadoOracle.setPuesto("eeeeee");
		empleadoOracle.setEstatus(false);
		
		empleadoDeloitte.setNombre("18");
		empleadoDeloitte.setPrimerApellido("RR");
		empleadoDeloitte.setSegundoApellido(".RR.");
		empleadoDeloitte.setPuesto("androide RR");
		empleadoDeloitte.setEstatus(true);
		
		empleadoDisney.setNombre("17");
		empleadoDisney.setPrimerApellido("RR");
		empleadoDisney.setSegundoApellido("RR..");
		empleadoDisney.setPuesto("androide RR");
		empleadoDisney.setEstatus(true);
		
		List<Empleado> listaEmp = new ArrayList<>();
		listaEmp.add(empleadoIBM);
		listaEmp.add(empleadoMicrosoft);
		listaEmp.add(empleadoApple);
		
		listaEmp.add(empleadoNetflix);
		listaEmp.add(empleadoAmazon);
		listaEmp.add(empleadoHp);
		
		listaEmp.add(empleadoOracle);
		listaEmp.add(empleadoDeloitte);
		listaEmp.add(empleadoDisney);
		
		return listaEmp;
	}

}

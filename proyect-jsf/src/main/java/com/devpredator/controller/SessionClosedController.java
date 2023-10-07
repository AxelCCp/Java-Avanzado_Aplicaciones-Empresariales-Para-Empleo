package com.devpredator.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * CLase que se encarga de cerrar la session del usuario
 */
@ManagedBean
public class SessionClosedController {

	
	@PostConstruct
	public void init() {
		System.out.println("Cerrar session... ");
	}
	
	
	/**
	 * metodo que permite cerrar la session del usuario y redirige al login
	 */
	public void cerrarSession() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Metodo que permite redireccionar a una pantalla
	 * @param pagina {@link String} pagina a redireccionarse
	 * @throws IOException Exception en caso de no encontrar la pagina 
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
}

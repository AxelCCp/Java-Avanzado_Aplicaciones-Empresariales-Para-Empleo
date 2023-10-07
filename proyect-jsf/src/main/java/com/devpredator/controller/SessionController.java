package com.devpredator.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devpredator.dto.UsuarioDTO;

/**
 * @author Yoh
 * Clase que se encarga de mantener la infomacion del usuario en session
 */

@ManagedBean
@SessionScoped
public class SessionController {
	
	
	/**
	 * Inicializa la sesion del usuario
	 */
	@PostConstruct
	public void init () {
		System.out.println("cargando informacion de usuario en la sesion...");
	}

	
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
	
	
	/**
	 * usuario que se mantendrá en session
	 */
	private UsuarioDTO usuarioDTO;
}

package com.devpredator.dto;


/**
 * @author Yoh
 * Clase que permitira mantener la info del usuario en la session 
 */

public class UsuarioDTO {

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private String usuario;
	private String password;
}

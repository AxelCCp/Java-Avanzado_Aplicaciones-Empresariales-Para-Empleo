package com.devpredator.controller;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devpredator.dto.UsuarioDTO;

@ManagedBean																//DECLARA Q ES UN CONTROLADOR DE JSF
public class LoginController {

	
	public void ingresar() {
		
		System.out.println("usuario: " + usuario);
		
		if(usuario.equals("axelccp") && password.equals("12345")) {
			
			
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(usuario);
				usuarioDTO.setPassword(password);
				this.sessionController.setUsuarioDTO(usuarioDTO);																//SE AGGREGA LA INFO A LA SESSION,  SIEMPRE Y CUANDO LOS DATOS SEAN CORRECTOS.
				
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe", ""));
				e.printStackTrace();
			}
			
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña incorrectos", ""));
		}
		
	}
	
	
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	 
	
	//-------------------------------------
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
	//-------------------------------------
	
	
	
	//-------------------------------------
	public SessionController getSessionController() {
		return sessionController;
	}
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	//-------------------------------------




	private String usuario;	
	private String password;
	
	@ManagedProperty("#{sessionController}")   														//PERMITE INYECTAR UN CONTROLADOR O UN BEAN DE JSF EN ENTRO. EL BEAN TIENE EL MISMO NOMBRE DE LA CLASE PERO EN MINUSCULA. 
	private SessionController sessionController;
	
}

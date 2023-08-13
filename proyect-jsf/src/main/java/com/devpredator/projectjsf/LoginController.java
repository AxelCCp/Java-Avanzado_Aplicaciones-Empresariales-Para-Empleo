package com.devpredator.projectjsf;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean																//DECLARA Q ES UN CONTROLADOR DE JSF
public class LoginController {

	
	public void ingresar() {
		System.out.println("usuario: " + usuario);
		if(usuario.equals("axelccp") && password.equals("12345")) {
			//FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario correcto", ""));
			try {
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

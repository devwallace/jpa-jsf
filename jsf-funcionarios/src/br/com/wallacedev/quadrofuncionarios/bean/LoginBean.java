package br.com.wallacedev.quadrofuncionarios.bean;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.wallacedev.quadrofuncionarios.dao.UsuarioDao;
import br.com.wallacedev.quadrofuncionarios.modelo.Usuario;


@ManagedBean
public class LoginBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}
	
	public String entrar() {
		FacesContext context = FacesContext.getCurrentInstance();
		boolean cadastrado = new UsuarioDao().cadastrado(this.usuario);
		
		if(cadastrado ) {
			context.getExternalContext().getSessionMap().put("usuarioLogado", this.usuario);
			return "funcionarios?faces-redirect=true";
		}
		context.getExternalContext().getFlash().setKeepMessages(true);
		context.addMessage(null, new FacesMessage("usuario não encintrado"));
		return "login?faces-redirect=true";
	}
	
	public String sair() {
		System.out.println("saindo da conta do usuario");
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().getSessionMap().remove("usuarioLogado");
		return "login?faces-redirect=true";
	}
	
	
}

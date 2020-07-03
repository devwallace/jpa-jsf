package br.com.wallacedev.quadrofuncionarios.Util;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import br.com.wallacedev.quadrofuncionarios.modelo.Usuario;

public class Autorizador implements PhaseListener{

	@Override
	public void afterPhase(PhaseEvent evento) {
		FacesContext context = evento.getFacesContext();
		String nomePagina = context.getViewRoot().getViewId();
		
		if("/login.xhtml".equals(nomePagina)) {
			return;
		}
		
		Usuario usuarioLogado = (Usuario)context.getExternalContext().getSessionMap().get("usuarioLogado");
		
		if (usuarioLogado != null) {
			return;
		}
		NavigationHandler handler = context.getApplication().getNavigationHandler();
		handler.handleNavigation(context, null, "/login.xhtml:faces-redirect=true");
		context.renderResponse();
	}

	@Override
	public void beforePhase(PhaseEvent arg0) {

		
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}

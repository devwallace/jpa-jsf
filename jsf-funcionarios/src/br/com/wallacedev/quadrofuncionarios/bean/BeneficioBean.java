package br.com.wallacedev.quadrofuncionarios.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.wallacedev.quadrofuncionarios.dao.DAO;
import br.com.wallacedev.quadrofuncionarios.modelo.Beneficio;
import br.com.wallacedev.quadrofuncionarios.modelo.Funcionario;

@ManagedBean
@ViewScoped
public class BeneficioBean {
	
	private Beneficio beneficio = new Beneficio();
	private Integer beneficioId;
	private List<Beneficio> beneficios;
	
	public void gravar() {
		DAO<Beneficio> dao = new DAO<Beneficio>(Beneficio.class);
		if (beneficio.getId() == null) {
			dao.adicionar(beneficio);
		}else{
			dao.atualizar(beneficio);
		}
		this.beneficio = new Beneficio();
	}
	public void remover(Beneficio beneficio) {
		new DAO<Beneficio>(Beneficio.class).remover(beneficio);
	}
	public void carregar(Beneficio beneficio) {
		this.beneficio = beneficio;	
	}
	public void carregarBeneficioPeloId(){
		this.beneficio = new DAO<Beneficio>(Beneficio.class).buscarPorId(beneficioId);
	}
	
	public List<Beneficio> getBeneficios(){
		return new DAO<Beneficio>(Beneficio.class).listarTodos();
	}
	public Beneficio getBeneficio() {
		return beneficio;
	}
	public Integer getBeneficioId() {
		return beneficioId;
	}
	public void setBeneficioId(Integer beneficioId) {
		this.beneficioId = beneficioId;
	}	
}

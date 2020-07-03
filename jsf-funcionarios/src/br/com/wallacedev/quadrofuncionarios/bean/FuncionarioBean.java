package br.com.wallacedev.quadrofuncionarios.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.wallacedev.quadrofuncionarios.dao.DAO;
import br.com.wallacedev.quadrofuncionarios.modelo.Beneficio;
import br.com.wallacedev.quadrofuncionarios.modelo.Cargo;
import br.com.wallacedev.quadrofuncionarios.modelo.Funcionario;

@ManagedBean
@ViewScoped
public class FuncionarioBean {
	
	private Funcionario funcionario = new Funcionario();
	private Integer funcionarioId;
	private Integer beneficioId;
	private Integer cargoId;
	private List<Funcionario> funcionarios;
	
	public void gravar() {
		if (funcionario.getCargo() == null) {
			FacesContext.getCurrentInstance().addMessage("cargo", new FacesMessage("É necessário atribuir um cargo"));
			return;
		}
		DAO<Funcionario> dao = new DAO<Funcionario>(Funcionario.class);
		if(this.funcionario.getId() == null) {
			dao.adicionar(this.funcionario);
		}else {
			dao.atualizar(this.funcionario);
		}
		this.funcionario = new Funcionario();
	}
	public void remover(Funcionario funcionario) {
		new DAO<Funcionario>(Funcionario.class).remover(funcionario);
	}
	public void gravarBeneficio() {
		Beneficio beneficio = new DAO<Beneficio>(Beneficio.class).buscarPorId(this.beneficioId);
		System.out.println(beneficio.getTipo());
		this.funcionario.adicionarBeneficio(beneficio);
		
	}
	public void removerBeneficio(Beneficio beneficio) {
		this.funcionario.removerBeneficio(beneficio);		
	}
	public void gravarCargo() {
		Cargo cargo = new DAO<Cargo>(Cargo.class).buscarPorId(this.cargoId);
		this.funcionario.adicionarCargo(cargo);
	}
	public void carregarFuncionarioPeloId() {
		this.funcionario = new DAO<Funcionario>(Funcionario.class).buscarPorId(funcionarioId);
	}
	public String carregar(Funcionario funcionario) {
		return "novofuncionario?faces-redirect=true"+"funcionarioId="+(funcionario.getId());
	}
	public String formBeneficio() {
		return "novobeneficio?faces-redirect=true";
	}
	public String formCargo() {
		return "novocargo?faces-redirect=true";
	}
	

	public List<Funcionario> getFuncionarios(){
		return new DAO<Funcionario>(Funcionario.class).listarTodos();
	}
	public List<Beneficio> getBeneficios(){
		return new DAO<Beneficio>(Beneficio.class).listarTodos();
	}
	public List<Cargo> getCargos(){
		return new DAO<Cargo>(Cargo.class).listarTodos();
	}
	
	public Integer getBeneficioId() {
		return beneficioId;
	}
	public void setBeneficioId(Integer beneficioId) {
		this.beneficioId = beneficioId;
	}
	public Integer getCargoId() {
		return cargoId;
	}
	public void setCargoId(Integer cargoId) {
		this.cargoId = cargoId;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public List<Beneficio> getBeneficiosDoFuncionario(){
		return this.funcionario.getBeneficios();
	}
	public Integer getFuncionarioId() {
		return funcionarioId;
	}
	public void setFuncionarioId(Integer funcionarioId) {
		this.funcionarioId = funcionarioId;
	}
}

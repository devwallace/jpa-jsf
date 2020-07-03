package br.com.wallacedev.quadrofuncionarios.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.wallacedev.quadrofuncionarios.dao.DAO;
import br.com.wallacedev.quadrofuncionarios.modelo.Beneficio;
import br.com.wallacedev.quadrofuncionarios.modelo.Cargo;

@ManagedBean
@ViewScoped
public class CargoBean {
	
	private Cargo cargo = new Cargo();
	private Integer cargoId;
	private List<Cargo> cargos;

	public void gravar() {
		DAO<Cargo> dao = new DAO<Cargo>(Cargo.class);
		if(cargo.getId()==null) {
			dao.adicionar(cargo);
		}else {
			dao.atualizar(cargo);
		}
		this.cargo = new Cargo();
	}
	public void remover(Cargo cargo) {
		new DAO<Cargo>(Cargo.class).remover(cargo);
	}
	public void carregar(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public List<Cargo> getCargos(){
		return new DAO<Cargo>(Cargo.class).listarTodos();
	}
	public Cargo getCargo() {
		return cargo;
	}
	public Integer getCargoId() {
		return cargoId;
	}
	public void setCargoId(Integer cargoId) {
		this.cargoId = cargoId;
	}	
}

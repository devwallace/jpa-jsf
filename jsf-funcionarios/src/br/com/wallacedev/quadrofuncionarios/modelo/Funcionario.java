package br.com.wallacedev.quadrofuncionarios.modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataContratacao = Calendar.getInstance();
	
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento = Calendar.getInstance();
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Beneficio> beneficios = new ArrayList<Beneficio>();
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Cargo cargo;
	
	private String nome;
	private String cpf;
	private String telefone;
	private String ctps;
	private double Salario;
	
	public Funcionario(Calendar dataContratacao, Calendar dataNascimento, Cargo cargo,
			String nome, String cpf, String telefone, String ctps, double salario) {
		super();
		this.dataContratacao = dataContratacao;
		this.dataNascimento = dataNascimento;
		this.cargo = cargo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.ctps = ctps;
		Salario = salario;
	}

	public Funcionario() {		
	}
	
	public void adicionarBeneficio(Beneficio beneficio) {
		this.beneficios.add(beneficio);
	}
	public void removerBeneficio(Beneficio beneficio) {
		this.beneficios.remove(beneficio);
	}
	public void adicionarCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	public Calendar getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(Calendar dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public List<Beneficio> getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(List<Beneficio> beneficios) {
		this.beneficios = beneficios;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}

package br.com.wallacedev.quadrofuncionarios.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

public class DAO <Modelo>{
	
	private final Class<Modelo> classe;
	
	public DAO(Class<Modelo> classe) {
		this.classe = classe;
	}
	
	public void adicionar(Modelo modelo) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(modelo);
		em.getTransaction().commit();
		em.close();	
	}
	
	public void remover(Modelo modelo) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.remove(em.merge(modelo));
		em.getTransaction().commit();
		em.close();
	}
	
	public void atualizar(Modelo modelo) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.merge(modelo);
		em.getTransaction().commit();
		em.close();		
	}
	
	public List<Modelo> listarTodos(){
		EntityManager em = new JPAUtil().getEntityManager();
		CriteriaQuery<Modelo> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));	
		List<Modelo> lista = em.createQuery(query).getResultList();
		em.close();
		return lista;	
	}
	
	public Modelo buscarPorId(Integer id) {
		EntityManager em = new JPAUtil().getEntityManager();
		Modelo instancia = em.find(classe, id);
		em.close();
		return instancia;
	}
}

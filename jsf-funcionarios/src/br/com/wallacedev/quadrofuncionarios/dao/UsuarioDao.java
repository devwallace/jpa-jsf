package br.com.wallacedev.quadrofuncionarios.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import br.com.wallacedev.quadrofuncionarios.modelo.Usuario;



public class UsuarioDao {

	public boolean cadastrado(Usuario usuario) {
		EntityManager em = new JPAUtil().getEntityManager();
		TypedQuery<Usuario> query = em.createQuery("select u from Usuario u where u.email = :pEmail and u.senha= :pSenha",Usuario.class);
		query.setParameter("pEmail", usuario.getEmail());
		query.setParameter("pSenha", usuario.getSenha());
		try {
			Usuario resultado = query.getSingleResult();
		}catch (NoResultException ex) {
			return false;
			// TODO: handle exception
		}
		em.close();

		return true;
	}
	

}

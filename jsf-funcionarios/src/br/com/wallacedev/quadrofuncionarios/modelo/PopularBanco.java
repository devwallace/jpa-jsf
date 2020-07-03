package br.com.wallacedev.quadrofuncionarios.modelo;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.wallacedev.quadrofuncionarios.dao.JPAUtil;

public class PopularBanco {
	
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		
			Usuario usuario = new Usuario();
			usuario.setEmail("teste@email.com");
			usuario.setSenha("123456");
			
			Cargo c1 = new Cargo("Presidente");
			Cargo c2 = new Cargo("Diretor Comercial");
			Cargo c3 = new Cargo("Gerente de Vendas");
			Cargo c4 = new Cargo("Diretor Admistrativo");
			Cargo c5 = new Cargo("Diretor de Produção");
			Cargo c6 = new Cargo("Gerente de Compras");
			Cargo c7 = new Cargo("Gerente de Marketing");
			Cargo c8 = new Cargo("Vendedor");
			Cargo c9 = new Cargo("Auxiliar de Produção");
			
			
			Beneficio b1 = new Beneficio("Vale-transporte",87.50);
			Beneficio b2 = new Beneficio("Vale-refeição",110.0);
			Beneficio b3 = new Beneficio("Plano de saúde",250.0);
			Beneficio b4 = new Beneficio("Plano odontológico",100.0);
			Beneficio b5 = new Beneficio("Auxílio-creche",75.80);

		
			Funcionario f1 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c1,
					"Renato Augosto Oliveira","74125895135","11784060729","45120789541",15000.0);
			f1.adicionarBeneficio(b1);
			f1.adicionarBeneficio(b2);
			f1.adicionarBeneficio(b3);
			f1.adicionarBeneficio(b4);
			
			Funcionario f2 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c8,
					"Carlos André de Holanda Florêncio e Silva","415.631.744-72","1184951515","4584189541",3000.0);
			f2.adicionarBeneficio(b1);
			f2.adicionarBeneficio(b2);
			f2.adicionarBeneficio(b4);
			
			Funcionario f3 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"Luciana Dutra Cavalcanti Ricarte","075.987.594-48","1195451515","7414189541",3000.0);
			f3.adicionarBeneficio(b1);
			f3.adicionarBeneficio(b2);
			f3.adicionarBeneficio(b4);
			f3.adicionarBeneficio(b5);
			
			Funcionario f4 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c3,
					"Jonas Augusto de Barros Chaves","075.260.664-84","1195451515","841189541",6000.0);
			f4.adicionarBeneficio(b1);
			f4.adicionarBeneficio(b2);
			f4.adicionarBeneficio(b4);
			f4.adicionarBeneficio(b3);
			
			Funcionario f5 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"Alcione Monteiro Lucas Germino","061.195.974-76","1194105115","8741189541",1500.0);
			f5.adicionarBeneficio(b1);
			f5.adicionarBeneficio(b2);
			f5.adicionarBeneficio(b4);
			f5.adicionarBeneficio(b3);
			
			Funcionario f6 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"Renato Augosto Oliveira","068.400.624-84","11784060729","45120789541",1000.0);
			f6.adicionarBeneficio(b1);
			
			Funcionario f7 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"marianna miranda correia","423.144.234-32","1198554110","4584189541",3000.0);
			f7.adicionarBeneficio(b1);
			f7.adicionarBeneficio(b2);
			f7.adicionarBeneficio(b3);
			
			Funcionario f8 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"Denys Vytor de Queiroz Silva ","468.400.624-71","1195451515","7414189541",2000.0);
			
			Funcionario f9 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c3,
					"Denys Vytor de Queiroz Silva","768.400.624-41","1195451515","841189541",8000.0);
			f9.adicionarBeneficio(b1);
			f9.adicionarBeneficio(b2);
			f9.adicionarBeneficio(b3);
			f9.adicionarBeneficio(b4);
			f9.adicionarBeneficio(b5);
			
			Funcionario f10 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"DORGIVANIA SILVA DE AGUIAR","842.477.724-84","1194105115","8741189541",1500.0);
			f10.adicionarBeneficio(b1);
			f10.adicionarBeneficio(b2);
			f10.adicionarBeneficio(b4);
			f10.adicionarBeneficio(b3);
			
			Funcionario f11 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"Renato Augosto Oliveira","41035895135","11784060729","45120789541",5000.0);
			
			Funcionario f12 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c6,
					"Carlos André de Holanda Florêncio e Silva","415.631.744-72","1184951515","4584189541",3000.0);
			f12.adicionarBeneficio(b1);
			f12.adicionarBeneficio(b2);
			f12.adicionarBeneficio(b4);
			
			Funcionario f13 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c5,
					"Luciana Dutra Cavalcanti Ricarte","275.034-48","119410515","7414189541",3000.0);
			f13.adicionarBeneficio(b1);
			f13.adicionarBeneficio(b2);
			f13.adicionarBeneficio(b4);
			f13.adicionarBeneficio(b5);
			
			Funcionario f14 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c3,
					"Jonas Augusto de Barros Chaves","075.260.664-84","1195451515","841189541",6000.0);
			f14.adicionarBeneficio(b1);
			f14.adicionarBeneficio(b2);
			f14.adicionarBeneficio(b4);
			f14.adicionarBeneficio(b3);
			
			Funcionario f15 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c2,
					"Fabiana Flávia da Silva ","061.195.974-76","1194105115","8741189541",5000.0);
			f5.adicionarBeneficio(b1);
			f5.adicionarBeneficio(b2);
			f5.adicionarBeneficio(b4);
			f5.adicionarBeneficio(b3);
			
			Funcionario f16 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c8,
					"Augosto Oliveira","427.324.624-84","11784060729","45120789541",1000.0);
			f16.adicionarBeneficio(b1);
			
			Funcionario f17 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c5,
					"marianna miranda correia","423.144.234-32","1198554110","4584189541",3000.0);
			f17.adicionarBeneficio(b1);
			f17.adicionarBeneficio(b2);
			f17.adicionarBeneficio(b3);
			
			Funcionario f18 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"Denys Vytor de Queiroz Silva ","468.400.624-71","1195451515","7414189541",2000.0);
			f18.adicionarBeneficio(b1);
			f18.adicionarBeneficio(b2);
			f18.adicionarBeneficio(b3);
			f18.adicionarBeneficio(b4);
			f18.adicionarBeneficio(b5);
			Funcionario f19 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c3,
					"Denys Vytor de Queiroz Silva","768.400.624-41","1195451515","841189541",8000.0);
			f9.adicionarBeneficio(b1);
			f9.adicionarBeneficio(b2);
			f9.adicionarBeneficio(b3);
			f9.adicionarBeneficio(b4);
			f9.adicionarBeneficio(b5);
			
			Funcionario f20 = new Funcionario(Calendar.getInstance(),Calendar.getInstance(),c9,
					"laura michele bezerra de lima","842.477.724-84","1194105115","8741189541",1500.0);
			f20.adicionarBeneficio(b1);
			f20.adicionarBeneficio(b2);
			f20.adicionarBeneficio(b4);
			f20.adicionarBeneficio(b3);
			
			em.getTransaction().begin();
			
			em.persist(c1);
			em.persist(c2);
			em.persist(c3);
			em.persist(c4);
			em.persist(c5);
			em.persist(c6);
			em.persist(c7);
			em.persist(c8);
			em.persist(c9);
			
			em.persist(b1);
			em.persist(b2);
			em.persist(b3);
			em.persist(b4);
			em.persist(b5);
			
			em.persist(f1);
			em.persist(f2);
			em.persist(f3);
			em.persist(f4);
			em.persist(f5);
			em.persist(f6);
			em.persist(f7);
			em.persist(f8);
			em.persist(f9);
			em.persist(f10);
			em.persist(f11);
			em.persist(f12);
			em.persist(f13);
			em.persist(f14);
			em.persist(f15);
			em.persist(f16);
			em.persist(f17);
			em.persist(f18);
			em.persist(f19);
			em.persist(f20);
			em.persist(usuario);

			em.getTransaction().commit();
		
	}

}

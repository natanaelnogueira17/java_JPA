package dominio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
	public static void main(String[] args) {
		//criando o Entity Manage Factory
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//criando os objetos;
//		Pessoa p1 = new Pessoa(null, "carlos", "emaileesse");
//		Pessoa p2 = new Pessoa(null, "bruno", "emaileesse");
//		Pessoa p3 = new Pessoa(null, "dudu", "emaileesse");
		
		//iniciando transaction e persistindo os objetos; tem que s
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
		
		
		//excluindo os dados
		em.getTransaction().begin();
		Pessoa pc = em.find(Pessoa.class, 1);
		em.remove(pc);
		em.getTransaction().commit();
		
		//recuperando os dados do banco
		Pessoa p = em.find(Pessoa.class,2);		
		
		System.out.println(p);
		System.out.println("Pronto");
		//close os entitys mangers;
		em.close();
		emf.close();
		
	}
}

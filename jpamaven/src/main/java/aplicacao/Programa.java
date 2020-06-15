package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Alberto da Silva", "alberto@gmail.com");
		Pessoa p3 = new Pessoa(null, "Julia da Silva", "julia@gmail.com");
		
		//instancia o EntityManagerFactory com as configurações do persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		//conexao com banco de dados e contexto de persistencia implementado
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); //inicia transação com o banco de dados
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); //confirma as alterações realizadas
		
		//buscar pessoa no banco de dados pelo id
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		System.out.println("pronto!");
		em.close();
		emf.close();
	}

}

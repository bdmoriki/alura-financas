package br.com.bruno.alura_financas.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private EntityManagerFactory etf;
	
	public JPAUtil() {
		this.etf = Persistence.createEntityManagerFactory("financas");
	}
	
	public EntityManager getTransaction(){
		EntityManager manager = etf.createEntityManager();
		return manager; 
	}
}

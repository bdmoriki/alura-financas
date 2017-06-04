package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.bruno.alura_financas.util.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TesteDelecao {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getTransaction();

		manager.getTransaction().begin();
		Conta c = manager.find(Conta.class, 3);
		
		manager.remove(c);
		manager.getTransaction().commit();
		
		manager.close();
	}
}

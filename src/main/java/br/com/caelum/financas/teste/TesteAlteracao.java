package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.bruno.alura_financas.util.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TesteAlteracao {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getTransaction();

		manager.getTransaction().begin();
		Conta c = manager.find(Conta.class, 1);

		c.setBanco("Bradesco");
		
		manager.getTransaction().commit();

		manager.close();
	}
}

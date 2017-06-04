package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.bruno.alura_financas.util.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TesteConsulta {
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getTransaction();
		
		Conta c =  manager.find(Conta.class, 1);
		System.out.println(c);
		
		manager.close();
	}
}

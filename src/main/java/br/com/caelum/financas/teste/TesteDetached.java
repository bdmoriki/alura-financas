package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.bruno.alura_financas.util.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TesteDetached {
	public static void main(String[] args) {
		//Conta que ja existe no banco
		Conta conta =  new Conta();
		conta.setAgencia("usdhf");
		conta.setBanco("saudhasdsd");
		conta.setId(4);
		conta.setNumero("isahdaisdj");
		conta.setTitular("teste");
		
		EntityManager manager = new JPAUtil().getTransaction();

		manager.getTransaction().begin();
		
		manager.merge(conta);
		
		manager.getTransaction().commit();
		
		manager.close();
	}
}

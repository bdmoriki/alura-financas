package br.com.caelum.financas.teste;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.bruno.alura_financas.util.JPAUtil;
import br.com.caelum.financas.modelo.Conta;

public class TesteInclusao {
	public static void main(String[] args) {
		
		List<Conta> listaContas = new ArrayList<Conta>();
		
		Conta conta1 = new Conta();
		conta1.setAgencia("1");
		conta1.setBanco("1");
		conta1.setNumero("1");
		conta1.setTitular("Brunets");

		Conta conta2 = new Conta();
		conta2.setAgencia("2");
		conta2.setBanco("2");
		conta2.setNumero("2");
		conta2.setTitular("Brunets dois");

		Conta conta3 = new Conta();
		conta3.setAgencia("3");
		conta3.setBanco("3");
		conta3.setNumero("3");
		conta3.setTitular("Brunets tres");

		Conta conta4 = new Conta();
		conta4.setAgencia("4");
		conta4.setBanco("4");
		conta4.setNumero("3");
		conta4.setTitular("Brunets quatro");

		listaContas.add(conta1);
		listaContas.add(conta2);
		listaContas.add(conta3);
		listaContas.add(conta4);
		
		EntityManager manager = new JPAUtil().getTransaction();

		manager.getTransaction().begin();

		for (Conta c:listaContas){
			manager.persist(c);
		}
			
		manager.getTransaction().commit();

		manager.close();
	}

}

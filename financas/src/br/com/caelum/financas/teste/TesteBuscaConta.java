package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteBuscaConta {
	
	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		//procuda conta de id 1
		Conta conta = em.find(Conta.class, 1);
		
		conta.setTitular("Jo�o");
		conta.setAgencia("456");
		
		System.out.println(conta.getTitular());
		
		em.getTransaction().commit();
		
	}

}

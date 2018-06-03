package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaFuncoesJPQL {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(2);
		
		
		TypedQuery<Double> typedQuery = em.createNamedQuery("mediasPorDiasETipo", Double.class);
		
		typedQuery.setParameter("pConta", conta);
		typedQuery.setParameter("pTipo", TipoMovimentacao.SAIDA);
		
		List<Double> medias = typedQuery.getResultList();
		
		//System.out.println("A média é: " + media);
		
	    for(Double media : medias){
	    	System.out.println("A média é: " + media);
	    }
		
		em.getTransaction().commit();
		em.close();
		
	}
	
}

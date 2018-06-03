package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TesteInserirMovimentacao {

	public static void main(String[] args) {

        EntityManager em = new JPAUtil().getEntityManager();

       //errado
       // Conta conta = em.find(Conta.class, 1);
       //  List<Movimentacao> movimentacoes = conta.getMovimentacoes();
        
// Solucao 1        
//        Conta conta = new Conta();
//        conta.setId(2);
//        
//		String jpql = "select m from Movimentacao m join fetch m.conta where m.conta = :pConta";
//		
//		Query query = em.createQuery(jpql);
//		query.setParameter("pConta", conta);
//		
//		List<Movimentacao> movimentacoes = query.getResultList();
//		
//        em.close();
//
//        for (Movimentacao movimentacao : movimentacoes) {
//            System.out.println("Movimentação: " + movimentacao.getDescricao());
//        }
   
// Solucao 2: juntamente com o @OneToMany(mappedBy="conta",fetch = FetchType.EAGER) da classe Conta
//        Conta conta = em.find(Conta.class, 2);
//
//        List<Movimentacao> movimentacoes = conta.getMovimentacoes();
//
//        em.close();
//
//        for (Movimentacao movimentacao : movimentacoes) {
//            System.out.println("Movimentação: " + movimentacao.getDescricao());
//        }
        
//solucao 3

        Conta conta = em.find(Conta.class, 2);

        List<Movimentacao> movimentacoes = conta.getMovimentacoes();

        for (Movimentacao movimentacao : movimentacoes) {
            System.out.println("Movimentação: " + movimentacao.getDescricao());
        }

        em.close();
        
    }
	
}

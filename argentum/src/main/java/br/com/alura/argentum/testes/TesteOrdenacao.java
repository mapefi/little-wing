package br.com.alura.argentum.testes;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import br.com.alura.argentum.modelo.Negociacao;

public class TesteOrdenacao {

    public static void main(String[] args) {

        LocalDateTime hoje = LocalDateTime.now();

        Negociacao negociacao1 = new Negociacao(40.0, 120, hoje);
        Negociacao negociacao2 = new Negociacao(35.0, 900, hoje);
        Negociacao negociacao3 = new Negociacao(45.0, 50, hoje);
        Negociacao negociacao4 = new Negociacao(20.0, 200, hoje);

        List<Negociacao> lista = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);

        lista.sort(new QuantidadeComparator());

        System.out.println("Testa Ordenação Quantidade");
        
        for (Negociacao negociacao : lista) {
            System.out.println(negociacao.getQuantidade());
        }
        
        lista.sort(new NegocicaoVolumeComparator());
        
        System.out.println("Testa Ordenação Volume");
     
        for (Negociacao negociacao : lista) {
            System.out.println(negociacao.getVolume());
        }
        
    }

}


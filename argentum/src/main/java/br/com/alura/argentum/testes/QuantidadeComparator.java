package br.com.alura.argentum.testes;

import java.util.Comparator;

import br.com.alura.argentum.modelo.Negociacao;

public class QuantidadeComparator implements Comparator<Negociacao> {

    @Override
    public int compare(Negociacao n1, Negociacao n2) {
        return n1.getQuantidade() - n2.getQuantidade();
    }
}

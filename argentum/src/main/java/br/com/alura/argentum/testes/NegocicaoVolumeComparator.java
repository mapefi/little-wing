package br.com.alura.argentum.testes;

import java.util.Comparator;

import br.com.alura.argentum.modelo.Negociacao;

public class NegocicaoVolumeComparator implements Comparator<Negociacao> {

	@Override
	public int compare(Negociacao n1, Negociacao n2){
		return (int) (n1.getVolume() - n2.getVolume());
	}
	
}

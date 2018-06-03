import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MapaEspalhamento<C, V> {
	private List<List<Associacao2<C, V>>> tabela = new ArrayList<List<Associacao2<C, V>>>();

	public MapaEspalhamento() {
		for (int i = 0; i < 100; i++) {
			this.tabela.add(new LinkedList<Associacao2<C, V>>());
		}
	}

	public boolean contemChave(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao2<C, V>> lista = this.tabela.get(indice);
		for (int i = 0; i < lista.size(); i++) {
			Associacao2<C, V> Associacao2 = lista.get(i);
			if (Associacao2.getChave().equals(chave)) {
				return true;
			}
		}
		return false;
	}

	public void remove(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao2<C, V>> lista = this.tabela.get(indice);
		for (int i = 0; i < lista.size(); i++) {
			Associacao2<C, V> Associacao2 = lista.get(i);
			if (Associacao2.getChave().equals(chave)) {
				lista.remove(i);
				return;
			}
		}
		throw new IllegalArgumentException("A chave não existe");
	}

	public void adiciona(C chave, V valor) {
		if (this.contemChave(chave)) {
			this.remove(chave);
		}
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao2<C, V>> lista = this.tabela.get(indice);
		lista.add(new Associacao2<C, V>(chave, valor));
	}

	public V pega(C chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao2<C, V>> lista = this.tabela.get(indice);
		for (int i = 0; i < lista.size(); i++) {
			Associacao2<C, V> Associacao2 = lista.get(i);
			if (Associacao2.getChave().equals(chave)) {
				return Associacao2.getValor();
			}
		}
		throw new IllegalArgumentException("A chave não existe");
	}

	private int calculaIndiceDaTabela(C chave) {
		return Math.abs(chave.hashCode()) % this.tabela.size();
	}

	private List<Associacao2<C, V>> pegaTodas() {
		ArrayList<Associacao2<C, V>> associacoes = new ArrayList<Associacao2<C, V>>();
		for (List<Associacao2<C, V>> lista : this.tabela) {
			associacoes.addAll(lista);
		}
		return associacoes;
	}

	@Override
	public String toString() {
		return this.pegaTodas().toString();
	}
}
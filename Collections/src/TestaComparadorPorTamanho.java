import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaComparadorPorTamanho {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Sérgio");
		lista.add("Paulo");
		lista.add("Guilherme");
		
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		Collections.sort(lista, comparador);
		
		System.out.println(lista);
		
	}
}

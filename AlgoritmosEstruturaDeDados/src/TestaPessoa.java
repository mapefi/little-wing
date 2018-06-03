import java.util.LinkedList;
import java.util.List;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(1.75);
		Pessoa p2 = new Pessoa(1.90);
		Pessoa p3 = new Pessoa(1.65);
		double maxAltura = 0;

		List<Pessoa> fila = new LinkedList<Pessoa>();
		fila.add(p1);
		fila.add(p2);
		fila.add(p3);

		for (Pessoa p : fila) {
			if (p.getAltura() > maxAltura)
				maxAltura = p.getAltura();
		}
		
		System.out.println("Altura máxima: " + maxAltura);
	}
}

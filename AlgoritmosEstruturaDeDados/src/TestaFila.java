import java.util.LinkedList;
import java.util.List;

public class TestaFila {
	public static void main(String[] args) {
		List<Aluno> fila = new LinkedList<Aluno>();

		Aluno a1 = new Aluno("Ricardo", 100);
		Aluno a2 = new Aluno("Giovana", 80);
		Aluno a3 = new Aluno("Larissa", 90);

		fila.add(a1);
		fila.add(a2);
		fila.add(a3);

		System.out.println("Rodada 0");
		for (Aluno a : fila) {
			System.out.println(a.getNome());
		}

		Aluno a4 = new Aluno("Marcos", 70);
		fila.add(a4);

		System.out.println("Rodada 1");
		for (Aluno a : fila) {
			System.out.println(a.getNome());
		}

		fila.remove(0);

		System.out.println("Rodada 2");
		for (Aluno a : fila) {
			System.out.println(a.getNome());
		}

		System.out.println("Rodada 3");
		if (fila.isEmpty())
			System.out.println("Fila vazia");
		else
			System.out.println("Alunos na fila");
	}
}

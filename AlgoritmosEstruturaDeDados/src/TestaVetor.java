import java.util.LinkedList;
import java.util.List;

public class TestaVetor {
	public static void main(String[] args) {
		List<Aluno> lista = new LinkedList<Aluno>();

		Aluno a1 = new Aluno("Thomas", 60);
		Aluno a2 = new Aluno("Regina", 100);
		Aluno a3 = new Aluno("Francisco", 80);

		lista.add(a1);
		lista.add(a2);
		lista.add(a3);

		System.out.println("Primeira rodada");
		for (Aluno a : lista) {
			System.out.println(a.getNome() + ", " + a.getNotaRelatorio());
		}
		
		Aluno a4 = new Aluno("Maria", 90);
		lista.add(a4);

		System.out.println("\nSegunda rodada");
		for (Aluno a : lista) {
			System.out.println(a.getNome() + ", " + a.getNotaRelatorio());
		}
		
		Aluno a5 = new Aluno("Rogério", 50);
		lista.add(2, a5);
		
		System.out.println("\nTerceira rodada");
		for (Aluno a : lista) {
			System.out.println(a.getNome() + ", " + a.getNotaRelatorio());
		}
		
		System.out.println("\nQuarta rodada");
		System.out.println(lista.get(1).getNome() + ", " + lista.get(1).getNotaRelatorio());
		
		lista.remove(2);
		
		System.out.println("\nQuinta rodada");
		for (Aluno a : lista) {
			System.out.println(a.getNome() + ", " + a.getNotaRelatorio());
		}
		
		System.out.println("\nSexta rodada");
		for (Aluno a : lista) {
			if (a.getNome().equals("Francisco"))
				System.out.println("Francisco encontrado");
		}
		
		System.out.println("\nSétima rodada");
		System.out.println("Número de alunos: " + lista.size());
		
	}
}

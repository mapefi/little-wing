import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaRelatorio {
	public static void main(String[] args) {
		
		Aluno a5 = new Aluno("Ana", 40);
		Aluno a6 = new Aluno("Ana", 40);
		Aluno a1 = new Aluno("Rafael", 100);
		Aluno a4 = new Aluno("Paulo", 50);
		Aluno a2 = new Aluno("Paulo", 70);
		Aluno a3 = new Aluno("Ana", 60);
		Aluno a7 = new Aluno("Rafael", 65);
		
		List <Aluno> lista = new LinkedList<Aluno>();
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		lista.add(a5);
		lista.add(a6);
		lista.add(a7);
		ComparaAluno compara = new ComparaAluno();
		Collections.sort(lista, compara);
		
		String alunoCredito = "Paulo";
		int contador = 0;
		
		for (int i=0; i<lista.size(); i++){
			if (lista.get(i).getNome().equals("Paulo"))
				contador++;
			if (contador > 1)
				lista.remove(lista.get(i));
		}
		
		for (Aluno a : lista){
			System.out.println(a.getNome() + " (" + a.getNotaRelatorio() + ")");
		}
		
	}
}

import java.util.Comparator;

public class ComparaAluno implements Comparator<Aluno> {
	public int compare(Aluno a1, Aluno a2) {
		// TODO Auto-generated method stub
		if (a1.getNotaRelatorio() > a2.getNotaRelatorio())
			return -1;
		if (a1.getNotaRelatorio() < a2.getNotaRelatorio())
			return 0;
		return 0;
	}
}
	
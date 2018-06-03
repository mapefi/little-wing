
public class TestaPessoa {
	public static void main (String args[]){
		Pessoa p = new Pessoa();
		p.nome = "Carlos";
		p.idade = 30;
		
		for (int i=0; i<6; i++){
			p.fazAniversario();
		}
		
		System.out.println(p.nome + ", " + p.idade);
	}
}

import java.util.LinkedList;
import java.util.List;

public class TestaPeca {
	public static void main(String[] args) {
		Peca p1 = new Peca("Peça 1", false);
		Peca p2 = new Peca("Peça 2", false);
		Peca p3 = new Peca("Peça 3", true);
		Peca p4 = new Peca("Peça 4", false);
		Peca pn = new Peca("Peça Nova", false);

		List<Peca> maquina = new LinkedList<Peca>();
		maquina.add(p1);
		maquina.add(p2);
		maquina.add(p3);
		maquina.add(p4);
		
		System.out.println("Rodada 1");
		for (Peca p : maquina){
			System.out.println(p.getNome() + ", " + p.isDefeituosa());
		}

		for (int i = 0; i < maquina.size(); i++) {
			if (maquina.get(i).getDefeituosa()) {
				maquina.remove(i);
				maquina.add(i, pn);
			}
		}
		
		System.out.println("Rodada 2");
		for (Peca p : maquina){
			System.out.println(p.getNome() + ", " + p.isDefeituosa());
		}
	}
}

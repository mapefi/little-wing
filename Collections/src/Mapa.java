import java.util.HashMap;
import java.util.Map;

public class Mapa {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta(10000);
		Conta c2 = new Conta(3000);
		
		Map<String, Conta> mapaDeContas = new HashMap<>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		
		System.out.println(contaDoDiretor.getSaldo());
		
		
	}
}

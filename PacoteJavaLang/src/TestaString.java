
public class TestaString {

	public static void main(String[] args) {
		String s = "fj11";
		System.out.println(s.replaceAll("1", "2"));

		if (s.contains("11"))
			System.out.println("Contém 11");
		else
			System.out.println("Não contém 11");

		if (s.isEmpty())
			System.out.println("String vazia");
		else
			System.out.println("String preenchida");
		
		System.out.println("Tamanho da string: " + s.length());
		
		System.out.println("Caracter na segunda posicao: " + s.charAt(1));
		
		System.out.println(invertePalavra("Socorram-me, subi no ônibus em Marrocos"));
		
		System.out.println(converteString("762"));
		
	}
	
	private static String invertePalavra (String palavra){
		String invertida = "";
		
		String[] auxiliar = palavra.split(" ");
		
		for (int i = auxiliar.length-1; i>=0; i--){
			invertida += auxiliar[i];
			
			if (i != 0)
				invertida += " ";
		}
		return invertida;
	}
	
	private static int converteString (String palavra){
		int multiplicador = 1;
		int resp = 0;
		char c;
		
		for (int i=palavra.length()-1; i>=0; i--){
			resp += Character.getNumericValue(palavra.charAt(i)) * multiplicador;
			multiplicador = multiplicador * 10;
			
		}
		
		return resp;
	}
	
}

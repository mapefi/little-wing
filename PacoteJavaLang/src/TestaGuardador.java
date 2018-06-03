
public class TestaGuardador {

	public static void main(String[] args) {

		GuardadorDeObjetos guardador = new GuardadorDeObjetos();

		int i1 = 100;
		String s1 = "" + i1;
		System.out.println(s1);

		double d1 = 1.2;
		String s2 = "" + d1;
		System.out.println(s2);

		String s3 = "100";
		int i2 = Integer.parseInt(s3);
		System.out.println(i2);

		int i3 = 5;
		Integer x1 = new Integer(i3);
		guardador.adicionaObjeto(x1);
		System.out.println(guardador.pegaObjeto(0));

		int i4 = 5;
		Integer x2 = new Integer(i4);
		int numeroDeVolta = x2.intValue();
		System.out.println(numeroDeVolta);

		String z = new String("fj11");
		String y = new String("fj11");

		if (z == y) {
			System.out.println("referência para o mesmo objeto");
		} else {
			System.out.println("referências para objetos diferentes!");
		}
		
		if (z.equals(y)) {
			System.out.println("referência para o mesmo objeto");
		} else {
			System.out.println("referências para objetos diferentes!");
		}
		
		String frase = "java é demais";
		String palavras[] = frase.split(" ");
		
		for (String p : palavras){
			System.out.println(p);
		}
		
		String palavra2 = "fj11";
		System.out.println(palavra2.toUpperCase());
		
		palavra2 = palavra2.replace("1", "2");
		System.out.println(palavra2);


	}

}

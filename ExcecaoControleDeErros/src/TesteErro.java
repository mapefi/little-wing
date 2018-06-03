
public class TesteErro {
	public static void main(String[] args) {
		System.out.println("Início do Main");
		try {
		metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro: " + e);
		}
		System.out.println("Fim do Main");
	}

	static void metodo1() {
		System.out.println("Início do Método 1");
			metodo2();

		System.out.println("Fim do Método 1");
	}

	static void metodo2() {
		System.out.println("Início do Método 2");
		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);

		}
		System.out.println("Fim do Método 2");
	}

}

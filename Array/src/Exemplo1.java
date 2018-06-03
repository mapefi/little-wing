
public class Exemplo1 {
	
	public static void main(String args[]) {
		int[] idades = new int[10];
		for (int i = 0; i < 10; i++) {
		idades[i] = i * 10;
		}
		imprimeArray(idades);
		}
	
	static void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
		}
		}

}

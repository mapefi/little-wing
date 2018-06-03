
public class Teste {
	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(3, 2);
		System.out.println(a.calculaArea());
		AreaCalculavel a2 = new Quadrado(2);
		System.out.println(a2.calculaArea());
		AreaCalculavel a3 = new Circulo(3);
		System.out.println(a3.calculaArea());
	}
}

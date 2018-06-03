
public class Teste1 {

	public static void main(String[] args) {
		Runnable r = new Programa1();
		Thread t = new Thread(r);
		t.start();
	}
}

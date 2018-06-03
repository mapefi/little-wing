
public class MinhaClasse extends Object{

	public static void main(String[] args) {
		Conta c1 = new Conta(200);
		Conta c2 = new Conta(100);

		if (c1.getSaldo() != c2.getSaldo()) {
			System.out.println("objetos referenciados são diferentes!");
			}
		
		System.out.println(c1.toString());
		
		System.out.println (equals(c1, c2));

		
	}
	
	public static boolean equals(Object object1, Object object2){
		if (!(object1 instanceof Conta))
			return false;
		if (!(object2 instanceof Conta))
			return false;
		Conta outraConta1 = (Conta) object1;
		Conta outraConta2 = (Conta) object2;
		return outraConta1.saldo == outraConta2.saldo;
	}

}

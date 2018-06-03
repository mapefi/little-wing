package br.com.caelum.banco;

public class Cliente {
	String nome;
	String sobrenome;
	String cpf;

	void mudaCPF(String cpf){
		if (validaCPF(cpf)){
			this.cpf = cpf;
			System.out.println("CPF alterado");
		}
		else
			System.out.println("O CPF é inválido");
	}
	
	private boolean validaCPF(String cpf){
		if (cpf.length() != 11)
			return false;

		int dv1 = calculaCPF(10);
		int dv2 = calculaCPF(11);
		
		String dv = (""+dv1).concat(""+dv2);
		
		if (dv.equals(cpf.substring(9)))
			return true;
		else
			return false;
	}
	
	private int calculaCPF (int i){
		int pos = 0;
		int soma = 0;
		for (int j=i; j>1; j--){
			soma += Integer.parseInt(""+cpf.charAt(pos)) * j;	
			pos++;
		}
		
		int dv = 11 - (soma % 11);

		if (dv == 10 || dv == 11)
			dv = 0;		
		
		return dv;
		
	}

}

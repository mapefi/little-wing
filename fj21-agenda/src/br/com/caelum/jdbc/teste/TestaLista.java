package br.com.caelum.jdbc.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import br.com.caelum.jdbc.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) throws ClassNotFoundException {
		
		ContatoDao dao = new ContatoDao();
				
		Contato remove = new Contato();
		remove.setId((long) 1);
		
		dao.remove(remove);
		
		 System.out.println("registro removido");
		
		Contato contato = new Contato();
		contato.setId((long) 2);
		contato.setNome("Maria do Santos");
		contato.setEmail("mariadossantos@gmail.com");
		contato.setEndereco("Rua da Graça, 324");

		String strDate = "01/07/1970";
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Calendar c = Calendar.getInstance();     
	    try {
			c.setTime(sdf.parse(strDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //aqui está o "pulo do gato"
	    contato.setDataNascimento(c);
	    
	    System.out.println("registro alterado");
	    
	    dao.altera(contato);
	    
		List<Contato> contatos = dao.getLista();
		List<Contato> pesquisa = dao.pesquisar(2);
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
        
		for (Contato contato1 : contatos) {
			System.out.println("Nome: " + contato1.getNome());
			System.out.println("Email: " + contato1.getEmail());
			System.out.println("Endereço: " + contato1.getEndereco());
			System.out.println("Data de Nascimento: " +
					dateFormat.format(contato1.getDataNascimento().getTime()) + "\n");
		}
	}
}

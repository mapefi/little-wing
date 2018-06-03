package br.com.caelum.mvc.logica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class AdicionaContatoLogic implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		res.setContentType("text/html;charset=UTF-8");
		String nome = (req.getParameter("nome"));
		String email = (req.getParameter("email"));
		String endereco = (req.getParameter("endereco"));
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		Date data = (Date)formatter.parse(req.getParameter("dataNascimento"));
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(data);
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Adicionando contato... ");
		
		req.setAttribute("contato", contato);
		return "/WEB-INF/jsp/contato-adicionado.jsp";
		
	}
}
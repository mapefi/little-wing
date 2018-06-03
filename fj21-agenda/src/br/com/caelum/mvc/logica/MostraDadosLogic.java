package br.com.caelum.mvc.logica;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.jdbc.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class MostraDadosLogic implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		resp.setContentType("text/html;charset=UTF-8");
		long id = Long.parseLong(req.getParameter("id"));
		String nome = (req.getParameter("nome"));
		String email = (req.getParameter("email"));
		String endereco = (req.getParameter("endereco"));
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
		Date data = (Date)formatter.parse(req.getParameter("dataNascimento"));
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(data);
		Contato contato = new Contato();
		contato.setId(id);
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);

		req.setAttribute("contato", contato);
		return "/WEB-INF/jsp/mostra-contato.jsp";
		
	}
}

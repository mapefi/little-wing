package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MostraAdicionaLogic implements Logica{

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		resp.setContentType("text/html;charset=UTF-8");
		return "/WEB-INF/jsp/adiciona-contato.jsp";
	}
}

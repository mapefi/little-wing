package br.com.alura.gerenciador.web;

import java.io.IOException;

//import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;

@WebFilter(urlPatterns= "/*")
public class FiltroDeAuditoria implements Filter {

//	private HttpSession session;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest req = (HttpServletRequest) request;
		String uri = req.getRequestURI();
		String usuario = getUsuario(req);
		
		System.out.println("Usuário " + usuario + " acessando a URI " + uri);
		chain.doFilter(request, response);
	}

	private String getUsuario(HttpServletRequest req) {
		//Cookie cookie = new Cookies(req.getCookies()).buscaUsuarioLogado();
		Usuario usuario = (Usuario) req.getSession().getAttribute("usuarioLogado");
		if (usuario == null)
			return "<deslogado>";
		return usuario.getEmail();
	}

}

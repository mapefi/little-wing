package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.Map;

//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.Usuario;
import br.com.alura.gerenciador.dao.UsuarioDAO;

@WebServlet(urlPatterns = "/login")
public class Login implements Tarefa {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	
//	final static Map<String, Usuario> USUARIOS_LOGADOS = new HashMap<>();

/*	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");	
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email,senha);
		PrintWriter writer = resp.getWriter();
		
		if (usuario==null){
			writer.println("<html><body>Usuário Inválido</body></html>");
		}
		else{
			HttpSession session = req.getSession();
			session.setAttribute("usuarioLogado", usuario);
	//		String codigoAleatorio = "" + System.currentTimeMillis() + "/" + Math.random();
	//		USUARIOS_LOGADOS.put(codigoAleatorio, usuario);
	//		Cookie cookie = new Cookie("usuarioLogado", codigoAleatorio);
	//		cookie.setMaxAge(10 * 60);
	//		resp.addCookie(cookie);
			writer.println("<html><body>Usuário Logado: " + usuario.getEmail() + "</body></html>");
		}
	} */
	@Override
	
	public String executa(HttpServletRequest req, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");	
		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email,senha);
		//try {
			//PrintWriter writer = response.getWriter();
			if (usuario==null){
				req.setAttribute("usuarioLogado", null);
				//writer.println("<html><body>Usuário Inválido</body></html>");
			}
			else{
				HttpSession session = req.getSession();
				session.setAttribute("usuarioLogado", usuario);
			}
			//} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
	//	}
		return ("WEB-INF/paginas/login.jsp");
	}
	
}

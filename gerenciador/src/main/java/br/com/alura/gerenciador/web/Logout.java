package br.com.alura.gerenciador.web;

//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Collection;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

//import br.com.alura.gerenciador.Empresa;
//import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet(urlPatterns = "/logout")
public class Logout implements Tarefa {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
//	private HttpSession session;

	/*	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//	Cookie cookie = new Cookies(req.getCookies()).buscaUsuarioLogado();
	//	Login.USUARIOS_LOGADOS.get(cookie.getValue());
		//req.getSession().setMaxInactiveInterval(arg0);
		req.getSession().removeAttribute("usuarioLogado");
		
		PrintWriter writer = resp.getWriter();
		
		//if (cookie == null){
		//writer.println("<html><body>Usuário não estava logado!</body></html>");
		//}
		
		//cookie.setMaxAge(0);
		//resp.addCookie(cookie);
		//writer.println("<html><body>Deslogando com sucesso</body></html>");
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/paginas/logout.html");
		dispatcher.forward(req,resp); 

	} */

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse response) {
		// TODO Auto-generated method stub
		req.getSession().removeAttribute("usuarioLogado");
		return ("WEB-INF/paginas/logout.html");
	}

}

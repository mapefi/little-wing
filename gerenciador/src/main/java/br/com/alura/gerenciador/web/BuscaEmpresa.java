package br.com.alura.gerenciador.web;

//import java.io.IOException;
//import java.io.PrintWriter;
import java.util.Collection;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet(urlPatterns = "/busca")
public class BuscaEmpresa implements Tarefa {

	public BuscaEmpresa(){
		System.out.println("Construindo uma servlet do tipo BuscaEmpresa" + this);
	}

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse response) {
		String filtro = req.getParameter("filtro");
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		req.setAttribute("empresas", empresas);
		return ("WEB-INF/paginas/buscaEmpresa.jsp");
	}
	
/*	public void init() throws ServletException{
		super.init();
		System.out.println("Iniciando a servlet " + this);
	}
	
	public void destroy(){
		super.destroy();
		System.out.println("Destruindo a servlet " + this);
	}  */

	
/*	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>");
		writer.println("Resultado da busca:<br/>");
		String filtro = req.getParameter("filtro");
		Collection<Empresa> empresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		req.setAttribute("empresas", empresas);
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/paginas/buscaEmpresa.jsp");
		dispatcher.forward(req, resp);
		//writer.println("<ul>");
		//for (Empresa empresa : empresas){
	///		writer.println("<li>" + empresa.getId() + ": " + empresa.getNome() + "</li>");
	//	}
	//	writer.println("</ul>");		
	//	writer.println("</body></html>");
	} */
	
	
	
}

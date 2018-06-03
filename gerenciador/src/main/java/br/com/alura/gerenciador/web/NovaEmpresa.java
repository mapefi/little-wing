package br.com.alura.gerenciador.web;

//import java.io.IOException;
//import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.Empresa;
import br.com.alura.gerenciador.dao.EmpresaDAO;

@WebServlet (urlPatterns="/novaEmpresa")
public class NovaEmpresa implements Tarefa{

//	private static final long serialVersionUID = 1L;
//	private RequestDispatcher requestDispatcher;

/*	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa(nome);
		new EmpresaDAO().adiciona(empresa);
		req.setAttribute("empresa", empresa);
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/paginas/novaEmpresa.jsp");
		dispatcher.forward(req, resp);
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body>Empresa adicionada com sucesso: " + empresa.getNome() + "</body></html>");
	} */

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String nome = req.getParameter("nome");
		Empresa empresa = new Empresa(nome);
		new EmpresaDAO().adiciona(empresa);
		req.setAttribute("empresa", empresa);
		return ("WEB-INF/paginas/novaEmpresa.jsp");
	}
	
}

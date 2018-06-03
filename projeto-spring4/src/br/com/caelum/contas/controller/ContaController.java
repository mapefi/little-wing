package br.com.caelum.contas.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;

@Controller
public class ContaController {

	private ContaDAO dao;
	
	@Autowired
	public ContaController(ContaDAO dao){
		this.dao = dao;
	}
	
	@RequestMapping("/form")
	public String formulario(){
		return "conta/formulario";
	}
	
	@RequestMapping("/adicionaConta")
	public String adiciona(@Valid Conta conta, BindingResult result){
		
		//if (result.hasFieldErrors("descricao")) {
		if (result.hasErrors()){
			return "conta/formulario";
		}
		
		System.out.println("Conta adicionada é: " + conta.getDescricao());
		
		dao.adiciona(conta);
		
		return "conta/conta-adicionada";
	}
	
//	@RequestMapping("/pagaConta")
//	public void paga(Conta conta, HttpServletResponse response){ //retorna void devido a requisição Ajax
//		ContaDAO dao = new ContaDAO();
//		dao.paga(conta.getId());
//		
//		response.setStatus(200);
		
		//return "redirect:listaContas" - ja estava comentado;
	//}
	
	@RequestMapping("/pagaConta")
	public void paga(Long id, HttpServletResponse response) {
	  dao.paga(id);
	  response.setStatus(200);
	}
	
	
	@RequestMapping("/removeConta")
	public String remove(Conta conta){
		dao.remove(conta);
		
		//return "forward:listaContas";
		return "redirect:listaContas";
	}
	
	@RequestMapping("/mostraConta")
	public String mostra(Long id, Model model){
		Conta conta = dao.buscaPorId(id);
		model.addAttribute("conta", conta);
		return "conta/mostra";
	}

	@RequestMapping("/alteraConta")
	public String alteraConta(Conta conta){
		dao.altera(conta);
		System.out.println("id da conta: " + conta.getId());
		return "redirect:listaContas";
	}
	
	@RequestMapping("/listaContas")
	public ModelAndView lista(){
		
		List<Conta> contas = dao.lista();
		
		ModelAndView mv = new ModelAndView("conta/lista");
		mv.addObject("todasContas", contas);
		
		return mv;
	}
	
//	@RequestMapping("/listaContas")
//	public String lista(Model mv) {
//	  ContaDAO dao = new ContaDAO();
//	  List<Conta> contas = dao.lista();
//
//	  mv.addAttribute("contas", contas);
//	  return "conta/lista";
//	}
	
}

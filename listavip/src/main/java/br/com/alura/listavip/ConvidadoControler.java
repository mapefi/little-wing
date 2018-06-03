package br.com.alura.listavip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.alura.enviadorEmail.EmailService;
import br.com.alura.listavip.model.Convidado;

@Controller
public class ConvidadoControler {

	@Autowired
	private ConvidadoService service;
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping("listaconvidados")
	public String listaConvidados(Model model) {

		Iterable<Convidado> convidados = service.obterTodos();

		model.addAttribute("convidados", convidados);

		return "listaconvidados";
	}

	@RequestMapping(value = "salvar", method = RequestMethod.POST)
	public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email,
			@RequestParam("telefone") String telefone, Model model) {
		
		Convidado novoConvidado = new Convidado(nome, email, telefone);
		
		service.salvar(novoConvidado);
		
		new EmailService().enviar(nome, email);
		
		return listaConvidados(model);
	}
	
	@RequestMapping(value = "deletar{id}")
	public String deletar(@PathVariable("id") Long id, Model model) {
		
		Convidado convidadoDeletado = service.buscaUm(id);

		service.deleta(convidadoDeletado);
		
		return listaConvidados(model);
	}
	
	@RequestMapping(value = "buscaPorNome", method = RequestMethod.POST)
	public String buscaPorNome(@RequestParam("nome") String nome, Model model){
	    
		if (nome.isEmpty())
			return listaConvidados(model);
		
	    model.addAttribute("convidados", service.buscaPorNome(nome));
	    
		return "listaconvidados";
	}

}

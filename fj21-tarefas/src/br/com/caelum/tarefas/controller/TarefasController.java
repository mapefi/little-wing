package br.com.caelum.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.tarefas.jdbc.TarefaDao;
import br.com.caelum.tarefas.model.Tarefa;

import java.util.List;

import javax.validation.Valid;

@Controller
public class TarefasController {
	@RequestMapping("novaTarefa")
	public String form() {
		return "tarefa/formulario";
	}

	@RequestMapping("adicionaTarefa")
	public String adiciona(@Valid Tarefa tarefa, BindingResult result) {

		if (result.hasFieldErrors("descricao")) {
			return "tarefa/formulario";
		}

		TarefaDao dao;
		try {
			dao = new TarefaDao();
			dao.adiciona(tarefa);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "tarefa/adicionada";
	}

	@RequestMapping("listaTarefas")
	public String lista(Model model) {
		TarefaDao dao = null;
		try {
			dao = new TarefaDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Tarefa> tarefas = dao.getLista();

		model.addAttribute("tarefas", tarefas);
		return "tarefa/lista";

	}

	@RequestMapping("removeTarefa")
	public String remove(Tarefa tarefa) {
		TarefaDao dao = null;
		try {
			dao = new TarefaDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.remove(tarefa);
		return "redirect:listaTarefas";
	}

	@RequestMapping("mostraTarefa")
	public String mostra(Long id, Model model) {
		TarefaDao dao = null;
		try {
			dao = new TarefaDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("tarefa", dao.pesquisar(id));
		System.out.println(dao.pesquisar(id));
		return "tarefa/mostra";
	}

	@RequestMapping("alteraTarefa")
	public String altera(Tarefa tarefa) {
		TarefaDao dao = null;
		try {
			dao = new TarefaDao();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.altera(tarefa);
		return "redirect:listaTarefas";
	}

}

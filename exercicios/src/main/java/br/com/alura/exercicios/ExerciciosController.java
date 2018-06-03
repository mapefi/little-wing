package br.com.alura.exercicios;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExerciciosController {

	@RequestMapping(value="/")
	public String index(){
		return "home";
	}
	
}

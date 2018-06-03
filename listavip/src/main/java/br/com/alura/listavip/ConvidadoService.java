package br.com.alura.listavip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.listavip.model.Convidado;
import br.com.alura.listavip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository repository;
	
	public Iterable<Convidado> obterTodos(){
		
		Iterable<Convidado> convidados = repository.findAll();
		
		return convidados;
	}
	
	public void salvar(Convidado convidado){
		
		repository.save(convidado);	
	}
	
	public Convidado buscaUm(Long id){
		
		Convidado convidado = repository.findOne(id);
		
		return convidado;
	}
	
	public void deleta(Convidado convidado){
		
		repository.delete(convidado);
	}
	
	public Iterable<Convidado> buscaPorNome(String nome){
		
		Iterable<Convidado> convidados = repository.findByNome(nome);
		
		return convidados;
	}

}

package br.com.caelum.tarefas.model;

import java.util.Calendar;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Tarefa {
	private Long id;
	
	@NotNull (message="A descrição deve ser preenchida")
	@Size (min=5, message="A descrição deve conter entre 5 e 2147483647")
	private String descricao;
	
	private boolean finalizado;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Calendar dataFinalizacao;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getFinalizado() {
		return this.finalizado;
	}

	public void setFinalizado (Boolean finalizado) {
		this.finalizado = finalizado;
	}
	
	public boolean isFinalizado () {
		return finalizado;
	}

	public Calendar getDataFinalizacao() {
		return this.dataFinalizacao;
	}

	public void setDataFinalizacao(Calendar data) {
		this.dataFinalizacao = data;
	}
}

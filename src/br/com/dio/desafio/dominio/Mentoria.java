package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
	String titulo;
	String descricao;
	LocalDate data;
	
	public Mentoria() {
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}
	
}
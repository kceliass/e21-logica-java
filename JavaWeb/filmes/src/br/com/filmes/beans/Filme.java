package br.com.filmes.beans;

import java.io.Serializable;

public class Filme implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String titulo;
	private String classificacao;
	private String genero;
	private boolean topFilme;
	
	public Filme() {}
	
	public Filme(int id, String titulo, String classificacao, String genero, boolean topFilme) {
		this.id = id;
		this.titulo = titulo;
		this.classificacao = classificacao;
		this.genero = genero;
		this.topFilme = topFilme;
	}

	public Filme(String titulo, String classificacao, String genero, boolean topFilme) {
		this.titulo = titulo;
		this.classificacao = classificacao;
		this.genero = genero;
		this.topFilme = topFilme;
	}

	public int getId() {
		return id;
	}
	 
	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean getTopFilme() {
		return topFilme;
	}

	public void setTopFilme(boolean topFilme) {
		this.topFilme = topFilme;
	}
	
}

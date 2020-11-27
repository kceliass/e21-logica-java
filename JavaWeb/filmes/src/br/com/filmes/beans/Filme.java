package br.com.filmes.beans;

import java.io.Serializable;

public class Filme implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String titulo;
	private int classificacao;
	private String genero;
	private int topFilme;
	
	public Filme(long l, String string, int i, String string2) {}
	
	public Filme(int id, String titulo, int classificacao, String genero, int topFilme) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.classificacao = classificacao;
		this.genero = genero;
		this.topFilme = topFilme;
	}

	public Filme() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the classificacao
	 */
	public int getClassificacao() {
		return classificacao;
	}
	/**
	 * @param classificacao the classificacao to set
	 */
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the topFilme
	 */
	public int getTopFilme() {
		return topFilme;
	}

	/**
	 * @param topFilme the topFilme to set
	 */
	public void setTopFilme(int topFilme) {
		this.topFilme = topFilme;
	}
	
	
}

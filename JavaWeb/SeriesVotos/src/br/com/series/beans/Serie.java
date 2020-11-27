package br.com.series.beans;

import java.io.Serializable;

public class Serie implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private int voto;
	
	public Serie() {}

	public Serie(int id, String nome, int voto) {
		super();
		this.id = id;
		this.nome = nome;
		this.voto = voto;
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
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the voto
	 */
	public int getVoto() {
		return voto;
	}

	/**
	 * @param voto the voto to set
	 */
	public void setVoto(int voto) {
		this.voto = voto;
	}
	
}

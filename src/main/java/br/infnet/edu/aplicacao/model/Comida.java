package br.infnet.edu.aplicacao.model;

import java.util.Objects;

public class Comida {

	private String nome;
	private Integer preco;
	
	public Comida(String nome, Integer preco) {
		
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comida other = (Comida) obj;
		return Objects.equals(nome, other.nome) && preco == other.preco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPreco() {
		return preco;
	}
	public void setPreco(Integer preco) {
		this.preco = preco;
	}
}

package br.com.projeto.web.model;

import java.io.Serializable;
import java.util.Date;

/*
Tabela por classe Concreta: só as filhas
Tabela por Hierarquia: tudo numa só
Tabela por Sub-Classe: pais e filhas
*/
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nome;
	private float numero;
	private Date cadastro;
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa(long id, String nome, float numero, Date cadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.numero = numero;
		this.cadastro = cadastro;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cadastro == null) {
			if (other.cadastro != null)
				return false;
		} else if (!cadastro.equals(other.cadastro))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Float.floatToIntBits(numero) != Float.floatToIntBits(other.numero))
			return false;
		return true;
	}
	public Date getCadastro() {
		return cadastro;
	}
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public float getNumero() {
		return numero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cadastro == null) ? 0 : cadastro.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Float.floatToIntBits(numero);
		return result;
	}
	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumero(float numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", numero=" + numero
				+ ", cadastro=" + cadastro + "]";
	}
}
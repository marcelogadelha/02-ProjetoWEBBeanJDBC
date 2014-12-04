package br.com.projeto.web.model;

import java.io.Serializable;
import java.util.Date;

public class Classe implements Serializable{
	private static final long serialVersionUID = 1L;

	private long numero;
	private String nome;
	private Date data;
	
	public Classe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Classe(long numero, String nome, Date data) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classe other = (Classe) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}
	public Date getData() {
		return data;
	}
	public String getNome() {
		return nome;
	}
	public long getNumero() {
		return numero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + (int) (numero ^ (numero >>> 32));
		return result;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Classe [numero=" + numero + ", nome=" + nome + ", data=" + data
				+ "]";
	}
}
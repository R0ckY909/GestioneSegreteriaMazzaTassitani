package model;

import java.io.Serializable;

public class Indirizzo implements Serializable {
	
	private static final long serialVersionUID = 2320191540302383128L;
	
	private Long id;
	private String nome;
	
	public Indirizzo() { }
	 
	public Indirizzo(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "[" + this.id + ", " 
	               + this.nome + "]";
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public boolean equals(Object object) {
		Indirizzo indirizzo = (Indirizzo) object;
		return (this.getId() == indirizzo.getId());
	}
	
}

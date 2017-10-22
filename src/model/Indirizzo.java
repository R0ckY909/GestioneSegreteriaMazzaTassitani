package model;

public class Indirizzo {
	
	private Long codice;
	private String nome;
	
	public Indirizzo() { }
	
	public Indirizzo(String nome) {
		this.nome = nome;
	}
	
	public Indirizzo(Long codice, String nome) {
		this.codice = codice;
		this.nome = nome;
	}

	public Long getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setCodice(Long codice) {
		this.codice = codice;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "[" + this.codice + ", " 
	               + this.nome + "]";
	}

	@Override
	public int hashCode() {
		return this.codice.hashCode();
	}

	@Override
	public boolean equals(Object object) {
		Indirizzo indirizzo = (Indirizzo) object;
		return (this.getCodice() == indirizzo.getCodice());
	}
	
}

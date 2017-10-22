package model;

public class Dipartimento {
	
	private Long codice;
	private String nome;
	
	public Dipartimento() { }
	
	public Dipartimento(String nome) {
		this.nome = nome;
	}
	
	public Dipartimento(Long codice, String nome) {
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
		Dipartimento dipartimento = (Dipartimento) object;
		return (this.getCodice() == dipartimento.getCodice());
	}

}

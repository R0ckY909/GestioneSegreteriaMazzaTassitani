package model;

public class Corso {
	
	private Long id;
	private String nome;
	
	public Corso() { }
	 
	public Corso(Long id, String nome) {
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
		Corso corso = (Corso) object;
		return (this.getId() == corso.getId());
	}

}

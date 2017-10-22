package model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Gruppo {
	
	private Long codice;
	private String nome;
	private Set<Studente> studenti;

	public Gruppo() { 
		this.studenti = new HashSet<Studente>();
	}
	
	public Gruppo(String nome) {
		this.nome = nome;
		this.studenti = new HashSet<Studente>();
	}
	
	public Gruppo(Long codice, String nome) {
		this.codice = codice;
		this.nome = nome;
		this.studenti = new HashSet<Studente>();
	}
	
	public Long getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}
	
	public Set<Studente> getStudenti() {
		return this.studenti;
	}

	public void setCodice(Long codice) {
		this.codice = codice;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setStudenti(Set<Studente> studenti) {
		this.studenti = studenti;
	}
	
	public void addStudente(Studente studente) {
		this.studenti.add(studente); // fondamentale usare .getStudenti() per il proxy!!!
	}
	
	public void removeStudente(Studente studente) {
		this.studenti.remove(studente); // fondamentale usare .getStudenti() per il proxy!!!
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("[");
		str.append(this.getCodice() + ", " + this.getNome());
		str.append(", {");
		Iterator<Studente> iter = studenti.iterator();
		while (iter.hasNext()) {
			str.append(iter.next().getMatricola());
			if (iter.hasNext()) {
				str.append(", ");
			}
		}
		str.append("}]\n");
		return str.toString();
	}
	
	@Override
	public int hashCode() {
		return this.codice.hashCode();
	}

	@Override
	public boolean equals(Object object) {
		Gruppo gruppo = (Gruppo) object;
		return (this.getCodice() == gruppo.getCodice());
	}
	
}
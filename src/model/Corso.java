package model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Corso {
	
	private Long codice;
	private String nome;
	private Set<Studente> studenti;
	
	public Corso() { 
		this.studenti = new HashSet<Studente>();
	}
	
	public Corso(String nome) {
		this.nome = nome;
		this.studenti = new HashSet<Studente>();
	}
	
	public Corso(Long codice, String nome) {
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
		return studenti;
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
		if (this.studenti == null) {
			this.studenti = new HashSet<Studente>();
		} else {
			this.studenti.add(studente);
		}
	}
	
	public void removeStudente(Studente studente) {
		if (this.studenti == null) {
			this.studenti = new HashSet<Studente>();
		} else {
			this.studenti.remove(studente);
		}
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("[");
		str.append("[" + this.getCodice() + ", " + this.getNome());
		str.append(", {");
		Iterator<Studente> iter = this.studenti.iterator();
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
		Corso corso = (Corso) object;
		return (this.getCodice() == corso.getCodice());
	}

}

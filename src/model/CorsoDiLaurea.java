package model;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CorsoDiLaurea {
	
	private Long codice;
	private String nome;
	private Dipartimento dipartimento;
	private Set<Corso> corsi;
	
	public CorsoDiLaurea() { }
	
	public Long getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}
	
	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public Set<Corso> getCorsi() {
		return corsi;
	}
	
	public void setCodice(Long codice) {
		this.codice = codice;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public void aggiungiCorso(Corso corso) {
		if (corsi == null) {
			this.corsi = new HashSet<Corso>();
		}
		this.corsi.add(corso);
	}
	
	public void rimuoviCorso(Corso corso) {
		if (corsi == null) {
			this.corsi = new HashSet<Corso>();
		}
		this.corsi.remove(corso);
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer("[");
		str.append("[" + this.getCodice() + ", " + this.getNome() + ", " + this.dipartimento.getCodice());
		str.append(", {");
		Iterator<Corso> iter = corsi.iterator();
		while (iter.hasNext()) {
			str.append(iter.next().getId());
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
		CorsoDiLaurea corsoDiLaurea = (CorsoDiLaurea) object;
		return (this.getCodice() == corsoDiLaurea.getCodice());
	}

}

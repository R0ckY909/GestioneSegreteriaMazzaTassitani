package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Studente {
	
	private String matricola;
	private String nome;
	private String cognome;
	private Date dataNascita;
	
	private Indirizzo indirizzo;

	public Studente() { }
	
	public Studente(String matricola, String nome, String cognome, Date dataNascita, Indirizzo indirizzo) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.indirizzo = indirizzo;
	}

	public String getMatricola() {
		return matricola;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public Date getDataNascita() {
		return dataNascita;
	}
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	
	@Override
	public int hashCode() {
		return this.matricola.hashCode();
	}

	@Override
	public boolean equals(Object object) {
		Studente studente = (Studente) object;
		return (this.getMatricola() == studente.getMatricola());
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "[" + this.getMatricola() + ", " + 
					 this.getNome() + ", " + 
					 this.getCognome() + ", " +
					 sdf.format(this.getDataNascita()) + ", " + 
					 this.getIndirizzo().toString() +"]"; 		
	}
	
}

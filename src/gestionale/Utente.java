package gestionale;

public class Utente {

	private long id;
	private String nome;
	private String cognome;
	private String email;
	private Utente untente;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Utente getUntente() {
		return untente;
	}
	public void setUntente(Utente untente) {
		this.untente = untente;
	}
	

}


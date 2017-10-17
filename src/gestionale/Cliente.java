package gestionale;

public class Cliente {
	
	private long id;
	private String nome;
	private String cognome;
	private String codiceFiscale;

	public void setId(long id){
	this.id = id;
	}

	public long getId(){
	return id;
	}

	public void setNome(String nome){
	this.nome=nome;
	}

	public String getNome(){
	return nome;
	}

	public void setCognome(String cognome){
	this.cognome=cognome;
	}

	public String getCognome(){
	return cognome;
	}

	public void setCodiceFiscale(String codiceFiscale){
	this.codiceFiscale=codiceFiscale;
}

}

package gestionale;

public class Ruolo {
	
	/**
	 * Ruolo: rappresenta il ruolo che ha l'utente all'interno dell'e-commerce.
	 * I ruoli previsti sono: amministratore di sistema, cliente, responsabile
	 * catalogo, contabile, responsabile magazzino
	 */
	
	private String amministratoreDiSistema;
	private String cliente;
	private String resposabileCatalogo;
	private String contabile;
	private String responsableDiMagazzino;	
	
	public String getAmministratoreDiSistema() {
		return amministratoreDiSistema;
	}
	public void setAmministratoreDiSistema(String amministratoreDiSistema) {
		this.amministratoreDiSistema = amministratoreDiSistema;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getResposabileCatalogo() {
		return resposabileCatalogo;
	}
	public void setResposabileCatalogo(String resposabileCatalogo) {
		this.resposabileCatalogo = resposabileCatalogo;
	}
	public String getContabile() {
		return contabile;
	}
	public void setContabile(String contabile) {
		this.contabile = contabile;
	}
	public String getResponsableDiMagazzino() {
		return responsableDiMagazzino;
	}
	public void setResponsableDiMagazzino(String responsableDiMagazzino) {
		this.responsableDiMagazzino = responsableDiMagazzino;
	}
	
	

}

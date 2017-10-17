package gestionale;

public class Prodotto {
	
	private long id;
	private String nome;
	private String descrizione;
	private double prezzo;
	private Categoria categoriaMerciologica;

	public void setId(long id){
	this.id=id;
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
	public void setDescrizione(String descrizione){
	this.descrizione=descrizione;
	}
	public String getDescrizione(){
	return descrizione;
	}
	public void setPrezzo(double prezzo){
	this.prezzo=prezzo;
	}
	public double getPrezzo(){
	return prezzo;
	}
	public void setCategoria(Categoria categoriaMerciologica){
	this.categoriaMerciologica=categoriaMerciologica;
	}
	public Categoria getCategoria(){
	return categoriaMerciologica;
	}
	@Override
	public String toString(){
		return getNome()+getDescrizione()+getPrezzo();
}

}

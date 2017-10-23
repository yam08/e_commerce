package gestionale;

public class Libro {
	
	private String autore;
	private String titolo;
	private String genero;
    private String numeroPagina;
	private double prezzo;

	public Libro(String autore, String titolo, String genero, String numeroPagina, double prezzo)
	{
	this.autore = autore;
	this.titolo = titolo;
	this.genero = genero;
	this.numeroPagina = numeroPagina;
	this.prezzo = prezzo;
	}

	public void setPrezzo(double prezzo)
	{
	this.prezzo = prezzo;
	}

	public double getPrezzo()
	{
	return prezzo;
	}

	public void setTitolo(String titolo)
	{
	this.titolo = titolo;
	}

	public String getTitolo()
	{
	return titolo;
	}

	public void setGenero(String genero)
	{
	this.genero = genero;
	}

	public String getGenero()
	{
	return genero;
	}

    public void setAutore(String autore)
	{
	this.autore = autore;
	}

	public String getAutore()
	{
	return autore;
	}

	public void setNumeroPagina(String numeroPagina)
	{
	this.numeroPagina = numeroPagina;
	}

	public String getNumeroPagina()
	{
	return numeroPagina;
}
	
	@Override
	public String toString(){
		
		return "\nLibro\n"
		+"Autore: " + getAutore() 
		+ "\nTitolo: " + getTitolo() 
		+ "\nGenero: " + getGenero()
		+ "\nPagine: " + getNumeroPagina()
		+ "\nPrezzo: "+ getPrezzo()+ " €";
	}

}

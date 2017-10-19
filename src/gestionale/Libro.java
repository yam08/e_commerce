package gestionale;

public class Libro {
	
	private String autore;
	private String titolo;
	private String genero;
    private String numeroPagina;

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
		
		return "Autore: " + getAutore() + "\nTitolo: " + getTitolo() + "\nGenero: " + getGenero()+ "\nPaginas: " + getNumeroPagina();
	}

}

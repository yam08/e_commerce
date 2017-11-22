package gestionale;

public class RigaOrdine {
	
	private long id;
	private Prodotto prodotto;
	private int quantita;
	private double prezzoUnitario;
	private OrdineDiVendita odv;
	
	public RigaOrdine(long id, Prodotto prodotto,int quantita, double prezzoUnitario){
		
		this.id = id;
		this.prodotto = prodotto;
		this.quantita = quantita;
		this.prezzoUnitario = prezzoUnitario;
	}


	public void setId(long id)
	{
	this.id = id;
	}

	public long getId()
	{
	return id;
	}

	public void setProdotto(Prodotto prodotto)
	{
	this.prodotto = prodotto;
	}

	public Prodotto getProdotto()
	{
	return prodotto;
	}

	public void setQuantita(int quantita)
	{
	this.quantita = quantita;
	}

	public int getQuantita()
	{
	return quantita;
	}

	public void setPrezzoUnitario(double prezzoUnitario)
	{
	this.prezzoUnitario = prezzoUnitario;
	}

	public double getPrezzoUnitario()
	{
	return prezzoUnitario;
	}

	public void setOdv(OrdineDiVendita odv)
	{
	this.odv = odv;
	}

	public OrdineDiVendita getOdv()
	{
	return odv;
}

}

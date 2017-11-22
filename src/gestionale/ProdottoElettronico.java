package gestionale;

public class ProdottoElettronico extends Prodotto{
	
	private String modello; 
	private String marca;

	public ProdottoElettronico(String modello, String marca){  

	this.modello=modello;
	this.marca=marca;
	}
  
	public void setModello(String modello)
	{
	this.modello = modello;
	}

	public String getModello()
	{
	return modello;
	}

	public void setMarca(String marca)
	{
	this.marca = marca;
	}

	public String getMarca()
	{
	return marca;
	}
	
	@Override
	public String toString(){
	return getMarca()+getModello();
}

}

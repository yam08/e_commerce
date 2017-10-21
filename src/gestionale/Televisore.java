package gestionale;

public class Televisore extends ProdottoElettronico {

	private double prezzo;
	
   public Televisore(String marca, String modello, double prezzo){
		super(marca, modello);
		this.prezzo=prezzo;
		
	}
 
	@Override
	public String toString(){
		return "\nTelevisore\n"
		+"Marca: "+getMarca()
		+"\nModello: "+getModello()
		+"\nPrezzo: "+getPrezzo();
}
}

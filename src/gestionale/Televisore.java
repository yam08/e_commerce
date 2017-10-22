package gestionale;

public class Televisore extends ProdottoElettronico {

	private double prezzo;
	
   public Televisore(String marca, String modello, double prezzo){
		super(marca, modello);
		this.prezzo=prezzo;
		}
	public void setPrezzo(double prezzo){
		this.prezzo=prezzo;
	}
	public double getPrezzo(){
		return prezzo;
	}
 
	@Override
	public String toString(){
		return "\nTelevisore\n"
		+"Marca: "+getMarca()
		+"\nModello: "+getModello()
		+"\nPrezzo: "+getPrezzo();
}
}

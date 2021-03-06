package gestionale;

public class Televisore extends ProdottoElettronico {

	private double id;
	private double prezzo;
	
   public Televisore(double id,String marca, String modello, double prezzo){
		super( marca, modello);
		this.id=id;
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

package gestionale;

public class Televisore extends ProdottoElettronico {

	private double prezzo;
	
   public Televisore(long id,String marca, String modello, double prezzo){
		super(id, marca, modello);
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

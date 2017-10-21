package gestionale;

public class Televisore extends ProdottoElettronico {

	
   public Televisore(String marca, String modello){
		super(marca, modello);
	}
 
	@Override
	public String toString(){
		return "\nTelevisore\n"
		+"Marca: "+getMarca()
		+"\nModello: "+getModello()
		+"\nPrezzo: "+getPrezzo();
}
}

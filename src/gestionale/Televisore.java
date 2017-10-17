package gestionale;

public class Televisore extends ProdottoElettronico {
	
	@Override
	public String toString(){
		return "\nTelevisore\n"
		+"Marca: "+getMarca()
		+"\nModello: "+getModello()
		+"\nPrezzo: "+getPrezzo();
}

}

package gestionale;
import java.util.ArrayList;

public class Categoria {
	
	private int id;
	private String nomeCategoria;
	Categoria categoriaMerce;
	ArrayList arrayCategorie;
	
	public Categoria(int id, Categoria categoriaMerce){
		this.id = id;
		this.categoriaMerce = categoriaMerce;
	}

	public void setCategoria(Categoria categoria)
	{
	this.categoriaMerce = categoria;
	}

	public Categoria getCategoria()
	{
	return categoriaMerce;
	}

	public void setId(int id){
	this.id=id;
	}

	public int getId(){
	return id;
	}
	public  void setNome(String nomeCategoria){
	this.nomeCategoria=nomeCategoria;
	}
	public String getNomeCategoria(){
	return nomeCategoria;
}
  
    public void CategoriaMerciologica(){
	

}

}

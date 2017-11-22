package gestionale;

public class SmartPhone extends ProdottoElettronico{
	
	private double id;
	private String display;
	private String cpu;
	private String ram;
	private double prezzo;
	
	public SmartPhone(double id, String marca, String modello, String display, String cpu, String ram, double prezzo){
		super (marca, modello);
		this.id=id;
		this.display=display;
		this.cpu=cpu;
		this.ram=ram;
		this.prezzo=prezzo;
	}

	public void setPrezzo(double prezzo)
	{
	this.prezzo = prezzo;
	}

	public double getPrezzo()
	{
	return prezzo;
	}

	public void setDisplay(String display)
	{
	this.display = display;
	}

	public String getDisplay()
	{
	return display;
	}

	public void setCpu(String cpu)
	{
	this.cpu = cpu;
	}

	public String getCpu()
	{
	return cpu;
	}

	public void setRam(String ram)
	{
	this.ram = ram;
	}

	public String getRam()
	{
	return ram;
	}
	@Override
	public String toString(){
		return "Smartphone\n"
		+"Marca: "+getMarca()
		+"\nModello: "+getModello()
		+"\nDisplay: "+getDisplay()
		+"\nCpu: "+getCpu()
		+"\nRam: "+getRam()
		+"\nPrezzo: "+getPrezzo()+" €";
}

}

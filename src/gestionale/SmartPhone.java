package gestionale;

public class SmartPhone extends ProdottoElettronico{
	
	private String display;
	private String cpu;
	private String ram;

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
		return "Smarphone\n"+ "Marca: "+getMarca()
		+"\nModello: "+getModello()
		+"\nDisplay: "+getDisplay()
		+"\nCpu: "+getCpu()
		+"\nRam: "+getRam();
}

}

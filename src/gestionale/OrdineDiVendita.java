package gestionale;

import java.util.Date;
import java.util.List;

public class OrdineDiVendita {
	
	private long id;
	private Cliente cliente;
	private Date dataOrdine;
	private String statoOrdine;
	private List <RigaOrdine> righeOrdine;
	
	//variabili costanti public static final
	
    public static final String STATO_IN_ATTESA = "Stato in attessa";
	public static final String STATO_SPEDITO = "Stato Spedito";
	public static final String STATO_CONSEGNATO = "Stato Consegnato";

	
	public void setRigheOrdine(List<RigaOrdine> righeOrdine)
	{
	this.righeOrdine = righeOrdine;
	}

	public List<RigaOrdine> getRigheOrdine()
	{
	return righeOrdine;
	}
	

	public void setId(long id){
	this.id=id;
	}
	public long getId(){
	return id;
	}
	public void setCliente(Cliente cliente){
	this.cliente=cliente;
	}
	public Cliente getCliente(){
	return cliente;
	}
	public void setDataOrdine(Date dataOrdine){
	this.dataOrdine=dataOrdine;
	}
	public void setStatoOrdine(String statoOrdine){
	this.statoOrdine=statoOrdine;
	}
	public String getStatoOrdine(){
	return statoOrdine;
}

}

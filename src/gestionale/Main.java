package gestionale;
import java.util.*;

public class Main {

	public static void main(String[] args) {	
	
	int categoria;
	
	SmartPhone sm1 = new SmartPhone();
    sm1.setMarca("Honor");
	sm1.setModello("Honor 7");
	sm1.setDisplay("Amoled");
	sm1.setCpu("MTK830");
	sm1.setRam("3 Gb");
	sm1.toString();
	
	SmartPhone sm2=new SmartPhone();
	sm2.setMarca("Iphone");
	sm2.setModello("Iphone8");
	sm2.setDisplay("Retina");
	sm2.setCpu("Cortex");
	sm2.setRam("3 Gb");
	sm2.toString();
			    
	Libro lb1 = new Libro();
	lb1.setAutore("Isabel Allende");
	lb1.setTitolo("El amor en los tiempos del colera");
	lb1.setGenero("Drama");
	lb1.setNumeroPagina("458");
	lb1.toString();
	
	Televisore tv1 = new Televisore();
	tv1.setMarca("Tochiva");
	tv1.setModello("Rezgna");
	tv1.setPrezzo(1000);
	tv1.toString();

    System.out.println("Benvenuto nel nostro Negozio\n");
	System.out.println("Seleziona tra queste categorie:\n");
				
	//Imput da Tastiera
	Scanner sc = new Scanner(System.in);
    System.out.println("Seleziona il numero correspondente:\n\nLibro      [1]\nSmartphone [2]\nTelevisore [3]\n");
    categoria= sc.nextInt();

	switch(categoria){

	case 1:if(categoria==1) System.out.println(lb1);
	       break;
	case 2:if(categoria==2) System.out.println(sm1);
	       break;
	case 3:if(categoria==3) System.out.println(tv1);
	       break;
	}
				
    OrdineDiVendita odv = new OrdineDiVendita();
	odv.setCliente(new Cliente());
	odv.setDataOrdine(new Date());
	odv.setStatoOrdine(OrdineDiVendita.STATO_SPEDITO);
	odv.setRigheOrdine(new ArrayList<RigaOrdine>());
				
	//inizio a popolare tutti i campi
	odv.getCliente().setNome("Roberto");
	odv.getCliente().setCognome("Sturaro");
	odv.getCliente().setCodiceFiscale("CPJGS77b879b");
				
	RigaOrdine rigaOrd1 = new RigaOrdine(1,sm1,1,sm1.getPrezzo());
    RigaOrdine rigaOrd2 = new RigaOrdine(1,tv1,1, tv1.getPrezzo());
				
	odv.getRigheOrdine().add(rigaOrd1);
	odv.getRigheOrdine().add(rigaOrd2);
				
	}

}



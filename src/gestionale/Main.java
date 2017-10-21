package gestionale;
import java.util.*;

public class Main {

	public static void main(String[] args) {	
	
	int categoria;
	
    SmartPhone sm1 = new SmartPhone("Honor", "Honor 7", "Amoled","MTK830","3gb", 456.3);
    SmartPhone sm2 = new SmartPhone("Iphone","Iphone8","Retina","Cortex","3gb",708.3);
    SmartPhone sm3 = new SmartPhone("HTC", "U11", "Super Amoled", "Snagdragon", "4gb", 715.3 );
    SmartPhone sm4 = new SmartPhone("Huawei", "P10", "Super Amoled", "Snagdragon", "3gb", 576.7);
	SmartPhone sm5 = new SmartPhone("Sony","Xperia", "Super Amoled", "Snagdragon", "4gb", 620);
	SmartPhone sm6 = new SmartPhone("Samsung", "Note 8","Super Amoled", "Snagdragon", "6gb",987.2);
	
			    
    Libro lb1 = new Libro();
	lb1.setAutore("Isabel Allende");
	lb1.setTitolo("El amor en los tiempos del colera");
	lb1.setGenero("Drama");
	lb1.setNumeroPagina("458");
	lb1.setPrezzo(46.60);
	lb1.toString();
    
	Televisore tv1 = new Televisore("Tochiva", "Rezgna", 455.8);
	Televisore tv2 = new Televisore("Panasonic", "Station", 448.5);
    
	System.out.println("Benvenuto nel nostro Negozio\n");
	System.out.println("Seleziona tra queste categorie:\n");
				
	//Imput da Tastiera
	Scanner sc = new Scanner(System.in);
    System.out.println("Seleziona il numero correspondente:\n\nLibro      [1]\nSmartphone [2]\nTelevisore [3]\n");
    categoria= sc.nextInt();

	switch(categoria){

	case 1:if(categoria==1) System.out.println(lb1);
	       break;
	case 2:ArrayList <SmartPhone>smartPhone= new ArrayList<SmartPhone>();
	smartPhone.add(sm1);
	smartPhone.add(sm2);
	smartPhone.add(sm3);
	smartPhone.add(sm4);
	smartPhone.add(sm5);
	smartPhone.add(sm6);
	
	for(int i=0;i<smartPhone.size();i++){
		System.out.println(smartPhone.get(i)+"\n");
		}
		break;
		
	case 3: ArrayList <Televisore> tv = ArrayList <Televisore>;
		tv.add(tv1);
		tv.add(tv2);
		
		for(Televisore t : tv){
			
			System.out.println(t);
			
		}
		//if(categoria==3) System.out.println(tv1);
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



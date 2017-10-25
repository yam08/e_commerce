package gestionale;
import java.util.*;

public class Main {

	public static void main(String[] args) {	
	
	int categoria;
	Libro libros;
	
    SmartPhone sm1 = new SmartPhone("Honor", "Honor 7", "Amoled","MTK830","3gb", 456.3);
    SmartPhone sm2 = new SmartPhone("Iphone","Iphone8","Retina","Cortex","3gb",708.3);
    SmartPhone sm3 = new SmartPhone("HTC", "U11", "Super Amoled", "Snagdragon", "4gb", 715.3 );
    SmartPhone sm4 = new SmartPhone("Huawei", "P10", "Super Amoled", "Snagdragon", "3gb", 576.7);
	SmartPhone sm5 = new SmartPhone("Sony","Xperia", "Super Amoled", "Snagdragon", "4gb", 620);
	SmartPhone sm6 = new SmartPhone("Samsung", "Note 8","Super Amoled", "Snagdragon", "6gb",987.2);
	
	Libro lb1 = new Libro("Isabel Allende", "Paula", "Drama", "458", 46.6);
	Libro lb2 = new Libro("Edoardo", "Metafore", "Scienze Umane", "260", 26.6);
	Libro lb3 = new Libro("M.D. O'Brien", "Il nemici", "Drama", "567", 44.8);
	Libro lb4 = new Libro("Claudio De Sio Cesari", "Java 8", "Scienze Informatiche", "690", 45.6);
	Libro lb5 = new Libro("Cyndi Dale", "Corpo Sottile", "Scienze Umane", "390", 32.8);
	Libro lb6 = new Libro("Gabriel Garcia Marquez", "El amor en los tiempos del colera", "Drama", "458", 46.6);
	
    
	Televisore tv1 = new Televisore("Tochiva", "Rezgna", 455.8);
	Televisore tv2 = new Televisore("Panasonic", "Station", 448.5);
	Televisore tv3 = new Televisore("Sony", "Star", 600.9);
	Televisore tv4 = new Televisore("Samsung", "Flixwear", 900.45);
	Televisore tv5 = new Televisore("Loewe", "Precise", 1230.98);
	Televisore tv6 = new Televisore("Samsung", "Master Star",  608.5);
	
    
	System.out.println("Benvenuto nel nostro Negozio\n");
	System.out.println("Seleziona tra queste categorie:\n");
				
	/*
	Imput da Tastiera
	*/
	Scanner sc = new Scanner(System.in);
    System.out.println("Seleziona il numero correspondente:\n\nLibro      [1]\nSmartphone [2]\nTelevisore [3]\n");
    categoria= sc.nextInt();
	
	/*
	Iterazione di ogni articolo con ArrayList
	*/
	ArrayList <Libro> lb = new ArrayList <Libro>();
	lb.add(lb1);
	lb.add(lb2);
	lb.add(lb3);
	lb.add(lb4);
	lb.add(lb5);
	lb.add(lb6);
	
	ArrayList <SmartPhone>smartPhone= new ArrayList<SmartPhone>();
	smartPhone.add(sm1);
	smartPhone.add(sm2);
	smartPhone.add(sm3);
	smartPhone.add(sm4);
	smartPhone.add(sm5);
	smartPhone.add(sm6);
	
	ArrayList <Televisore> tv = new ArrayList <Televisore>();
	tv.add(tv1);
	tv.add(tv2);
	tv.add(tv3);
	tv.add(tv4);
	tv.add(tv5);
	tv.add(tv6);
 
	/*
	Selezione delle categorie tramite switch
	*/
    switch(categoria){

	case 1: 
	Iterator<Libro> iterator = lb.iterator();
	while(iterator.hasNext()){
		libros = iterator.next();
		System.out.println(libros);
		}
		break;
	      
	case 2: 
	for(int i=0;i<smartPhone.size();i++){
		System.out.println(smartPhone.get(i)+"\n");
		}
	break;
		
	case 3: 
	for(Televisore t : tv){
	   System.out.println(t);
	  }
	  break;
	}
	 
	System.out.println("\nVuole rivedere le altre categorie?");
	System.out.println("Seleziona il numero correspondente:\n\nLibro      [1]\nSmartphone [2]\nTelevisore [3]\n");
	
	/*
	Selezione delle categorie se ce un ripenzamento
	*/
	categoria=sc.nextInt();
	
	switch(categoria){

	case 1: 
	Iterator<Libro> iterator = lb.iterator();
	while(iterator.hasNext()){
	libros = iterator.next();
	System.out.println(libros);
	}
	break;
	
	case 2: 
	for(int i=0;i<smartPhone.size();i++){
	System.out.println(smartPhone.get(i)+"\n");
	}
	break;
	
	case 3: 
	
	for(Televisore t : tv){
	System.out.println(t);
	}
	break;
	}
	
	System.out.println("Selezione l'articolo desiderato");
	
	categoria=sc.nextInt();

	switch(categoria){

	case 1: 
	Iterator<Libro> iterator = lb.iterator();
	while(iterator.hasNext()){
	libros = iterator.next();
	System.out.println(libros);
	}
	break;

	case 2: 
	for(int i=0;i<smartPhone.size();i++){
	System.out.println(smartPhone.get(i)+"\n");
	}
	break;

	case 3: 

	for(Televisore t : tv){
	System.out.println(t);
	}
	break;
	}
	
	System.out.println("Selezione l'articolo desiderato");

	
	
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



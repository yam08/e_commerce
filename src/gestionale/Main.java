package gestionale;
import java.util.*;

public class Main {

	public static void main(String[] args) {	
		
		SmartPhone sm1 = new SmartPhone();
		
		  		int categoriaLibro;
		  		int categoriaSmartPhone;
		  		int televisore;		  		
		  		String cognome;
		  		
		  		
				
			    System.out.println("Benvenuto nel nostro Negozio\n");
				System.out.println("Seleziona tra queste categorie:\n");
				
				
				

			  //Imput da Tastiera
			    Scanner sc = new Scanner(System.in);
			    
			    System.out.println("Seleziona il numero correspondente:\n\nLibro      [1]\nSmartphone [2]\nTelevisore [3]\n");
			    
			    categoriaLibro = sc.nextInt();
			    categoriaSmartPhone = sc.nextInt();
			    televisore = sc.nextInt();			    
			    cognome= sc.nextLine();
				
	            if(categoriaSmartPhone==2) System.out.println("SmartPhone");
				
				
				OrdineDiVendita odv = new OrdineDiVendita();
				odv.setCliente(new Cliente());
				odv.setDataOrdine(new Date());
				odv.setStatoOrdine(OrdineDiVendita.STATO_SPEDITO);
				odv.setRigheOrdine(new ArrayList<RigaOrdine>());
				
				//inizio a popolare tutti i campi
				
				odv.getCliente().setNome("Roberto");
				odv.getCliente().setCognome("Sturaro");
				odv.getCliente().setCodiceFiscale("CPJGS77b879b");
				
			    
				sm1.setMarca("Honor");
				sm1.setModello("Honor 7");
				sm1.setDisplay("Amoled");
				sm1.setCpu("MTK830");
				sm1.setRam("3 Gb");
				sm1.toString();
				System.out.println(sm1);
				
				Televisore tv1 = new Televisore();
				tv1.setMarca("Tochiva");
				tv1.setModello("Rezgna");
				tv1.setPrezzo(1000);
				tv1.toString();
				System.out.println(tv1);
				
			    RigaOrdine rigaOrd1 = new RigaOrdine(1,sm1,1,sm1.getPrezzo());
				RigaOrdine rigaOrd2 = new RigaOrdine(1,tv1,1, tv1.getPrezzo());
				
				odv.getRigheOrdine().add(rigaOrd1);
				odv.getRigheOrdine().add(rigaOrd2);
				
		}

	}



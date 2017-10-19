package gestionale.Test_Code;
import java.util.Scanner;

public class Tester
{
	public static void main(String [] args){
		
	int categoria;
	//int categoriaSmartPhone;
	//int categoriatelevisore;	
	
	System.out.println("Benvenuto nel nostro Negozio\n");
	System.out.println("Seleziona tra queste categorie:\n");

	//Imput da Tastiera
	Scanner sc = new Scanner(System.in);
    System.out.println("Seleziona il numero correspondente:\n\nLibro      [1]\nSmartphone [2]\nTelevisore [3]\n");
    categoria= sc.nextInt();
	
	switch(categoria){
		
		case 1:if(categoria==1) System.out.println("Libro");
		break;
		case 2:if(categoria==2) System.out.println("Smartphone");
		break;
		case 3:if(categoria==3) System.out.println("Televisore");
		break;
	}
	}

}

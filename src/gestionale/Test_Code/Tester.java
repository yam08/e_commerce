package gestionale.Test_Code;
import java.util.Scanner;

public class Tester
{
	public static void main(String [] args){
		
	int categoriaLibro;
	int categoriaSmartPhone=0;
	int categoriatelevisore;	
	
	System.out.println("Benvenuto nel nostro Negozio\n");
	System.out.println("Seleziona tra queste categorie:\n");

	//Imput da Tastiera
	Scanner sc = new Scanner(System.in);

	System.out.println("Seleziona il numero correspondente:\n\nLibro      [1]\nSmartphone [2]\nTelevisore [3]\n");

	categoriaLibro = sc.nextInt();
	categoriaSmartPhone = sc.nextInt();
	categoriatelevisore = sc.nextInt();
		
	}

	
	
}

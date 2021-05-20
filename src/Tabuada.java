import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner leitor = new Scanner (System.in);
	
	int numero;
	int resultado;
	
	System.out.println("Por favor, digite qual  é a tabuada que você quer");
	numero = leitor.nextInt();
	
	for(int i = 1; i <=10 ; i++) {
		resultado = i * numero;
		System.out.println(numero + " x" + " = " + resultado);
		
	}
	
	leitor.close();
		
	}

}

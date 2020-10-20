import java.util.Scanner;		//IMPORTA SCANNER
public class NumPrimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int i=2;		//I = 2
		System.out.print("Introduzca un número:");
		int n = teclado.nextInt();		//ALMACENA NÚMERO EN N
		
		while (i<=n/2 && n%1!=0) {		//MIENTRAS LA I SEA MENOR O IGUAL A LA MITAD DE N
			i++;		//SUMAR UNO A LA I
		}
		
		if (i<=n/2) {		//SI LA I LLEGÓ AL FINAL DE LA SECUENCIA (LA MITAD DE N)
			System.out.print("El número es primo.");		//ES PRIMO
			
		} else {		//SI NO, UN NÚMERO MENOR A LA MITAD DE N ES MÚTLIPLO DE N
			System.out.print("El número no es primo.");		//NO ES PRIMO
		}
	}
}

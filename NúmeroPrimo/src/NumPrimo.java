import java.util.Scanner;		//IMPORTA SCANNER
public class NumPrimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int i=2;		//I = 2
		System.out.print("Introduzca un n�mero:");
		int n = teclado.nextInt();		//ALMACENA N�MERO EN N
		
		while (i<=n/2 && n%1!=0) {		//MIENTRAS LA I SEA MENOR O IGUAL A LA MITAD DE N
			i++;		//SUMAR UNO A LA I
		}
		
		if (i<=n/2) {		//SI LA I LLEG� AL FINAL DE LA SECUENCIA (LA MITAD DE N)
			System.out.print("El n�mero es primo.");		//ES PRIMO
			
		} else {		//SI NO, UN N�MERO MENOR A LA MITAD DE N ES M�TLIPLO DE N
			System.out.print("El n�mero no es primo.");		//NO ES PRIMO
		}
	}
}

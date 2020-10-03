//---------------------------------------------FORMA NO OPTIMIZADA DEL PROGRAMA---------------------------------------------------

import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class CondicionS9T1_NO_OPTIMIZADA {

	public static void main (String [] args) {

		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER

		System.out.print("Introduzca un n�mero: ");		//SOLICITAR N�MERO
		double n�mero = teclado.nextDouble();		//ALMACENAR N�MERO EN n�mero

		if (n�mero > 0 && n�mero < 50) {		//CONDICI�N: SI n�mero > 0 Y n�mero < 50
			double triple = 3*n�mero;		//TRIPLE DE n�mero ALMACENADO EN triple
			System.out.printf("El triple del n�mero introducido es %.2f.", triple);		//MOSTRAR triple
		} else { if (n�mero > 50) {			//CONDICI�N: SI n�mero > 50
			double doble = 2*n�mero;		//DOBLE DE n�mero ALMACENADO EN doble
			System.out.printf("El doble del n�mero introducido es %.2f.",doble);		//MOSTRAR doble
		} else {		//SI TODAS LAS CONDICIONES SE INCUMPLEN ==> n�mero < 0
			double valor = Math.abs(n�mero);		//VALOR ABSOLUTO EN valor
			System.out.printf("El valor absoluto del n�mero introducido es %.2f.",valor); 		//MOSTRAR valor
		}
		}
	}
}
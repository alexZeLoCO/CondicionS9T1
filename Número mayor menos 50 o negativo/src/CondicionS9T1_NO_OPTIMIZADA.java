//---------------------------------------------FORMA NO OPTIMIZADA DEL PROGRAMA---------------------------------------------------

import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class CondicionS9T1_NO_OPTIMIZADA {

	public static void main (String [] args) {

		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER

		System.out.print("Introduzca un número: ");		//SOLICITAR NÚMERO
		double número = teclado.nextDouble();		//ALMACENAR NÚMERO EN número

		if (número > 0 && número < 50) {		//CONDICIÓN: SI número > 0 Y número < 50
			double triple = 3*número;		//TRIPLE DE número ALMACENADO EN triple
			System.out.printf("El triple del número introducido es %.2f.", triple);		//MOSTRAR triple
		} else { if (número > 50) {			//CONDICIÓN: SI número > 50
			double doble = 2*número;		//DOBLE DE número ALMACENADO EN doble
			System.out.printf("El doble del número introducido es %.2f.",doble);		//MOSTRAR doble
		} else {		//SI TODAS LAS CONDICIONES SE INCUMPLEN ==> número < 0
			double valor = Math.abs(número);		//VALOR ABSOLUTO EN valor
			System.out.printf("El valor absoluto del número introducido es %.2f.",valor); 		//MOSTRAR valor
		}
		}
	}
}
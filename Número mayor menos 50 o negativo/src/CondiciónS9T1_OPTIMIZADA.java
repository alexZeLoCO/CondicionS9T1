//----------------------------------------FORMA OPTIMIZADA DEL PROGRAMA------------------------------------------------

import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class CondiciónS9T1_OPTIMIZADA {

	public static void main (String [] args) {

		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER

		System.out.print("Introduzca un número: ");		//SOLICITAR NÚMERO
		double número = teclado.nextDouble();		//ALMACENAR NÚMERO EN número

		/*
		 * DE ESTA FORMA, EN LUGAR DE COLOCAR LAS ÓRDENES CONDICIONALES EN EL ORDEN DEL ENUNCIADO, LO HAREMOS DE MAYOR A MENOR. ASÍ, NO TENEMOS QUE UTILIZAR NINGÚN && (Y)
		 */
		if (número >50) {
			double doble = 2*número;		//DOBLE DE número ALMACENADO EN doble										//MAYORES DE 50
			System.out.printf("El doble del número introducido es %.2f.",doble);		//MOSTRAR doble
		} else { if (número > 0) {
			double triple = 3*número;		//TRIPLE DE número ALMACENADO EN triple										//MAYORES DE 0
			System.out.printf("El triple del número introducido es %.2f.", triple);		//MOSTRAR triple
		} else {
			double valor = Math.abs(número);		//VALOR ABSOLUTO EN valor											//MENORES DE 0 (LOS DEMÁS)
			System.out.printf("El valor absoluto del número introducido es %.2f.",valor); 		//MOSTRAR valor
		}
		}
	}
}
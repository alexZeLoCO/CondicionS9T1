//----------------------------------------FORMA OPTIMIZADA DEL PROGRAMA------------------------------------------------

import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class Condici�nS9T1_OPTIMIZADA {

	public static void main (String [] args) {

		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER

		System.out.print("Introduzca un n�mero: ");		//SOLICITAR N�MERO
		double n�mero = teclado.nextDouble();		//ALMACENAR N�MERO EN n�mero

		/*
		 * DE ESTA FORMA, EN LUGAR DE COLOCAR LAS �RDENES CONDICIONALES EN EL ORDEN DEL ENUNCIADO, LO HAREMOS DE MAYOR A MENOR. AS�, NO TENEMOS QUE UTILIZAR NING�N && (Y)
		 */
		if (n�mero >50) {
			double doble = 2*n�mero;		//DOBLE DE n�mero ALMACENADO EN doble										//MAYORES DE 50
			System.out.printf("El doble del n�mero introducido es %.2f.",doble);		//MOSTRAR doble
		} else { if (n�mero > 0) {
			double triple = 3*n�mero;		//TRIPLE DE n�mero ALMACENADO EN triple										//MAYORES DE 0
			System.out.printf("El triple del n�mero introducido es %.2f.", triple);		//MOSTRAR triple
		} else {
			double valor = Math.abs(n�mero);		//VALOR ABSOLUTO EN valor											//MENORES DE 0 (LOS DEM�S)
			System.out.printf("El valor absoluto del n�mero introducido es %.2f.",valor); 		//MOSTRAR valor
		}
		}
	}
}
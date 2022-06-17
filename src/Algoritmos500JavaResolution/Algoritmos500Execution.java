package Algoritmos500JavaResolution;

import java.util.Scanner;

public class Algoritmos500Execution {

	/* Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10%
	para o garçom. Fazer um algoritmo que leia o valor gasto com despesas realizadas
	em um restaurante e imprima o valor total com a gorjeta.*/

	static Scanner scanner = new Scanner(System.in);
	public static float valorGlobal;
	public static float gorjetaGlobal; ///
	
	public static double calculaGastosComGorjetaAlgoritmo70(float valor, float gorjeta) {		
		valor = valorGlobal;
		gorjeta = gorjetaGlobal;		
		System.out.println("Digite o valor da conta: ");
		valor = scanner.nextFloat();		
		System.out.println("Digite o valor da gorjeta: ");
		gorjeta = scanner.nextFloat();			
		double result = valor * gorjeta;		
		return result;	
	}
	
	public static void main(String[] args) {		
		System.out.println(calculaGastosComGorjetaAlgoritmo70(valorGlobal, gorjetaGlobal));
	}

}

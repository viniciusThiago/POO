package program;

import java.util.Scanner;

public class ListaMath {

	public static void main(String[] args) {
		
		/*		EXERCÍCIO NUMERO 1
		 * 
		 * 		Desenvolva um programa em java que calcule a fun¸c˜ao 1. Onde x = 15.5:
		 * 
		 * */
		
		Double x = 15.5;
		double operacaoSoma = Math.cbrt(x) + Math.log(x);
		double operacaoParaSubt = Math.min(Math.tan(x), Math.tanh(x));
		
		System.out.println(operacaoSoma - operacaoParaSubt);
		
		/*		EXERCÍCIO NUMERO 7
		 * 
		 * */

		Scanner scanner = new Scanner (System.in);

		System.out.println("Digite o valor de x (deve ser entre -15 e -5): ");
		double x1 = scanner.nextDouble();

		System.out.println("Digite o valor de y (-3 e 3): ");
		double  y = scanner.nextDouble();

		double result_final = 100 * Math.sqrt(Math.abs(y - 0.01*Math.pow(x1,2)) + 0.01*Math.abs(x1+10));

		System.out.println(result_final);
		
		
	}

}

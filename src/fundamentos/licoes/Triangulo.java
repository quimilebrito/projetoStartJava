package fundamentos.licoes;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		System.out.print("Informe o valor da base do tri�ngulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Informe o valor da altura do tri�ngulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base *altura) / 2;
		
		System.out.printf("A �rea do tri�ngulo � igual a %.2f m�.", area);
		
		entrada.close();
		
	}
	
	
	
	
	
	
	
}

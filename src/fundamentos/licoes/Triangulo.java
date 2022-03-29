package fundamentos.licoes;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
	
		System.out.print("Informe o valor da base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Informe o valor da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base *altura) / 2;
		
		System.out.printf("A área do triângulo é igual a %.2f m².", area);
		
		entrada.close();
		
	}
	
	
	
	
	
	
	
}

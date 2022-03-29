package fundamentos.licoes;

import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Equação de segundo grau: ax² + bx + c = 0");
		
		System.out.print("Digite o valor de a: ");
		double a = entrada.nextDouble();
		
		System.out.print("Digite o valor de b: ");
		double b = entrada.nextDouble();
		
		System.out.print("Digite o valor de c: ");
		double c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("Delta é igual a " + delta);
		
		double x1 = (- b + Math.sqrt(delta)) / 2 * a;
		double x2 = (- b - Math.sqrt(delta)) / 2 * a;
		
		System.out.printf("A resposta da equação é [%.2f, %.2f]", x1, x2);
		
		entrada.close();		
		
	}
	
	
	
}

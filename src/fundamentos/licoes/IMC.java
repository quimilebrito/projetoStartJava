package fundamentos.licoes;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Digite sua altura: ");
		double altura = entrada.nextDouble();
	
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu IMC corresponde a %.2f", imc);
		
		
		entrada.close();
		
		
	
		
	}
	
	
	
	
	
	
	
}

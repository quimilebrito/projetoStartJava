package fundamentos.licoes;

import java.util.Scanner;

public class ConversaoTemperatura2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		final double ajuste = 32;
		final double fator = 1.8;
		
		double conversao = (celsius + ajuste) / fator;
		
		System.out.println("A temperatura em Fahrenheit é: " + conversao + "°F");
		
		entrada.close();
			
		
	}

}

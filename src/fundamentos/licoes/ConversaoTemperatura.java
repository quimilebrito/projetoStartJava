package fundamentos.licoes;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
		
		System.out.printf("A temperatura convertida é %f °C", conversao);
		
		
		entrada.close();
		
	}
	
	
	
	
	
	
	
	
}

package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Sal�rio 1: ");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Sal�rio 2: ");
		String sal2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Sal�rio 3: ");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		double val1 = Double.parseDouble(sal1);
		double val2 = Double.parseDouble(sal2);
		double val3 = Double.parseDouble(sal3);
		
		double soma = val1 + val2 + val3;
		
		System.out.println("Soma dos sal�rios �: " + soma);
		System.out.println("M�dia dos sal�rios �: " + soma/3);
	
	entrada.close();
	}
	
	
	
	
	
}

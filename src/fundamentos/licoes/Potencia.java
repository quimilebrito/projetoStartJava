package fundamentos.licoes;

import java.util.Scanner;

public class Potencia {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		double num1 = teclado.nextDouble();
		
		double quadrado = Math.pow(num1, 2);
		System.out.println("Ese n�mero elevado ao quadrado � igual a " + quadrado);
		
		double cubo = Math.pow(num1, 3);
		System.out.println("Ese n�mero elevado ao cubo � igual a " + cubo);		
		
		teclado.close();
		
		
	}

}

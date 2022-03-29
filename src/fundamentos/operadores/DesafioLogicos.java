package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		
		//Trabalho terca (V OU F)
		//Trabalho quinta (V OU F)
		//se os dois trabalhos derem certo - comprar tv de 50" - tomar sorvete
		//se um dos trabalhos derem certo  - comprar uma tv de 32" - TOMAR SORVETE
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comproutv50 = trabalho1 && trabalho2;
		System.out.println("Comprou TV de 50\"? " + comproutv50);
		
		boolean comproutv32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV de 32\"? " + comproutv32);
		
		boolean sorvete = comproutv50 || comproutv32;
		System.out.println("Vai tomar sorvete? " + sorvete);
		System.out.println("Mais saudável? " + !sorvete);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}

package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		int a = 6*(3 + 2);
		int b = (int) Math.pow(a, 2);
		int c = 3 * 2;
		int d = b / c;
				
		int e = (1 - 5) * (2 - 7);
		int f = (int) Math.pow(e, 2);
		int g = (int) Math.pow(2, 2);
		int h = f / g;
				
		int i = (int) Math.pow((d - h), 3);
		int j = (int) Math.pow(10, 3);
		int k = i / j;
		
		System.out.println("O resultado é: " + k);
		
		// CTRL + SHIFT + F6  para mudar a class apresentada
		// CTRL + SHIFT + F8  Para mudar entre as perspectivas já abertas
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

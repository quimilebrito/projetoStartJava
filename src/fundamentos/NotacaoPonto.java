package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Qu�mile".toUpperCase();
		System.out.println(x);
		
		String y = "Prazer em te conhecer"
				.replace("conhecer", "ver")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos n�o recebem o operador "."

		
	}
	
}

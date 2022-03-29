package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 3.6;
		String resultadoParcial = media >= 5.0 ? "reprovado." : "em recuperação.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double notFin = 8.0;
		String resultFin = notFin >=7.0 ? "aprovado." : "reprovado.";
		System.out.println("O aluno está " + resultFin);
		
		double nota = 9.0;
		boolean bomComport = false;
		boolean mediaAprov = nota >= 7;
		
		boolean temDesconto = mediaAprov && bomComport;
		String result = temDesconto ? "Sim." : "Não.";
		
//		System.out.printf("Tem desconto? %s", result);
		System.out.println("\nTem desconto? " + result);
		
		
		
	}
	
	
	
}

package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56387;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
				
		//Tipo booleano
		boolean estadoDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de Viagens
		System.out.println(numeroDeVoos / 2);
				
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Salário
		System.out.println(id + ": ganha -> " + salario);		
		
		//Estado de férias
		System.out.println("Férias? " + estadoDeFerias);
		
		//Status
		System.out.println("Status = " + status);
		
}	
	
	
	
	
}

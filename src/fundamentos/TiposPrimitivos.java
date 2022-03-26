package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56387;
		long pontosAcumulados = 3_134_845_223L;
		
		//Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
				
		//Tipo booleano
		boolean estadoDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de Viagens
		System.out.println(numeroDeVoos / 2);
				
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Sal�rio
		System.out.println(id + ": ganha -> " + salario);		
		
		//Estado de f�rias
		System.out.println("F�rias? " + estadoDeFerias);
		
		//Status
		System.out.println("Status = " + status);
		
}	
	
	
	
	
}

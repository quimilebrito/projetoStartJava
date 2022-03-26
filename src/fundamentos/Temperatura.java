package fundamentos;

public class Temperatura {

	
	public static void main(String[] args) {
		double TempFahrenheit = 86;
		final double AJUSTE = 32;
		final double FATOR = 5.0/9;
		double TempCelsius = (TempFahrenheit - AJUSTE) * FATOR;
		
		System.out.println("Temperatura em Celsius = " + TempCelsius + "ºC");
		
		TempFahrenheit = 150;
		TempCelsius = (TempFahrenheit - AJUSTE) * FATOR;
		System.out.println ("Temperatura em Celsius = " + TempCelsius + "ºC");
		
		
	}
}

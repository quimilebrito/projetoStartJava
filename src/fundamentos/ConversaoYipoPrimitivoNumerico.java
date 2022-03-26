package fundamentos;

public class ConversaoYipoPrimitivoNumerico {

	
	public static void main(String[] args) {
		
		double a = 1;       //conversão implicita
		System.out.println(a);
		
		float b = (float)1.123456789;
		System.out.println(b);
		
		int c = 240;
		byte d = (byte) c;   //conversão explícita
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
	}
}

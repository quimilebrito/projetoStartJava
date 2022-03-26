package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
	
		Byte b = 100;       //byte
		Short s = 1000;     //short
		Integer i = 10000;  //int
		Long l = 10000L;    //long
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l / 3);
		
		Float f = 123.10F;    //float
		Double d = 1234.5678; //double
		
		System.out.println(f);
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); //boolean
		Character c = '#';   //char
		System.out.println(bo);
		System.out.println(c);
		
		
	}
	
}

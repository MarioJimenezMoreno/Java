package ejercicios;

public class Ej24b_Conversiones {

	public static void main(String[] args) {
		
		byte byteVar = 1;
		System.out.println(byteVar);
		short shortVar = (short) byteVar;
		System.out.println(shortVar);
		int intVar = (int) shortVar;
		System.out.println(intVar);
		long longVar = (long) intVar;
		System.out.println(longVar);
		float floatVar = (float) longVar;
		System.out.println(floatVar);		
		double doubleVar = (double) floatVar;
		System.out.println(doubleVar);
		
	}

}

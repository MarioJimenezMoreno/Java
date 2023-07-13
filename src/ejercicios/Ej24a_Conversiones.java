package ejercicios;

public class Ej24a_Conversiones {

	public static void main(String[] args) {
		double doubleVar = 1;
		System.out.println(doubleVar);
		float floatVar = (float) doubleVar;
		System.out.println(floatVar);
		long longVar = (long) floatVar;
		System.out.println(longVar);
		int intVar = (int) longVar;
		System.out.println(intVar);
		short shortVar = (short) intVar;
		System.out.println(shortVar);
		byte byteVar = (byte) shortVar;
		System.out.println(byteVar);

	}

}

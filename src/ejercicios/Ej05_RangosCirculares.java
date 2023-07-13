package ejercicios;

public class Ej05_RangosCirculares {

	public static void main(String[] args) {
		byte numByte = (byte) 132;
		System.out.println("Byte = " + numByte);
		short numShort = (short) 32792;
		System.out.println("Short = " + numShort);
		int numInt = 2147483647;
		int numIntDesbordado = numInt + 10000;
		System.out.println("Int = " + numIntDesbordado);
		long numLong = 9223372036854775807l;
		long numLongDesbordado = numLong + 20000;
		System.out.println("Long = " + numLongDesbordado);

	}

}

package ejercicios;

public class Ej07_Rangos {
	
	public static void main(String[] args) {
		
		int byteRange = (int) Math.pow(2, 7);
		System.out.println("-" + byteRange + " a " + byteRange);
		int shortRange = (int) Math.pow(2, 15);
		System.out.println("-" + shortRange + " a " + shortRange);
		int intRange = (int) Math.pow(2, 31);
		System.out.println("-" + intRange + " a " + intRange);
		long longRange = (long) (Math.pow(2, 63));
		System.out.println("-" + longRange + " a " + longRange);
	}

}

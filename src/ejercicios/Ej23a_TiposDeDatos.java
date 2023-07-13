package ejercicios;

public class Ej23a_TiposDeDatos {

	public static void main(String[] args) {
		Long longVar = 100L;
		byte byteVar = 1;
		short shortVar = 133;
		Integer integerVar = 1231;
		
		System.out.println(longVar.getClass());
		System.out.println(((Byte)byteVar).getClass());
		System.out.println(((Short)shortVar).getClass());
		System.out.println(integerVar.getClass());

	}

}

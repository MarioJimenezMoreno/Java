package ejercicios;

public class Ej23b_TiposDeDatos {

	public static void main(String[] args) {
		Long longVar = 12L;
		byte byteVar = 1;
		char charVar = 'a';
		String stringVar = "AB";
		
		identifyVar(longVar);
		identifyVar(byteVar);
		identifyVar(charVar);
		identifyVar(stringVar);
	}
	
	public static void identifyVar(Object variable) {
		
		System.out.println(variable.getClass().getName());
	}

}

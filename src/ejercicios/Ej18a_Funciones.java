package ejercicios;

public class Ej18a_Funciones {

	public static void main(String[] args) {
		
		String text1 = "javascript";
		String text2 = "java";
		
		javaOrNull(text1);
		javaOrNull(text2);
		
		}
	public static void javaOrNull(String text) {
		if(text.toLowerCase() == "java") {
			 System.out.println("java");
		}
		else {
			System.out.println("null");
		} 

	}

}

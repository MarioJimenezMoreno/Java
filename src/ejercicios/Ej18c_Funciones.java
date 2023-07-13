package ejercicios;

public class Ej18c_Funciones {

	public static void main(String[] args) {
		
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10);
		
		parImpar(num1);
		parImpar(num2);
		parImpar(num3);
	}
	
	public static void parImpar(int num) {
		if(num % 2 == 0) {
			 System.out.println(num + " es Par");
		}
		else {
			 System.out.println(num + " es Impar");
		} 
	}

}

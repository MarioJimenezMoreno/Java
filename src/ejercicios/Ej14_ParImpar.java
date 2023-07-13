package ejercicios;

public class Ej14_ParImpar {

	public static void main(String[] args) {
		
		int randomNum = (int) (Math.random() * 10);
		System.out.println(randomNum);
		String resultado = (randomNum % 2 == 0) ? "par" : "impar";
		System.out.println(resultado);
		
		//boolean randomBool;
	}

}

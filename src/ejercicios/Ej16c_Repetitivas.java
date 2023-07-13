package ejercicios;

public class Ej16c_Repetitivas {

	public static void main(String[] args) {
		
		int dowhileI = 3;
		int forI = 3;
		int whileI = 3;
		
		for (int x = 1; x < 2; x++) {
			
			System.out.println("SALUDOS FOR:");
			System.out.println("Hola");
			
			for (int j = 1; j < forI; j++) {
				System.out.println("Hola");
			}
		}
		
		int y = 1;
		
		while(y == 1)
			
			y++;
		System.out.println("SALUDOS WHILE:");
		System.out.println("Hola");
		
		while (whileI > 1) {			
			System.out.println("Hola");
			whileI--;
		}
		
		System.out.println("SALUDOS DOWHILE:");
		
		do {			
			  System.out.println("Hola");
			  dowhileI--;
			} while(dowhileI > 0);
		
	}
}

package ejercicios;

public class Ej15c_Condicionales {

	public static void main(String[] args) {
		
		int num = (int) (Math.random()*9 + 1);
		System.out.println("Numero: " + num);
		switch (num) {
			case 1: {
			
				System.out.println("Texto: Uno");
				break;
			}
			case 2: {
						
				System.out.println("Texto: Dos");
				break;
					}
			case 3: {
				
				System.out.println("Texto: Tres");
				break;
			}
			case 4: {
				
				System.out.println("Texto: Cuatro");
				break;
			}
			case 5: {
				
				System.out.println("Texto: Cinco");
				break;
			}
			case 6: {
				
				System.out.println("Texto: Seis");
				break;
			}
			case 7: {
				
				System.out.println("Texto: Siete");
				break;
			}
			case 8: {
				
				System.out.println("Texto: Ocho");
				break;
			}
			case 9: {
				
				System.out.println("Texto: Nueve");
				break;
			}
		}
	}
}
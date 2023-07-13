package ejercicios;

public class Ej17a_Salto {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			if (i == 3) {
				System.out.println("Iteracion for " + i + " interrumpida!");
				break;
			}
			System.out.println("Iteracion for: " + i +" de 6");
		}
		
		int j = 1;
		
		while(j < 6) {
			
			if (j == 3) {
				System.out.println("Iteracion while " + j + " interrumpida!");
				break;
			}
			System.out.println("Iteracion while: " + j +" de 6");
			j++;
		}

	}

}

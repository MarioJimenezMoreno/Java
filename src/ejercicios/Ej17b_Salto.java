package ejercicios;

public class Ej17b_Salto {

	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("Iteracion for: " + i +" de 6");
		}
		
		int j = 1;
		
		while(j < 7) {
			
			if (j == 5) {
				j++;
				continue;
			}
			System.out.println("Iteracion while: " + j +" de 6");
			j++;
		}


	}

}

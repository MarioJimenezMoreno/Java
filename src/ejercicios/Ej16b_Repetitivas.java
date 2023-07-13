package ejercicios;

public class Ej16b_Repetitivas {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7};
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0) {
				System.out.println("For: " + array[i]);
			}
		}
		
		int i = 0;
		
		while (i < array.length) {
			if(array[i] % 3 == 0) {
				System.out.println("While: " + array[i]);
			}			
			i++;
		}
		
		
	}

}

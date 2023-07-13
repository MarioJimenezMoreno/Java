package ejercicios;

import java.util.Scanner;

public class Ej37a_MásScanner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("Dame un texto: ");
			String text = sc.nextLine();
			System.out.println("Tu texto es: " + text);
			System.out.print("Dame un numero: ");
			int num = sc.nextInt();
			System.out.println("Tu numero es: " + num);
			System.out.print("Dame un valor booleano: ");
			boolean bool = sc.nextBoolean();
			System.out.println("Tu booleano es: " + bool);
		} 
		catch (Exception e) {
			System.out.println("ERROR, valor invalido");
		}	
		
	}
}

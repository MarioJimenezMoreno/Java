package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ej37c_MásScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 try {
	            sc.useLocale(Locale.US);
	            System.out.println("Introduce un numero real separado por '.': ");
	            double num = sc.nextDouble();
	            sc.nextLine();
	            System.out.println("El primer numero introducido es: " + num);
	        } catch (Exception e) {
	            System.out.println("Error al leer el primer numero.");
	        }
	        sc.nextLine();
	        try {
	            sc.useLocale(Locale.FRANCE);
	            System.out.println("Introduce un numero real separado por ',': ");
	            double num2 = sc.nextDouble();
	            sc.nextLine();
	            System.out.println("El segundo numero introducido es: " + num2);
	        } catch (Exception e) {
	            System.out.println("Error al leer el segundo numero.");
	        }	        
	        sc.close();	        
	}
}

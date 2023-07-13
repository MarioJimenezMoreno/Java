package ejercicios;

public class Ej28d_Recursividad {

	public static void main(String[] args) {
		Ej28d_Recursividad m = new Ej28d_Recursividad();
		
		String palabra = "supercalifragilisticospialidoso";
		System.out.println(palabra);
		m.girarPalabra(palabra);
    }

	public void girarPalabra(String palabra) {
	    if (palabra.length() <= 1) {
	        System.out.print(palabra);
	    } else {
	        girarPalabra(palabra.substring(1));
	        System.out.print(palabra.charAt(0));
	    }
	}

}

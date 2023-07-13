package ejercicios;

public class Ej16d_Repetitivas {

	public static void main(String[] args) {
		
		String abecedario = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
		StringBuilder nuevoAbecedario = new StringBuilder();
		
		for (int i = 0; i < 26; i++) {
			
			StringBuilder textoMostrado = new StringBuilder(abecedario.substring(i));
			nuevoAbecedario = nuevoAbecedario.insert(0, textoMostrado.charAt(0));
			System.out.println(textoMostrado);
			
			if( i == 25) {						
			for (int j = 0; j < 25; j++) {	
				
				nuevoAbecedario = new StringBuilder(nuevoAbecedario.substring(1));
				textoMostrado = textoMostrado.insert(textoMostrado.length(), nuevoAbecedario.charAt(0));
				System.out.println(textoMostrado);

			    }
			}			
		}		
	}
}

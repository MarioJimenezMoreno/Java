package ejercicios;

public class Ej15b_Condicionales {

	public static void main(String[] args) {
		
		int temperatura = (int) (Math.random()*30);
		System.out.println("Temperatura: " + temperatura +" Grados");
		
		if(temperatura < 10) {
			System.out.println("Categoria: Climas frios");
			if(temperatura < 5) {
				System.out.println("Tipo: Polar");
			}
			else {
				System.out.println("Tipo: Alta montana");
			}
		}
		if(temperatura >= 10 && temperatura < 20) {
			System.out.println("Categoria: Climas templados");
			if(temperatura < 13.5) {
				System.out.println("Tipo: Oceanico");
			}
			else if(temperatura < 16.5) {
				System.out.println("Tipo: Mediterraneo");
			}
			else {
				System.out.println("Tipo: Continental");
			}
		}
		if(temperatura >= 20) {
			System.out.println("Categoria: Climas calidos");
			if(temperatura < 23.5) {
				System.out.println("Tipo: Ecuatorial");
			}
			else if(temperatura < 26.5) {
				System.out.println("Tipo: Tropical");
			}
			else {
				System.out.println("Tipo: Desertico");
			}			
		}
	}
}

package ejercicios;

public class Ej28a_Recursividad {

	public static void main(String[] args) {
		Ej28a_Recursividad m = new Ej28a_Recursividad();
		int limit = 10;
		String[] tecnologies = {"Markdown","Regexp","HTML","CSS","Javascript", "SQL","Java"};
		m.recorrerString(tecnologies,limit);

	}
	
	public void recorrerString(String[] array,int limit) {		
		for (int i = 0; i < array.length; i++) {		
			System.out.println(array[i]);
		}
		if(limit > 0) {
		limit--;
		recorrerString(array,limit);
		}
	}
}

package ejercicios;

public class Ej28b_Recursividad {

	public static void main(String[] args) {
		Ej28b_Recursividad m = new Ej28b_Recursividad();
		int limit = 10;
		String[] tecnologies = {"Markdown","Regexp","HTML","CSS","Javascript", "SQL","Java"};
		m.recorrerString(tecnologies,limit);

	}
	
	public void recorrerString(String[] array,int limit) {	
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if(array[i] == "HTML") {
				if(limit > 0) {
					limit--;
					recorrerString(array,limit);
				}
				break;
			}				
		}
	}
}

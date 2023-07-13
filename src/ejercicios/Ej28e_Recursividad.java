package ejercicios;

public class Ej28e_Recursividad {

	public static void main(String[] args) {
		Ej28e_Recursividad m = new Ej28e_Recursividad();
		int num = 281412412;
		int num2 = 0;
		System.out.print(m.sumarNumero(Integer.toString(num),num2));
	}
	
	public int sumarNumero(String num, int num2){
		num2 += Character.getNumericValue(num.charAt(0));
		if(num.length() == 1) {
			return num2;
		}			
		return sumarNumero(num.substring(1),num2);
	}
}

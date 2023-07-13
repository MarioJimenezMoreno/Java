package ejercicios;

public class Ej15a_Condicionales {

	public static void main(String[] args) {
		
		boolean value;
		byte num = (byte) Math.floor(Math.random()*2) ;
		System.out.println("Numero: " + num);
		
		value = num == 1 ?  true: false;
		
		System.out.println("Color: " + (value == true ? "rojo" : "negro"));
		
	}
}

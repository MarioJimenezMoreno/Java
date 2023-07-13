package ejercicios;

public class Ej25_PrintF {

	public static void main(String[] args) {
		System.out.printf("%s\t\t%s\t%s%n","NOMBRE", "APELLIDO1", "APELLIDO2");
		System.out.printf("%s     %s%s%n","NOMBRE","apellido1","apellido2");
		System.out.printf("%2$s, %3$s, %s%n","NOMBRE","apellido1","apellido2");
		System.out.printf("\"    %d\"%n",22);
		System.out.printf("\"%010d\"%n",22);
		System.out.printf("\"%010.2f%n",17.1829327);
		System.out.printf("%s%s","Hola","Mundo");
	}

}

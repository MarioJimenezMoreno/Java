package ejercicios;

public class Ej08_Concatenar {

	public static void main(String[] args) {
		String nombre = "Mario";
		String apellidos = "Jimenez Moreno";
		String calle = "Carrer de l'Espiga";
		String municipio = "Barcelona";
		String codigoPostal = "08629";
		char sexo = 'M';
		String email = "mariojm2612@gmail.com";
		System.out.println("Nombre: " + nombre + " " + apellidos + "\n" +
							"Direccion: " + calle + ", " + municipio + ", " + codigoPostal + "\n" +
							"Sexo: " + sexo + "\n" +
							"Correo electrónico: " + email);
	}

}

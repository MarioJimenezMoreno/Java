package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ej39_Enums {

	public static void main(String[] args) {
		
		Developer d1 = new Developer("Mario","Jimenez Moreno",25,"45128683S","Full_Stack_Developer");
		Developer d2 = new Developer("David","Bernal Gonzalez",82,"93847162A","Back_End_Developer");
		Developer d3 = new Developer("Carlos","Gil Perez",11, "16326742Z","Front_End_Developer");
		
		List<Developer> devs = new ArrayList<>();
		devs.add(d1);
		devs.add(d2);
		devs.add(d3);
		
		for(Developer dev : devs) {
			if(dev.rolTecnologico.equals(Profesiones.Full_Stack_Developer.toString()) || dev.rolTecnologico.equals(Profesiones.Back_End_Developer.toString()) ) {				
				System.out.println(dev.nombre + ": " + "Viva el Back");
			}
			else if (dev.rolTecnologico.equals(Profesiones.Front_End_Developer.toString())){
				System.out.println(dev.nombre + ": " + "JS es una 💩, es mejor utilizar TypeScript");
			}
		}		
	}
	
	public enum Profesiones{
		Back_End_Developer,
		Front_End_Developer,
		Full_Stack_Developer
	}
	
	public static class Developer{
		private String nombre;
		private String apellidos;
		private int edad;
		private String dni;
		private String rolTecnologico;
		
		public Developer(String nombre, String apellidos, int edad, String dni, String rolTecnologico) {
			super();
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
			this.dni = dni;
			this.rolTecnologico = rolTecnologico;
		}
		public Developer() {}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getRolTecnologico() {
			return rolTecnologico;
		}
		public void setRolTecnologico(String rolTecnologico) {
			this.rolTecnologico = rolTecnologico;
		}
		
	}

}

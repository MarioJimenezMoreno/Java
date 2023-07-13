package ejercicios;

import java.util.ArrayList;

public class Ej26_TablaPrintF {

	public static void main(String[] args) {
		ArrayList<Alumno> alumnosList = new ArrayList<Alumno>();
		alumnosList.add(new Alumno("Mario","Jimenez Moreno","1997","Programacion"));
		alumnosList.add(new Alumno("David","Bernal Gonzalez","2000","Matematicas"));
		alumnosList.add(new Alumno("Blas","Hernandez Calvo","2006","Sociales"));
		
		System.out.printf("%-15s%-20s%-10s%-10s%n","Nombre","Apellidos","Ano","Curso");
		System.out.println("----------------------------------------------------------");
		
		for (Alumno alumnos : alumnosList) {
			System.out.printf("%-15s%-20s%-10s%-10s%n", alumnos.Nombre, alumnos.Apellidos, alumnos.Ano, alumnos.Curso);
		}
		
		System.out.printf("%15s%20s%10s%20s%n","Nombre","Apellidos","Ano","Curso");
		System.out.println("\t----------------------------------------------------------");
		
		for (Alumno alumnos : alumnosList) {
			System.out.printf("%15s%20s%10s%20s%n", alumnos.Nombre, alumnos.Apellidos, alumnos.Ano, alumnos.Curso);
		}
	}	
	
	public static class Alumno{
		String Nombre = "";
		String Apellidos = "";
		String Ano = "";
		String Curso = "";
		
		public String getFullName() {
			return Nombre + " " + Apellidos;
		}
		public String getApellidos() {
			return  Apellidos;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre = Nombre;
		}
		public void setApellidos(String Apellidos) {
			this.Apellidos = Apellidos;
		}
		public String getAño() {
			return Ano;
		}
		public void setAnyo(String Año) {
			this.Ano = Año;
		}
		public String getCurso() {
			return Curso;
		}
		public void setCurso(String Curso) {
			this.Curso = Curso;
		}
		public Alumno(String Nombre,String Apellidos, String Ano, String Curso) {
			super();
			this.Nombre = Nombre;
			this.Apellidos = Apellidos;
			this.Ano = Ano;
			this.Curso = Curso;
		}
	}
}
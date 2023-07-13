package ejercicios;

public class Ej33_Interfaces {
	public static void main(String[] args) {
	}
	
	public interface IPersona{
		
		public void setNombre(String nombre);
		public String getNombre();
		
	}
	
	public class Profesor implements IPersona{
		String nombre;
		int salario;
		
		public void setSalario(int salario){
			this.salario = salario;
		}
		public int getSalario() {
			return this.salario;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getNombre() {
			return this.nombre;
		}
	}
	public class Alumno implements IPersona{
		String nombre;
		int curso;
		
		public void setCurso(int curso){
			this.curso = curso;
		}
		public int getCurso() {
			return this.curso;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getNombre() {
			return this.nombre;
		}
	}
}

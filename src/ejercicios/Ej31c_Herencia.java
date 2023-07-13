package ejercicios;

public class Ej31c_Herencia {
	public static void main(String[] args) {		
	}
	
	public static class Empleado{
		String nombre;
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getNombre() {
			return this.nombre;			
		}
		
		public String toString() {
			return "Empleado";
		}
	}
	public class Directivo extends Empleado{
		public String toString() {
			return "Directivo";
		}
	}
	
	public class Operario extends Empleado{
		public String toString() {
			return "Operario";
		}
	}
	
	public class Oficial extends Operario{
		public String toString() {
			return "Oficial";
		}
	}
	
	public class Tecnico extends Operario{
		public String toString() {
			return "Tecnico";
		}
	}
}


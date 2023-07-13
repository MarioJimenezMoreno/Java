package ejercicios;

public class Ej31b_Herencia {
	public static void main(String[] args) {
	}
	
	public  static class Persona{
		String Nombre;
		String Apellidos;
		String Documento;
		String Tipo;
	}
	public class Cliente extends Persona{
		String Categoria;
		int Codigo;
		
		public void generarCodigo() {
			
		}
	}
	public class Empleado extends Persona{
		String tipoContrato;
		int sueldo;
		
		public void calcularSueldo(){
			
		}
	}
}

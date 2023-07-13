package ejercicios;

public class Ej32_Abstractas {
	public static void main(String[] args) {
	}
	
	public abstract class SerVivo{
		public abstract void alimentarse();
	}
	
	public class Planta extends SerVivo{
		public void alimentarse() {
			System.out.println("Me gusta el agua, el sol y la tierra");
		}
	}

	public abstract class Animal extends SerVivo{
		public abstract void alimentarse();
	}
	
	
	public class AnimalCarnivoro extends Animal{
		public void alimentarse() {
			System.out.println("Me encanta la carne");
		}
	}
	
	
	public class AnimalHerbivoro extends Animal{
		public void alimentarse() {
			System.out.println("Me gusta lo verde");
		}
	}
}

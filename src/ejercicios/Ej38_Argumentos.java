package ejercicios;

public class Ej38_Argumentos {

	public static void main(String[] args) {
		Lorca L = new Lorca();
		notAutorized nA = new notAutorized();
		if (args.length >= 2) {
			if (args[0].equals("Federico") && args[1].equals("GarciaLorca")) {
				L.recitarPoema();
			}
			else {
				nA.wrongArguments();
			}
		}
	}
	
	public static class Lorca {
		
		public void recitarPoema() {
			System.out.println("Amor de mis entrañas, viva muerte,");
			System.out.println("en vano espero tu palabra escrita");
			System.out.println("y pienso, con la flor que se marchita,");
			System.out.println("que si vivo sin mí quiero perderte.");
			System.out.println();
			System.out.println("El aire es inmortal. La piedra inerte");
			System.out.println("ni conoce la sombra ni la evita.");
			System.out.println("Corazón interior no necesita");
			System.out.println("la miel helada que la luna vierte.");
			System.out.println();
			System.out.println("Pero yo te sufrí. Rasgué mis venas,");
			System.out.println("tigre y paloma, sobre tu cintura");
			System.out.println("en duelo de mordiscos y azucenas.");
			System.out.println();
			System.out.println("Llena pues de palabras mi locura");
			System.out.println("o déjame vivir en mi serena");
			System.out.println("noche del alma para siempre oscura.");
		}

	}
	
	public static class notAutorized{
		
		public void wrongArguments() {
			System.out.println("Los argumentos no coinciden. Recuerda que el primero ha de ser \"Federico\" y el segundo \"GarciaLorca\"");
		}
		
	}

}

package ejercicios;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ej44c_ShowConfirmDialog {

	static final ImageIcon caballo = new ImageIcon("Assets/caballo.png");
	static final ImageIcon pizza = new ImageIcon("Assets/pizza.png");
	static final ImageIcon animal = new ImageIcon("Assets/animal.png");
	static int order;
	static Random r1 = new Random(caballo, "Acertijo", "De que color es el caballo blanco de santiago?", "Negro", "Blanco",
			"Marrón");
	static Random r2 = new Random(pizza, "Ocio", "Te gusta la pizza con piña?", "Si", "No lo sé", "NO!");
	static Random r3 = new Random(animal, "Ocio", "Cuantas mascotas tienes?", "Ninguna", "1-2", "3+");

	static String[] r1Opt = { r1.Option1, r1.Option2, r1.Option3, "Siguiente", "Salir" };
	static String[] r2Opt = { r2.Option1, r2.Option2, r2.Option3, "Siguiente", "Salir" };
	static String[] r3Opt = { r3.Option1, r3.Option2, r3.Option3, "Siguiente", "Salir" };
	
	public static void main(String[] args) {

		createRandom();

	}

	public static void createRandom() {
		int randomNum = (int) (Math.random() *3);
		int answer = -1;
		if (order == randomNum) {
			createRandom();
		} else {
			order = randomNum;
			switch (order) {
			case 0:
				answer = JOptionPane.showOptionDialog(null,
		                r1.Frase,
		                r1.Categoria,
		                JOptionPane.YES_NO_CANCEL_OPTION, 
		                JOptionPane.QUESTION_MESSAGE, 
		                r1.image,
		                r1Opt, 
		                r1Opt[0]);
				break;
			case 1:
				answer = JOptionPane.showOptionDialog(null,
		                r2.Frase,
		                r2.Categoria,
		                JOptionPane.YES_NO_CANCEL_OPTION, 
		                JOptionPane.QUESTION_MESSAGE, 
		                r2.image,
		                r2Opt, 
		                r2Opt[0]);
				break;
			case 2:
				answer = JOptionPane.showOptionDialog(null,
		                r3.Frase,
		                r3.Categoria,
		                JOptionPane.YES_NO_CANCEL_OPTION, 
		                JOptionPane.QUESTION_MESSAGE, 
		                r3.image,
		                r3Opt, 
		                r3Opt[0]);
				break;
			}
			if(answer != 4) {
				createRandom();
			}
		}
	}

	public static class Random {
		ImageIcon image;
		String Categoria;
		String Frase;
		String Option1;
		String Option2;
		String Option3;

		public Random(ImageIcon image, String categoria, String frase, String option1, String option2, String option3) {
			this.image = image;
			this.Categoria = categoria;
			this.Frase = frase;
			this.Option1 = option1;
			this.Option2 = option2;
			this.Option3 = option3;
		}
	}
}

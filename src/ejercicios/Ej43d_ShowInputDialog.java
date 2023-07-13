package ejercicios;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ej43d_ShowInputDialog {

	static String[] animales = { "Lobo", "Perro", "Gato" };
	static ImageIcon lobo = new ImageIcon("Assets/lobo.png");
	static ImageIcon perro = new ImageIcon("Assets/perro.png");
	static ImageIcon gato = new ImageIcon("Assets/gato.png");
	
	public static void main(String[] args) {

		String text = (String) JOptionPane.showInputDialog(null, "¿Cuál es tu animal favorito?", "Animales", 1, null,
				animales, animales[0]);
		
		checkText(text);

	}

	public static void checkText(String text) {
		if(text == null) {
			text = (String) JOptionPane.showInputDialog(null, "¿Cuál es tu animal favorito?", "Animales", 1, null,
					animales, animales[0]);
			checkText(text);
		}
		else {
			switch (text) {
			case "Lobo":
				JOptionPane.showMessageDialog(null, "NO LO ACARICIES", "¡¡UN LOBO!!", -1, lobo);
				break;
			case "Perro":
				JOptionPane.showMessageDialog(null, "Acaricialo :)", "¡UN PERRO!", -1, perro);
				break;
			case "Gato":
				JOptionPane.showMessageDialog(null, "Acaricialo :)", "¡UN GATO!", -1, gato);
				break;
			default:
				text = (String) JOptionPane.showInputDialog(null, "¿Cuál es tu animal favorito?", "Animales", 1, null,
						animales, animales[0]);
				checkText(text);
				break;
			}
		}		
	}
}

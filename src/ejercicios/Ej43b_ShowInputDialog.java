package ejercicios;

import javax.swing.JOptionPane;

public class Ej43b_ShowInputDialog {

	public static void main(String[] args) {

		String text = JOptionPane.showInputDialog("Escribe algo");
		
		checkText(text);
		
	}
	public static void checkText(String text) {
		if(text == null) {
			pressedCancel();
		}else if (text.trim().isEmpty()){
			noText();
		}else {
			textInserted(text);
		}
	}
	public static void pressedCancel() {
		JOptionPane.showMessageDialog(null, "¡Introduce un texto!", "ERROR", 0);
		checkText(JOptionPane.showInputDialog("Escribe algo"));
		
	}
	public static void noText() {
		checkText(JOptionPane.showInputDialog(null, "Escribe algo", "Insert", 2));
	}
	public static void textInserted(String text){
		JOptionPane.showMessageDialog(null, text, "Text written", 1);
	}

}

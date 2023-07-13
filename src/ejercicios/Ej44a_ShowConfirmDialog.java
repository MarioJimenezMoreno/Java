package ejercicios;

import javax.swing.JOptionPane;

public class Ej44a_ShowConfirmDialog {

	public static void main(String[] args) {

		int num = JOptionPane.showConfirmDialog(null, "Press a button");

		showResult(num);

	}

	public static void showResult(int num) {
		switch (num) {
		case 0:
			JOptionPane.showMessageDialog(null, "You pressed 'Yes'", "Button", 1);
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "You pressed 'No'", "Button", 1);
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "You pressed 'Cancel'", "Button", 1);
			break;
		}
	}

}

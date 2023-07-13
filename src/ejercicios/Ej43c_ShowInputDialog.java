package ejercicios;

import javax.swing.JOptionPane;

public class Ej43c_ShowInputDialog {

	public static void main(String[] args) {

		String text = JOptionPane.showInputDialog(
				"Queue Operations Menu \n 1.Insert \n 2.Delete \n 3.Display \n 4.Exit \n\n Enter your option");
		System.out.println(text);
		checkText(text);

	}

	public static void checkText(String text) {
		 if (text.equals("1") || text.equals("2") || text.equals("3") || text.equals("4")) {
			 selectIcon(text);		
		} else {
			checkText(JOptionPane.showInputDialog(
					"Queue Operations Menu \n 1.Insert \n 2.Delete \n 3.Display \n 4.Exit \n\n Enter your option"));
		}
	}

	public static void selectIcon(String text) {
		switch (text) {
		case "1":
			JOptionPane.showMessageDialog(null, "Icono " + text + " elegido", "Icon", 0);
			break;

		case "2":
			JOptionPane.showMessageDialog(null, "Icono " + text + " elegido", "Icon", 1);
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "Icono " + text + " elegido", "Icon", 2);
			break;
		case "4":
			JOptionPane.showMessageDialog(null, "Icono " + text + " elegido", "Icon", 3);
			break;
		}
	}

}

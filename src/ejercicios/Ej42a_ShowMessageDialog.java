package ejercicios;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ej42a_ShowMessageDialog {

	public static void main(String[] args) {
	
		ImageIcon icon = new ImageIcon("Assets/icon.png");
		
		JOptionPane.showMessageDialog(null, "Mario");
		JOptionPane.showMessageDialog(null, "Mario","Java", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mario","Java", -1, icon);
	}

}

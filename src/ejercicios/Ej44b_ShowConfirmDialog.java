package ejercicios;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Ej44b_ShowConfirmDialog {

	public static void main(String[] args) {
		UIManager.put("OptionPane.yesButtonText", "Yes, please");
		UIManager.put("OptionPane.noButtonText", "No way!");
		JOptionPane.showConfirmDialog(null, "Would you like green eggs and ham?", "A Silly Question",
				JOptionPane.YES_NO_OPTION);

	}

}

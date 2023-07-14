package ejercicios;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ej45_JFrame {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		MiJFrame m = new MiJFrame();

	}
	
	public static class MiJFrame extends JFrame{

		private static final long serialVersionUID = 1L;
		
		MiJFrame(){
			setSize(800,600);
			setLocationRelativeTo(null);
			setVisible(true);
			setTitle("Fundación Esplai");
			setResizable(false);
			getContentPane().setBackground(Color.BLUE);
			setIconImage(Toolkit.getDefaultToolkit().getImage("Assets/pizza.png"));
		}
		
	}
}


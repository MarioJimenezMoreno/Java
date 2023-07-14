package ejercicios;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ej48a_GridLayout {

	public static void main(String[] args) {

		MiJFrame m = new MiJFrame();

	}

	public static class MiJFrame extends JFrame {

		private static final long serialVersionUID = 1L;

		MiJFrame() {
			JButton btn1 = new JButton("NORTH");
			JButton btn2 = new JButton("SOUTH");
			JButton btn3 = new JButton("EAST");
			JButton btn4 = new JButton("WEST");

			add(btn1);
			add(btn2);
			add(btn3);
			add(btn4);

			setSize(800, 800);
			setLocationRelativeTo(null);
			setVisible(true);
			setTitle("Fundación Esplai");
			setLayout(new GridLayout(2, 2));
		}
	}
}

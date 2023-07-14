package ejercicios;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ej48b_GridLayout {

	public static void main(String[] args) {

		MiJFrame m = new MiJFrame();

	}

	public static class MiJFrame extends JFrame {

		private static final long serialVersionUID = 1L;

		MiJFrame() {
			JButton btn1 = new JButton("Contacts");
			JButton btn2 = new JButton("Message");
			JButton btn3 = new JButton("Call Log");
			JButton btn4 = new JButton("Games");
			JButton btn5 = new JButton("Settings");
			JButton btn6 = new JButton("Applications");
			JButton btn7 = new JButton("Music");
			JButton btn8 = new JButton("Gallery");
			JButton btn9 = new JButton("Organiser");
			
			add(btn1);
			add(btn2);
			add(btn3);
			add(btn4);
			add(btn5);
			add(btn6);
			add(btn7);
			add(btn8);
			add(btn9);
			
			setSize(800, 800);
			setLocationRelativeTo(null);
			setVisible(true);
			setTitle("Fundación Esplai");
			setLayout(new GridLayout(3, 3));
		}
	}

}

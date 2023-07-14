package ejercicios;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ej47a_FlowLayout {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		MiJFrame m = new MiJFrame();		
		
	}
	
	public static class MiJFrame extends JFrame{

		private static final long serialVersionUID = 1L;
		
		MiJFrame(){
			JButton btn1 = new JButton("Btn 1");
			JButton btn2 = new JButton("Btn 2");
			JButton btn3 = new JButton("Btn 3");
			JButton btn4 = new JButton("Btn 4");
			JButton btn5 = new JButton("Btn 5");
			JButton btn6 = new JButton("Btn 6");
			JButton btn7 = new JButton("Btn 7");
			JButton btn8 = new JButton("Btn 8");
			
			add(btn1);
			add(btn2);
			add(btn3);
			add(btn4);
			add(btn5);
			add(btn6);
			add(btn7);
			add(btn8);

			
			setSize(400,400);
			setLocationRelativeTo(null);
			setVisible(true);
			setTitle("Fundación Esplai");
			setLayout(new FlowLayout(FlowLayout.LEADING));
		}
	}
}

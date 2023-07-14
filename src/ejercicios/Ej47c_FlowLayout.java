package ejercicios;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ej47c_FlowLayout {

	public static void main(String[] args) {

		JFrame m = new JFrame();
		JPanel p = new JPanel(new FlowLayout());
		
		p.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		JButton btn1 = new JButton("Btn 1");
		JButton btn2 = new JButton("Btn 2");
		JButton btn3 = new JButton("Btn 3");
		JButton btn4 = new JButton("Btn 4");
		JButton btn5 = new JButton("Btn 5");
		JButton btn6 = new JButton("Btn 6");
		JButton btn7 = new JButton("Btn 7");
		JButton btn8 = new JButton("Btn 8");
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		p.add(btn8);
		
		m.add(p);
		
		m.setSize(400,400);
		m.setLocationRelativeTo(null);
		m.setVisible(true);
		m.setTitle("Fundación Esplai");	
	}		
}

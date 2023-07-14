package ejercicios;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ej46_BorderLayout {

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
			
			add(btn1, BorderLayout.NORTH);
			add(btn2, BorderLayout.EAST);
			add(btn3, BorderLayout.CENTER);
			add(btn4, BorderLayout.WEST);
			add(btn5, BorderLayout.SOUTH);
			
			setSize(800,600);
			setLocationRelativeTo(null);
			setVisible(true);
			setTitle("Fundación Esplai");
			
			btn1.addActionListener(e ->{				
				System.out.println("Has pulsado NORTH");
			});
			btn2.addActionListener(e ->{				
				System.out.println("Has pulsado EAST");
			});
			btn3.addActionListener(e ->{				
				System.out.println("Has pulsado CENTER");
			});
			btn4.addActionListener(e ->{				
				System.out.println("Has pulsado WEST");
			});
			btn5.addActionListener(e ->{				
				System.out.println("Has pulsado SOUTH");
			});
		}
		
	}

}

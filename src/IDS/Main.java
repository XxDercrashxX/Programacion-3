package IDS;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		
		ventana.setTitle("Programa");
		ventana.setVisible(true);
		ventana.setSize(500,500);
		
		ventana.setLocationRelativeTo(null);
		
		ventana.setDefaultCloseOperation(3);
		
		ventana.setResizable(true);
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setMinimumSize(new Dimension(400,400));
		
		

	}

}

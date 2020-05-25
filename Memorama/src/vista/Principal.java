package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {
	
	public static Container contenedor;
	private BufferedImage imagen;
	public Principal() {
		
		this.setTitle("Memorama");
		this.setSize(405,425);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		contenedor = this.getContentPane();
		try {
			imagen = ImageIO.read(new File("Users\\Marks\\eclipse-workspace\\Memorama\\src\\recursos\\catalina.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		this.setVisible(true);
	}

	
	
	
	
	
	public static void main(String[] args) {
	 new Principal();
	}

	
	

}

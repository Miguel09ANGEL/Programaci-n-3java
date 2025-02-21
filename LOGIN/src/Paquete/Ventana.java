package Paquete;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ventana extends JFrame{
	public Ventana(){
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		
		this.setTitle("LOGIN");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
}

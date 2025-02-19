package Paquete;
import java.awt.Dimension;

public class Ventana extends JFrame {
	public Ventana() {
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		
		this.setDefaultCloseOperation(JFRame.EXIT_ON_CLOSE);
		
		
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension (400,400));
		//this.setResizable(true);
		this.add(this.login());
		this.repaint();
		
		
		
	}
	public JPanellogin()
	{
		JPanel mipanel = new JPanel();
		mipanel.setBackground(Color.YELLOW);
		
		
		return null;
	}
}

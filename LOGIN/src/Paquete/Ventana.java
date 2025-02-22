package Paquete;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	public Ventana(){
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		
		this.setTitle("LOGIN");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension (400,400));
		
		
		//this.setResizable(true);
		this.add(this.login());
		this.repaint();
	
	}
	
	public JPanel login() {
		
		JPanel mipanel =new JPanel();
		
		mipanel.setBackground(Color.decode("#48cae4"));
		mipanel.setOpaque(true);
		mipanel.setSize(500,500);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(200,30);
		
		etiqueta1.setLocation(150,30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24));
		mipanel.add(etiqueta1);
		
		JLabel etiqueta2= new JLabel("Ingrese su email");
		etiqueta2.setSize(200,30);
		etiqueta2.setLocation(40,130);
		etiqueta2.setFont(new Font("American Typewriter",Font.BOLD,18));
		mipanel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(300,30);
		email.setLocation(40,160);
		email.setFont(new Font("American Typewriter",Font.BOLD,18));
		mipanel.add(email);
		
		JLabel etiqueta3= new JLabel("Ingrese su contraseña");
		etiqueta3.setSize(300,60);
		etiqueta3.setLocation(40,200);
		etiqueta3.setFont(new Font("American Typewriter",Font.BOLD,18));
		mipanel.add(etiqueta3);
		
		JTextField contraseña = new JTextField();
		contraseña.setSize(300,30);
		contraseña.setLocation(40,240);
		contraseña.setFont(new Font("American Typewriter",Font.BOLD,18));
		mipanel.add(contraseña);
		
		JLabel etiqueta4= new JLabel("¿Olvido su contraseña?");
		etiqueta4.setSize(300,60);
		etiqueta4.setLocation(40,260);
		etiqueta4.setFont(new Font("American Typewriter",Font.BOLD,14));
		mipanel.add(etiqueta4);
		
		
		
		
		return mipanel;
	}
	
	
}

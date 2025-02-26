package Paquete;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Ventana extends JFrame {


    public Ventana() {
    	
    	setVisible(true);
    	setSize(600, 500);
    	setLocationRelativeTo(null);
    	
    	setTitle("Login");    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    	
    	setMaximumSize(new Dimension(700, 700));
    	setMinimumSize(new Dimension(400, 400));
    	
    	this.add(this.logins());
    	//this.add(this.registro());
    	//this.add(this.scrooll_pane());
    	
    	this.repaint();
    	
    }
   
    
    public JPanel logins() {
    	
    	JPanel elPanel = new JPanel();
    	
    	elPanel.setBackground(Color.decode("#FFFFFF"));
    	elPanel.setOpaque(true);
    	elPanel.setSize(this.getWidth(), this.getHeight());
    	elPanel.setLocation(0, 0);
    	elPanel.setLayout(null);//quita todo el molde
    	
    	JLabel image1 = new JLabel(new ImageIcon("Metas.png"));
    	image1.setBounds(260,120, 300, 168);
    	elPanel.add(image1);
    	
    	ImageIcon imagen = new ImageIcon("Icon.jpeg");
    	JLabel imagen2 = new JLabel();
    	imagen2.setBounds(10, 5, 300,300);
    	imagen2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
    	elPanel.add(imagen2);
    	
    	ImageIcon image3 = new ImageIcon("Candado.jpeg");
    	JLabel imagen3 = new JLabel();
    	imagen3.setBounds(10, 80, 300,300);
    	imagen3.setIcon(new ImageIcon(image3.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
    	elPanel.add(imagen3);
    	
    	JLabel etiqueta1 = new JLabel("Inicio de sesion");
    	etiqueta1.setSize(200, 40);
    	etiqueta1.setLocation(50, 50);
    	etiqueta1.setHorizontalAlignment(JLabel.CENTER);
    	etiqueta1.setFont(new Font("Montserrat ",Font.BOLD,20));
    	elPanel.add(etiqueta1);
    	
    	JLabel etiqueta2 = new JLabel("Ingrese su correo: ");
    	etiqueta2.setSize(200, 40);
    	etiqueta2.setLocation(50, 100);
    	etiqueta2.setFont(new Font("Montserrat ",Font.BOLD,15));
    	elPanel.add(etiqueta2);
    	
    	JTextField gmail = new JTextField();
    	gmail.setSize(200, 30);
    	gmail.setLocation(50, 140);
    	gmail.setFont(new Font("Montserrat ",Font.BOLD,15));
    	elPanel.add(gmail);
    	
        JLabel etiqueta3 = new JLabel("Ingrese su contraseña:");
        etiqueta3.setSize(200, 40);
        etiqueta3.setLocation(50, 180);
        etiqueta3.setFont(new Font("Montserrat ", Font.BOLD, 15));
        elPanel.add(etiqueta3);

        JPasswordField password = new JPasswordField();
        password.setSize(200, 30);
        password.setLocation(50, 220);
        password.setFont(new Font("Montserrat ", Font.PLAIN, 15));
        elPanel.add(password);
        
        JLabel OlvidoContrasena = new JLabel("¿Olvidó su contraseña?");
        OlvidoContrasena.setSize(200, 20);
        OlvidoContrasena.setLocation(70, 260);
        OlvidoContrasena.setFont(new Font("Montserrat ", Font.ITALIC, 12));
        elPanel.add(OlvidoContrasena);
        
        JButton botonAcceder = new JButton("Acceder");
        botonAcceder.setSize(120, 40);
        botonAcceder.setLocation(90, 350);
        botonAcceder.setFont(new Font("Montserrat ", Font.BOLD, 15));
        elPanel.add(botonAcceder);
        
        JLabel CrearCuenta = new JLabel("¿No tienes cuenta? Crear cuenta");
        CrearCuenta.setSize(200, 20);
        CrearCuenta.setLocation(60, 300);
        CrearCuenta.setFont(new Font("Montserrat ", Font.ITALIC, 12));
        elPanel.add(CrearCuenta);
        
      
    	
        
    	
    	return elPanel;
    	
    	
    }
}
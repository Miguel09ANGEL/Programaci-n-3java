package prueba;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
    	setSize(600, 540);
    	setLocationRelativeTo(null);
    	
    	setTitle("Calculadora");    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    	
    	setMaximumSize(new Dimension(700, 700));
    	setMinimumSize(new Dimension(400, 400));
    	
    	this.add(this.logins());
    	//this.add(this.registro());
    	//this.add(this.scrooll_pane());
    	
    	this.repaint();
    	
    }
    
    public Image getIconImage() {
    	   Image retValue = Toolkit.getDefaultToolkit().
    	         getImage(ClassLoader.getSystemResource("prueba/pp.png"));


    	   return retValue;
    	}
    
   
    
    
    
    
    
   
    
    public JPanel logins() {
    	
    	JPanel elPanel = new JPanel();
    	
    	elPanel.setBackground(Color.decode("#FFFFFF"));
    	elPanel.setOpaque(true);
    	elPanel.setSize(this.getWidth(), this.getHeight());
    	elPanel.setLocation(0, 0);
    	elPanel.setLayout(null);//quita todo el molde
    	
    	
    	
    	
    	
    	JTextField pantalla = new JTextField();
    	pantalla.setSize(590, 100);
    	pantalla.setLocation(0, 0);
    	pantalla.setFont(new Font("Roboto Mono",Font.BOLD,50));
    	pantalla.setHorizontalAlignment(JTextField.RIGHT);
    	elPanel.add(pantalla);
    	
       

       
       
        
        JButton botonC = new JButton("C");
        botonC.setSize(150, 80);
        botonC.setLocation(0, 100);
        botonC.setBackground(Color.decode("#0A192F")); // Negro puro
        botonC.setForeground(Color.decode("#00FF00")); // Verde neón
        botonC.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(botonC);
        
        
        JButton botonUnificado = new JButton("");
        botonUnificado.setSize(450, 80);
        botonUnificado.setLocation(150, 100);
        botonUnificado.setBackground(Color.decode("#0A192F"));
        botonUnificado.setForeground(Color.decode("#00FF00"));
        botonUnificado.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(botonUnificado);
        
        JButton boton0 = new JButton("0");
        boton0.setSize(150, 80);
        boton0.setLocation(0, 420);
        boton0.setBackground(Color.decode("#0A192F")); 
        boton0.setForeground(Color.decode("#00FF00")); 
        boton0.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton0);
        
        JButton boton1 = new JButton("1");
        boton1.setSize(150, 80);
        boton1.setLocation(0, 340);
        boton1.setBackground(Color.decode("#0A192F"));
        boton1.setForeground(Color.decode("#00FF00")); 
        boton1.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton1);
        
        JButton boton2 = new JButton("2");
        boton2.setSize(150, 80);
        boton2.setLocation(150, 340);
        boton2.setBackground(Color.decode("#0A192F"));
        boton2.setForeground(Color.decode("#00FF00")); 
        boton2.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton2);
        
        JButton boton3 = new JButton("3");
        boton3.setSize(150, 80);
        boton3.setLocation(300, 340);
        boton3.setBackground(Color.decode("#0A192F")); 
        boton3.setForeground(Color.decode("#00FF00")); 
        boton3.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton3);
        
        JButton boton4 = new JButton("4");
        boton4.setSize(150, 80);
        boton4.setLocation(0, 260);
        boton4.setBackground(Color.decode("#0A192F"));
        boton4.setForeground(Color.decode("#00FF00"));
        boton4.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton4);
        
        JButton boton5 = new JButton("5");
        boton5.setSize(150, 80);
        boton5.setLocation(150, 260);
        boton5.setBackground(Color.decode("#0A192F"));
        boton5.setForeground(Color.decode("#00FF00")); 
        boton5.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton5);
        
        JButton boton6 = new JButton("6");
        boton6.setSize(150, 80);
        boton6.setLocation(300, 260);
        boton6.setBackground(Color.decode("#0A192F"));
        boton6.setForeground(Color.decode("#00FF00")); 
        boton6.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton6);
        
        JButton boton7 = new JButton("7");
        boton7.setSize(150, 80);
        boton7.setLocation(0, 180);
        boton7.setBackground(Color.decode("#0A192F"));
        boton7.setForeground(Color.decode("#00FF00")); 
        boton7.setFont(new Font("Roboto Mono", Font.BOLD, 40));
        elPanel.add(boton7);
        
        JButton boton8 = new JButton("8");
        boton8.setSize(150, 80);
        boton8.setLocation(150, 180);
        boton8.setBackground(Color.decode("#0A192F"));
        boton8.setForeground(Color.decode("#00FF00")); 
        boton8.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton8);
        
        JButton boton9 = new JButton("9");
        boton9.setSize(150, 80);
        boton9.setLocation(300, 180);
        boton9.setBackground(Color.decode("#0A192F"));
        boton9.setForeground(Color.decode("#00FF00")); 
        boton9.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(boton9);
        
        JButton botonDiv = new JButton("/");
        botonDiv.setSize(150, 80);
        botonDiv.setLocation(450, 180);
        botonDiv.setBackground(Color.decode("#0A192F"));
        botonDiv.setForeground(Color.decode("#00FF00")); 
        botonDiv.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(botonDiv);
        
        JButton botonMult = new JButton("*");
        botonMult.setSize(150,80);
        botonMult.setLocation(450, 260);
        botonMult.setBackground(Color.decode("#0A192F")); 
        botonMult.setForeground(Color.decode("#00FF00")); 
        botonMult.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(botonMult);
        
        
        JButton botonSum = new JButton("+");
        botonSum.setSize(150, 80);
        botonSum.setLocation(450, 420);
        botonSum.setBackground(Color.decode("#0A192F")); 
        botonSum.setForeground(Color.decode("#00FF00"));
        botonSum.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(botonSum);
        
        JButton botonRest = new JButton("-");
        botonRest.setSize(150, 80);
        botonRest.setLocation(450, 340);
        botonRest.setBackground(Color.decode("#0A192F")); 
        botonRest.setForeground(Color.decode("#00FF00"));
        botonRest.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(botonRest);
        
        JButton botonIgual = new JButton("=");
        botonIgual.setSize(150, 80);
        botonIgual.setLocation(300, 420);
        botonIgual.setBackground(Color.decode("#0A192F")); 
        botonIgual.setForeground(Color.decode("#00FF00"));
        botonIgual.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(botonIgual);
        
        JButton botondecimal = new JButton(".");
        botondecimal.setSize(150, 80);
        botondecimal.setLocation(150, 420);
        botondecimal.setBackground(Color.decode("#0A192F")); 
        botondecimal.setForeground(Color.decode("#00FF00"));
        botondecimal.setFont(new Font("Roboto Mono ", Font.BOLD, 40));
        elPanel.add(botondecimal);
       
        
      
    	
        
    	
    	return elPanel;
    	
    	
    }
}
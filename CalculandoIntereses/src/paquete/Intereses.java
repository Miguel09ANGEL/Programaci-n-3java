package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Intereses {

	public JPanel calculadora()
	{
		
		Font fuente = new Font ("Roboto Mono" ,Font.BOLD,20);
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#00FF00"));
    	mipanel.setOpaque(true);
    	mipanel.setSize(0, 200);
    	mipanel.setLocation(0, 0);
    	mipanel.setLayout(new BorderLayout());
    	
    	
    	JLabel result = new JLabel("Intereses ");
    	result.setBackground(Color.BLACK);
    	result.setForeground(Color.ORANGE); 
    	result.setOpaque(true);
    	result.setFont(fuente);
    	result.setHorizontalAlignment(JLabel.LEFT);
    	mipanel.add(result,BorderLayout.NORTH);
    	
    	JPanel centro = new JPanel();
    	centro.setOpaque(true);
    	centro.setBackground(Color.YELLOW);
    	centro.setLayout(new GridLayout(3,2,0,5));
    	
    	mipanel.add(centro,BorderLayout.CENTER);
    	
    	JLabel capital= new JLabel("Capital");
    	capital.setBorder(BorderFactory.createMatteBorder(30, 80, 1, 1, Color. YELLOW));
    	centro.add(capital);
    	
    	JTextField cap = new JTextField("$232141");
    	centro.add(cap);
    	
    	JLabel tiempo= new JLabel("Tiempo");
    	tiempo.setBorder(BorderFactory.createMatteBorder(30, 80, 1, 1, Color.YELLOW));
    	centro.add(tiempo);
    	
    	JTextField tiemp = new JTextField("$100,000,000.00");
    	
    	centro.add(tiemp);
    	
    	JLabel tasa= new JLabel("Tasa de Interes");
    	tasa.setBorder(BorderFactory.createMatteBorder(30, 50, 1, 1, Color.YELLOW));
    	centro.add(tasa);
    	
    	JTextField tas = new JTextField("$100,000,000.00");
    	
    	centro.add(tas);
    	
    	JPanel centro1 = new JPanel();
    	centro1.setOpaque(true);
    	centro1.setBackground(Color.CYAN);
    	centro1.setLayout(new GridLayout(2,2,0,40));
    	mipanel.add(centro1,BorderLayout.SOUTH);
    	
    	JLabel text1= new JLabel("Interes");
    	text1.setBorder(BorderFactory.createMatteBorder(30, 80, 1, 1, Color.CYAN));
    	centro1.add(text1);
    	
    	JTextField textw1 = new JTextField("$232141");
    	centro1.add(textw1);
    	
    	JLabel text2= new JLabel("MONTO");
    	text2.setBorder(BorderFactory.createMatteBorder(1, 80, 30, 1, Color.CYAN));
    	centro1.add(text2);
    	
    	JTextField textw2 = new JTextField("$100,000,000.00");
    	
    	centro1.add(textw2);
    	
    	
    	
    	
    	 
    	
    	
    	
    	
    	/*
    	 JPanel botones = new JPanel();
    	botones.setLayout(new GridLayout(4,3));
    	
    	centro.add(botones,BorderLayout.CENTER);
    	
    	
    	String [] textos = {"9","8","7","6","5","4","3","2","1",".","0",};
    	 
    	
    	for (String  texto_boton  : textos) {
    		
    		JButton boton = new JButton(texto_boton);
    		
    		
    		botones.add(boton); 
    		
    	
    	
    	}
    	
    	/* JPanel columnaExtra = new JPanel();
         columnaExtra.setLayout(new GridLayout(6, 1));
         columnaExtra.setBackground(Color.GRAY);

         String[] extraBotones = {"+", "-", "*", "/","=", "CE"};

         for (String texto : extraBotones) {
        	 
             JButton boton = new JButton(texto);
             columnaExtra.add(boton);
         }

         mipanel.add(columnaExtra, BorderLayout.EAST);
    	*/
    	
    	
    return mipanel;
	}
	
	

	public static void main(String[] args) {
		

		JFrame ventana = new JFrame("Calculadora");
        ventana.setSize(400, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        Intereses miCalculadora = new Intereses();
        ventana.add(miCalculadora.calculadora());

        ventana.setVisible(true);
    }

}
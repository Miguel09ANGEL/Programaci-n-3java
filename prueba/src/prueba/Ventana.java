package prueba;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana {

	public JPanel calculadora()
	{
		
		Font fuente = new Font ("Roboto Mono" ,Font.BOLD,20);
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#00FF00"));
    	mipanel.setOpaque(true);
    	mipanel.setSize(500, 800);
    	mipanel.setLocation(0, 0);
    	mipanel.setLayout(new BorderLayout());
    	
    	
    	JLabel result = new JLabel("20.00 ");
    	result.setBackground(Color.CYAN);
    	result.setOpaque(true);
    	result.setFont(fuente);
    	result.setHorizontalAlignment(JLabel.RIGHT);
    	mipanel.add(result,BorderLayout.NORTH);
    	
    	JPanel centro = new JPanel();
    	centro.setBackground(Color.decode("#00FF00"));
    	centro.setOpaque(true);
    	centro.setLayout(new BorderLayout());
    	mipanel.add(centro,BorderLayout.CENTER);
    	
    	JPanel botones = new JPanel();
    	botones.setLayout(new GridLayout(4,3));
    	centro.add(botones,BorderLayout.CENTER);
    	
    	String [] textos = {"9","8","7","6","5","4","3","2","1",".","0",};
    	
    	for (String  texto_boton  : textos) {
    		
    		JButton boton = new JButton(texto_boton);
    		botones.add(boton);
    	
    	
    	}
    	
    	 JPanel columnaExtra = new JPanel();
         columnaExtra.setLayout(new GridLayout(6, 1));
         columnaExtra.setBackground(Color.GRAY);

         String[] extraBotones = {"+", "-", "*", "/","=", "CE"};

         for (String texto : extraBotones) {
             JButton boton = new JButton(texto);
             columnaExtra.add(boton);
         }

         mipanel.add(columnaExtra, BorderLayout.EAST);
    	
    	
    	
    	return mipanel;
	}
	

	public static void main(String[] args) {
		

		JFrame ventana = new JFrame("Calculadora");
        ventana.setSize(400, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        Ventana miCalculadora = new Ventana();
        ventana.add(miCalculadora.calculadora());

        ventana.setVisible(true);
    }

}
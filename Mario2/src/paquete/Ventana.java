package paquete;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JPanel{

	
		 public static void main(String[] args) {
		        JFrame frame = new JFrame("Dibujo en Java");
		        Ventana panel = new Ventana();
		        
		        frame.add(panel);
		        frame.setSize(900, 900);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.setVisible(true);
		    }
	
		 public void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        g.draw3DRect(100, 100, 80, 80, true); 
		        g.drawString("Hola", 150, 200); 
		        
		        super.paintComponent(g);

		        Graphics2D g2d=(Graphics2D)g.create();
		        g2d.setStroke(new BasicStroke(5));
		        g2d.drawRect(100,100,80,80);
		        
		        //Cielo
		        g2d.setColor(Color.decode("#1E90FF"));
		        g2d.fillRect(0, 0, 900, 800);
		        //Pasto
		        g2d.setColor(Color.decode("#7A4B3A"));
		        g2d.fillRect(0, 600, 900, 400);
		        
		        
		        g2d.setColor(Color.decode("#87CEEB")); 
		        g2d.fillRect(50, 250, 80, 350);
		       
		        g2d.setColor(Color.decode("#87CEEB")); 
		        g2d.fillRect(200, 250, 80, 350);
		        
		        g2d.setColor(Color.decode("#87CEEB")); 
		        g2d.fillRect(400, 250, 80, 350);
		        //Cuadro1
		        g2d.setColor(Color.decode("#000000"));
		        g2d.fillRect(7, 397, 65, 65);
		        g2d.setColor(Color.decode("#9C5A30"));
		        g2d.fillRect(10, 400, 60,60);
		        
		      //Cuadroarriba
		        g2d.setColor(Color.decode("#000000"));
		        g2d.fillRect(497, 77, 65, 65);
		        g2d.setColor(Color.decode("#9C5A30"));
		        g2d.fillRect(500, 80, 60,60);
		        
		        //Cuadro1junto
		        g2d.setColor(Color.decode("#000000"));
		        g2d.fillRect(97, 197, 65, 65);
		        g2d.setColor(Color.decode("#9C5A30"));
		        g2d.fillRect(100, 200, 60,60);
		        
		        //Cuadro2junto
		        g2d.setColor(Color.decode("#000000"));
		        g2d.fillRect(162, 197, 65, 65);
		        g2d.setColor(Color.decode("#9C5A30"));
		        g2d.fillRect(165, 200, 60,60);
		        
		       
		        //Cuadro Rectangulo
		        g2d.setColor(Color.decode("#000000"));//Rosa
		        g2d.fillRect(440, 340, 230, 260);
		        g2d.setColor(Color.decode("#000000")); 
		        g2d.fillRect(400, 300, 240, 300);
		        
		        g2d.setColor(Color.decode("#0000FF"));//azul
		        g2d.fillRect(405, 303, 237, 297);
		        
		        //Cuadro Rosa
		        //Sombra
		        g2d.setColor(Color.decode("#000000"));//Rosa
		        g2d.fillRect(245, 370, 230, 230);
		        
		        g2d.setColor(Color.decode("#000000")); 
		        g2d.fillRect(200, 350, 250, 250);
		        
		        g2d.setColor(Color.decode("#FFC0CB"));//Rosa
		        g2d.fillRect(205, 355, 245, 245);
		       
		        
		        //Tubo
		        
		        g2d.setColor(Color.decode("#000000"));
		        g2d.fillRect(697, 447, 105, 155);
		       
		        g2d.setColor(Color.decode("#086300")); 
		        g2d.fillRect(700, 450, 100, 150);
		        
		        g2d.setColor(Color.decode("#000000"));
		        g2d.fillRect(692, 447, 115, 65);
		       
		        g2d.setColor(Color.decode("#086300")); 
		        g2d.fillRect(695, 450, 110, 60);
		        //Brillo1
		        g2d.setColor(Color.decode("#00C500")); 
		        g2d.fillRect(710, 450, 5, 150);
		        
		        //Brillo2
		        g2d.setColor(Color.decode("#00C500")); 
		        g2d.fillRect(716, 450, 6, 150);
		        //Brillo3
		        g2d.setColor(Color.decode("#00C500")); 
		        g2d.fillRect(736, 450, 6, 150);
		        
		        //BrilloBrillo4
		        g2d.setColor(Color.decode("#00C500")); 
		        g2d.fillRect(770, 450, 5, 150);
		        
		        //Brillo5 Negro
		        g2d.setColor(Color.decode("#000000")); 
		        g2d.fillRect(780, 450, 6, 150);
		        
		        g2d.setColor(Color.decode("#333333")); 
		        g2d.fillRect(785, 450, 6, 150);
		        
		        g2d.setColor(Color.decode("#000000")); 
		        g2d.fillRect(795, 450, 6, 150);
		        
		        g2d.setColor(Color.decode("#000000"));
		        g2d.fillRect(692, 510, 115, 5);
		        
		        
		        
		        //Banqueta
		        g2d.setColor(Color.decode("#FFFFFF"));
		        g2d.fillRect(0, 800, 900, 10);
		        //Calle
		        g2d.setColor(Color.decode("#4B4F54"));
		        g2d.fillRect(0, 810, 900, 60);
		        
		        JLabel label = new JLabel(new ImageIcon(getClass().getResource("/paquete/mario.png")));

		        
		        try {
		        BufferedImage image = ImageIO.read(new File("manzana.png"));
		        g2d.drawImage(image, 500,150, null);
		        
		    }catch(IOException e) {
		    	e.printStackTrace();
		    }
		    }
}

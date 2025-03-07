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
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dibujar extends JPanel{

	
		 public static void main(String[] args) {
		        JFrame frame = new JFrame("Dibujo en Java");
		        Dibujar panel = new Dibujar();
		        
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
		        
		        g2d.setColor(Color.decode("#1E90FF"));
		        g2d.fillRect(0, 0, 900, 800);
		        
		        g2d.setColor(Color.green);
		        g2d.fillRect(0, 700, 900, 200);
		        
		        
		        //Rejas
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(0, 600, 50, 100);
		        
		        int[] xPuntoss = {0, 50, 25};
		        int[] yPuntos = {600, 600, 550};
		        g2d.fillPolygon(xPuntoss, yPuntos, 3);
		        
		        //	Reja2
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(60, 600, 50, 100);
		        
		        int[] xReja2 = {60, 110, 85};
		        int[] yReja2s = {600, 600, 550};
		        g2d.fillPolygon(xReja2, yReja2s, 3);
		        
		        //Reja 3
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(120, 600, 50, 100);
		        
		        int[] xReja3 = {120, 170, 145};
		        int[] yReja3s = {600, 600, 550};
		        g2d.fillPolygon(xReja3, yReja3s, 3);
		        
		        //Reja4
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(180, 600, 50, 100);
		        
		        int[] xReja4 = {180, 230, 205};
		        int[] yReja4s = {600, 600, 550};
		        g2d.fillPolygon(xReja4, yReja4s, 3);
		        
		        //Reja5
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(240, 600, 50, 100);
		        
		        int[] xReja5 = {240, 290, 265};
		        int[] yReja5s = {600, 600, 550};
		        g2d.fillPolygon(xReja5, yReja5s, 3);
		        
		        
		        //Reja6
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(650, 600, 50, 100);
		        
		        int[] xReja6 = {650, 700, 675};
		        int[] yReja6s = {600, 600, 550};
		        g2d.fillPolygon(xReja6, yReja6s, 3);
		        
		        //Reja7
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(710, 600, 50, 100);
		        
		        int[] xReja7 = {710, 760, 735};
		        int[] yReja7s = {600, 600, 550};
		        g2d.fillPolygon(xReja7, yReja7s, 3);
		        
		      //Reja8
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(780, 600, 50, 100);
		        
		        int[] xReja8 = {780, 830, 805};
		        int[] yReja8s = {600, 600, 550};
		        g2d.fillPolygon(xReja8, yReja8s, 3);
		        
		      //Reja8
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(840, 600, 50, 100);
		        
		        int[] xReja9 = {840, 900, 865};
		        int[] yReja9s = {600, 600, 550};
		        g2d.fillPolygon(xReja9, yReja9s, 3);
		        
		        //Tablas
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(0, 600, 900, 10);
		        
		        g2d.setColor(Color.decode("#D2B48C"));
		        g2d.fillRect(0, 650, 900, 10);
		        
		        //Banqueta
		        g2d.setColor(Color.decode("#FFFFFF"));
		        g2d.fillRect(0, 800, 900, 10);
		        //Calle
		        g2d.setColor(Color.decode("#4B4F54"));
		        g2d.fillRect(0, 810, 900, 60);
		        
		        //Casa
		        g2d.setColor(Color.decode("#FFFF99"));
		        g2d.fillRect(250, 400, 400, 300);
		        //BaseCasa
		        g2d.setColor(Color.gray);
		        g2d.fillRect(250, 650, 400, 50);
		        
		        //Lineas de la casa
		        g2d.setColor(Color.decode("#F5DEB3")); 
		        
		        g2d.fillRect(250, 650, 400, 10);
		        
		        
		        g2d.fillRect(250, 600, 400, 10);
		        
		        
		        g2d.fillRect(250, 550, 400, 10);
		        
		        
		        g2d.fillRect(250, 500, 400, 10);
		        
		        
		        g2d.fillRect(250, 450, 400, 10);
		        
		        
		        g2d.fillRect(250, 400, 400, 10);
		        
		        //Techo
		        g2d.setColor(Color.decode("#D2B48C"));

		        int[] xPoints = {200, 700, 650, 250}; 
		        int[] yPoints = {480, 480, 380, 380}; 
		        g2d.fillPolygon(xPoints, yPoints, 4);
		       
		        //Chimenea
		        g2d.setColor(Color.decode("#8B4513")); 
		        g2d.fillRect(550, 330, 60, 100);
		        
		        g2d.setColor(Color.decode("#FFFFFF")); 
		        g2d.fillRect(550, 340, 60, 10);
		        
		        //Marco de puerta
		        g2d.setColor(Color.decode("#8B4513")); 
		        g2d.fillRect(400, 510, 100, 150); 
		        
		        //Puerta
		        g2d.setColor(Color.decode("#D2B48C")); 
		        g2d.fillRect(410, 520, 80, 130); 
		        
		       //Chapa
		        g2d.setColor(Color.white);
		        g2d.fillOval(478,580, 10, 10);
		        
		        //VentanaIzquierda
		        g2d.setColor(Color.decode("#3E2723")); 
		        g2d.fillRect(260, 500, 100, 100); 
		        //Cristal
		        g2d.setColor(Color.decode("#ADD8E6")); 
		        g2d.fillRect(270, 510, 80, 80); 
		        //Marco Vertical
		        g2d.setColor(Color.decode("#3E2723")); 
		        g2d.fillRect(305, 510, 10, 80); 
		        //MarcoHorizontal
		        g2d.setColor(Color.decode("#3E2723")); 
		        g2d.fillRect(270, 545, 80, 10); 
		        
		        
		        //VentanaDerecha
		        g2d.setColor(Color.decode("#3E2723")); 
		        g2d.fillRect(530, 500, 100, 100); 
		        //Cristal
		        g2d.setColor(Color.decode("#ADD8E6")); 
		        g2d.fillRect(540, 510, 80, 80); 
		        //Marco Vertical
		        g2d.setColor(Color.decode("#3E2723")); 
		        g2d.fillRect(575, 510, 10, 80); 
		        //MarcoHorizontal
		        g2d.setColor(Color.decode("#3E2723")); 
		        g2d.fillRect(540, 545, 80, 10); 
		       
		       
		        
		        try {
		        BufferedImage image = ImageIO.read(new File("manzana.png"));
		        g2d.drawImage(image, 500,150, null);
		        
		    }catch(IOException e) {
		    	e.printStackTrace();
		    }
		    }
}

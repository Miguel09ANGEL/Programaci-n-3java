package paquete;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class draw extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.draw3DRect(100, 100, 80, 80, true); 
        g.drawString("Hola", 150, 200); 
        
        Graphics2D g2d=(Graphics2D)g.create();
        g2d.setStroke(new BasicStroke(5));
        g2d.drawRect(100,100,80,80);
        
        g2d.setColor(Color.red);
        g2d.fillRect(320, 120, 80, 80);
        
        g2d.setColor(Color.blue);
        
        g2d.fillOval(170, 170, 50, 50);
        g2d.drawOval(180, 180, 100, 100);
        g2d.fillArc(100, 300, 200,200, 180, 180);
        g2d.setColor(Color.green);
        
        g2d.setFont( new Font("Roboto Mono",Font.BOLD,60));
        g2d.drawString("Miguel",150,200);
        
        g2d.setColor(Color.darkGray);
        g2d.drawLine(0, 0, 600,600);
        
        try {
        BufferedImage image = ImageIO.read(new File("manzana.png"));
        g2d.drawImage(image, 500,150, null);
        
    }catch(IOException e) {
    	e.printStackTrace();
    }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo en Java");
        draw panel = new draw();
        
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

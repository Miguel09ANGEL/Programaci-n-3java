package paquete;

import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class inicio extends JFrame {

    public inicio() {
    	
    	
    	
        // Configuración básica de la ventana
        setTitle("Panel Administrador");
        setSize(1024, 576);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Usamos JLayeredPane para superponer componentes
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(900, 650));
        setContentPane(layeredPane);

        // 1. PANEL BLANCO (fondo completo)
        JPanel fondoBlanco = new JPanel();
        fondoBlanco.setBackground(Color.WHITE);
        fondoBlanco.setBounds(0, 0, 1024, 576);
        layeredPane.add(fondoBlanco, JLayeredPane.DEFAULT_LAYER);

        // 2. PANEL GRIS CENTRAl
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(null);
        panelCentral.setBackground(Color.decode("#F2F2F2"));
        panelCentral.setBounds(312, 70, 380, 475); // (x, y, ancho, alto)
        layeredPane.add(panelCentral, JLayeredPane.PALETTE_LAYER);
        
       
        
        JLabel iniciar = new JLabel("PANEL ADMINISTRADOR");
		iniciar.setSize(250, 60);
		iniciar.setLocation(66, 75);
		iniciar.setHorizontalAlignment(JLabel.CENTER);
		iniciar.setFont(new Font("Calibri", Font.BOLD, 24));
		panelCentral.add(iniciar);
		
		
		
		
		JLabel correo = new JLabel("Ingresar correo:");
		correo.setHorizontalAlignment(SwingConstants.CENTER);
		correo.setFont(new Font("SansSerif", Font.BOLD, 20));
		correo.setBounds(39, 146, 158, 26);
		panelCentral.add(correo);
		
		JTextField gmail = new JTextField();
		gmail.setBackground(Color.decode("#D9D9D9"));
    	gmail.setSize(290, 30);
    	gmail.setLocation(39, 288);
    	gmail.setFont(new Font("Montserrat ",Font.BOLD,15));
    	panelCentral.add(gmail);
		
		 JLabel contraseña = new JLabel("Contraseña:");
			contraseña.setSize(116, 26);
			contraseña.setLocation(39, 263);
			contraseña.setHorizontalAlignment(JLabel.CENTER);
			contraseña.setFont(new Font("SansSerif", Font.BOLD, 20));
			panelCentral.add(contraseña);
			
			JTextField password = new JTextField();
			password.setBorder(BorderFactory.createLineBorder(Color.decode("#10A7DE")));
			password.setBackground(Color.decode("#D9D9D9"));
	    	password.setSize(290, 30);
	    	password.setLocation(39, 170);
	    	password.setFont(new Font("Montserrat ",Font.BOLD,15));
	    	panelCentral.add(password);
        
	    	
	    	JButton acceder = new JButton("Acceder");
	    	acceder.setBackground(Color.decode("#263C54")); // Color de fondo (azul oscuro)
	    	acceder.setForeground(Color.WHITE); // Color del texto (blanco)
	    	acceder.setFont(new Font("Calibri", Font.BOLD, 15));
	    	acceder.setBounds(40, 371, 289, 26); // También puedes usar setSize + setLocation si prefieres
	    	acceder.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	    	         // Abre la segunda ventana
	                dispose();  
	    	    }
	    	});
	    	panelCentral.add(acceder);

        

       

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new inicio();
        });
    }
}
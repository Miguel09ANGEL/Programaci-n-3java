package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Ventana {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		JButton btnNewButton_1 = new JButton("New button");
		
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("New button");
		panel.add(btnNewButton_13);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Ventana.class.getResource("/paquete/bart.png")));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setIcon(new ImageIcon(Ventana.class.getResource("/paquete/bart.png")));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon(Ventana.class.getResource("/paquete/bart.png")));
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("New button");
		btnNewButton_10.setIcon(new ImageIcon(Ventana.class.getResource("/paquete/bart.png")));
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setIcon(new ImageIcon(Ventana.class.getResource("/paquete/bart.png")));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setIcon(new ImageIcon(Ventana.class.getResource("/paquete/bart.png")));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setIcon(new ImageIcon(Ventana.class.getResource("/paquete/bart.png")));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("New button");
		btnNewButton_11.setIcon(new ImageIcon(Ventana.class.getResource("/paquete/bart.png")));
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		panel_1.add(btnNewButton_12);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Meorama");
		panel_2.add(lblNewLabel);
	}

}

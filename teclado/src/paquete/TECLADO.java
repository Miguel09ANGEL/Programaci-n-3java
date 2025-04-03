package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TECLADO {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TECLADO window = new TECLADO();
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
	public TECLADO() {
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
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 7;
		gbc_panel_2.insets = new Insets(0, 0, 5, 0);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{14, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridheight = 3;
		gbc_lblNewLabel.gridwidth = 26;
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 6;
		gbc_panel_1.gridwidth = 7;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		panel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(3, 8, 0, 0));
		
		JButton btnNewButton_21 = new JButton("Q");
		panel_1.add(btnNewButton_21);
		
		JButton btnNewButton_24 = new JButton("W");
		panel_1.add(btnNewButton_24);
		
		JButton btnNewButton_18 = new JButton("E");
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_1 = new JButton("R");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("T");
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Y");
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("U");
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("I");
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_2 = new JButton("O");
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_15 = new JButton("P");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_15);
		
		JButton btnNewButton_25 = new JButton("A");
		panel_1.add(btnNewButton_25);
		
		JButton btnNewButton_22 = new JButton("S");
		panel_1.add(btnNewButton_22);
		
		JButton btnNewButton = new JButton("D");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("F");
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("G");
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_12 = new JButton("H");
		panel_1.add(btnNewButton_12);
		
		JButton btnNewButton_8 = new JButton("J");
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("K");
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("L");
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_23 = new JButton("Ñ");
		panel_1.add(btnNewButton_23);
		
		JButton btnNewButton_26 = new JButton("Z");
		panel_1.add(btnNewButton_26);
		
		JButton btnNewButton_13 = new JButton("X");
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("C");
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_16 = new JButton("V");
		panel_1.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("B");
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_19 = new JButton("N");
		panel_1.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("M");
		panel_1.add(btnNewButton_20);
	}

}

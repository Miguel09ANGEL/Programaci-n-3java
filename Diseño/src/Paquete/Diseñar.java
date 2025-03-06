package Paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.ScrollPane;
import javax.swing.JInternalFrame;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Label;
import javax.swing.ImageIcon;
import java.awt.Scrollbar;
import java.awt.TextField;
import javax.swing.JComboBox;

public class Diseñar {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseñar window = new Diseñar();
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
	public Diseñar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 0));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registro de Usuarios");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 255, 255));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(9, 3, 5, 5));
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		panel_3.add(lblNewLabel_2);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido Paterno");
		panel_3.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Materno");
		panel_3.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha de Nacimiento:");
		panel_3.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		panel_3.add(lblNewLabel_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		rdbtnNewRadioButton.setBackground(new Color(128, 255, 255));
		panel_3.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_7 = new JLabel("");
		panel_3.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mujer");
		rdbtnNewRadioButton_1.setBackground(new Color(128, 255, 255));
		panel_3.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("Nacionalidad:");
		panel_3.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar foto de Perfil");
		chckbxNewCheckBox_1.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox_1.setBounds(21, 141, 161, 56);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar fecha de Nacimiento");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox.setBounds(21, 184, 171, 56);
		panel_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Miguel Àngel Garcia\\Downloads\\descarga (12).jpeg"));
		lblNewLabel_8.setBounds(47, 11, 140, 134);
		panel_1.add(lblNewLabel_8);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 128, 128));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 255, 255));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 1, 40, 20));
		
		JButton btnNewButton_2 = new JButton("Nuevo");
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Salir");
		panel_4.add(btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

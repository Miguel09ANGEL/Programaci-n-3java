package paquete;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TECLADO {

    private JFrame frame;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                TECLADO window = new TECLADO();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public TECLADO() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new BorderLayout());
        
        textField = new JTextField();
        textField.setEditable(false);
        frame.getContentPane().add(textField, BorderLayout.NORTH);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(new GridLayout(3, 8));
        frame.getContentPane().add(panel_1, BorderLayout.CENTER);
        
        JPanel panel_2 = new JPanel();
        frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
        panel_2.setLayout(new GridLayout(1, 2));
        
        JButton btnEspacio = new JButton("Espacio");
        btnEspacio.addActionListener(new KeyListener());
        panel_2.add(btnEspacio);
        
        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.addActionListener(new KeyListener());
        panel_2.add(btnBorrar);
        
        String[] keys = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P",
                         "A", "S", "D", "F", "G", "H", "J", "K", "L", "Ñ",
                         "Z", "X", "C", "V", "B", "N", "M"};
        
        for (String key : keys) {
            JButton button = new JButton(key);
            button.addActionListener(new KeyListener());
            panel_1.add(button);
        }
    }
    
    private class KeyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Espacio")) {
                textField.setText(textField.getText() + " ");
            } else if (command.equals("Borrar")) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    textField.setText(text.substring(0, text.length() - 1));
                }
            } else {
                textField.setText(textField.getText() + command);
            }
        }
    }
}

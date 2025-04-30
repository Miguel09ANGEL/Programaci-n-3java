package paquete;

import javax.swing.*;
import java.awt.*;

public class AuthView extends JFrame {
    public JTextField emailField;
    public JPasswordField passwordField;
    public JButton loginButton;
    public JLabel messageLabel;

    public AuthView() {
        this.setTitle("LOGIN");
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.decode("#48cae4"));

        JLabel titleLabel = new JLabel("Bienvenido");
        titleLabel.setBounds(150, 30, 200, 30);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setFont(new Font("American Typewriter", Font.BOLD, 24));
        panel.add(titleLabel);

        JLabel emailLabel = new JLabel("Ingrese su email:");
        emailLabel.setBounds(40, 130, 200, 30);
        emailLabel.setFont(new Font("American Typewriter", Font.BOLD, 18));
        panel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(40, 160, 300, 30);
        emailField.setFont(new Font("American Typewriter", Font.PLAIN, 16));
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("Ingrese su contraseña:");
        passwordLabel.setBounds(40, 200, 300, 30);
        passwordLabel.setFont(new Font("American Typewriter", Font.BOLD, 18));
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(40, 230, 300, 30);
        passwordField.setFont(new Font("American Typewriter", Font.PLAIN, 16));
        panel.add(passwordField);

        loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(40, 280, 150, 30);
        panel.add(loginButton);

        messageLabel = new JLabel("");
        messageLabel.setBounds(40, 320, 300, 30);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 14));
        messageLabel.setForeground(Color.RED);
        panel.add(messageLabel);

        this.add(panel);
    }
}

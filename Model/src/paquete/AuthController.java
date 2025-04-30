package paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthController {
    private AuthModel model;
    private AuthView view;

    public AuthController(AuthModel model, AuthView view) {
        this.model = model;
        this.view = view;

        this.view.loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = view.emailField.getText();
                String password = new String(view.passwordField.getPassword());

                if (model.login(email, password)) {
                    view.messageLabel.setText("Inicio de sesión exitoso");
                    view.messageLabel.setForeground(java.awt.Color.GREEN);
                } else {
                    view.messageLabel.setText("Credenciales incorrectas");
                    view.messageLabel.setForeground(java.awt.Color.RED);
                }
            }
        });

        this.view.setVisible(true);
    }
}

package paquete;

public class AuthModel {
    public boolean login(String email, String password) {
        // Aquí se puede implementar la lógica de autenticación real
        // Por ahora: solo un usuario de prueba
        return email.equals("usuario@correo.com") && password.equals("1234");
    }
}

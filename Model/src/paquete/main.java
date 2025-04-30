package paquete;

public class main {
    public static void main(String[] args) {
        AuthModel model = new AuthModel();
        AuthView view = new AuthView();
        new AuthController(model, view);
    }
}

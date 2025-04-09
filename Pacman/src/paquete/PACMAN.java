package paquete;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PACMAN extends JFrame implements KeyListener {
    private int x = 200, y = 200;
    private final int SIZE = 40;
    private final int STEP = 10;
    private final JPanel panel;

    public PACMAN() {
        setTitle("Pac-Man Simple");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                setBackground(Color.BLACK);
                g.setColor(Color.YELLOW);
                g.fillOval(x, y, SIZE, SIZE);
            }
        };

        panel.setFocusable(true);
        panel.addKeyListener(this);
        add(panel);
        setVisible(true);
    }

    // Movimiento con W A S D
    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();

        if (tecla == KeyEvent.VK_W && y - STEP >= 0) y -= STEP;
        if (tecla == KeyEvent.VK_S && y + STEP + SIZE <= panel.getHeight()) y += STEP;
        if (tecla == KeyEvent.VK_A && x - STEP >= 0) x -= STEP;
        if (tecla == KeyEvent.VK_D && x + STEP + SIZE <= panel.getWidth()) x += STEP;

        panel.repaint();
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PACMAN());
    }
}

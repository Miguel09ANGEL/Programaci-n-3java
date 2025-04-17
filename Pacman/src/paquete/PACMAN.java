package paquete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PACMAN implements KeyListener {

    private JFrame frame;
    private DrawingPanel tablero;
    private int x = 200, y = 100;
    private int LastPress = 0;
    private ColisionDetector colisionDetector;
    private JLabel tiempoTranscurridoLabel;
    private double tiempoTranscurrido = 0;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                PACMAN window = new PACMAN();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public PACMAN() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(109, 89, 213));
        frame.getContentPane().add(panel, BorderLayout.NORTH);

        JPanel footer = new JPanel();
        footer.setBackground(new Color(109, 89, 213));
        frame.getContentPane().add(footer, BorderLayout.SOUTH);

        tablero = new DrawingPanel();
        tablero.setBackground(Color.BLACK);
        frame.getContentPane().add(tablero, BorderLayout.CENTER);

        tablero.addKeyListener(this);
        tablero.setFocusable(true);

        JButton reiniciar = new JButton("Reiniciar");
        reiniciar.addActionListener(e -> {
            x = 300;
            y = 200;
            tiempoTranscurrido = 0;
            tiempoTranscurridoLabel.setText("Tiempo: 0.00s");
            tablero.repaint();
            tablero.requestFocus();
        });
        footer.add(reiniciar);

        tiempoTranscurridoLabel = new JLabel("Tiempo: 0.00s");
        tiempoTranscurridoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        footer.add(tiempoTranscurridoLabel);

        new Timer(10, e -> {
            update();
            tiempoTranscurrido += 0.01;
            tiempoTranscurridoLabel.setText("Tiempo: " + String.format("%.2f", tiempoTranscurrido) + "s");
        }).start();

        colisionDetector = new ColisionDetector();
    }

    class DrawingPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(Color.YELLOW);
            g2d.fillOval(x, y, 40, 40);

            colisionDetector.dibujarParedes(g2d);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        LastPress = e.getExtendedKeyCode();
        update();
    }

    public void update() {
        int newX = x;
        int newY = y;

        if (LastPress == KeyEvent.VK_W) newY -= 5;
        if (LastPress == KeyEvent.VK_S) newY += 5;
        if (LastPress == KeyEvent.VK_A) newX -= 5;
        if (LastPress == KeyEvent.VK_D) newX += 5;

        if (newX < -25) newX = 445;
        if (newX >= 445) newX = -25;
        if (newY < -25) newY = 525;
        if (newY >= 525) newY = -25;

        colisionDetector.actualizarPacMan(newX, newY);

        if (!colisionDetector.detectarColision()) {
            x = newX;
            y = newY;
            tablero.repaint();
        } else {
            System.out.println("¡Colisión detectada!");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    class ColisionDetector {
        private int pacManX, pacManY, pacManW = 40, pacManH = 40;
        private final int[][] paredes = {
            {70, 350, 280, 9}, {0, 0, 450, 9}, {0, 70, 450, 9},
            {0, 140, 70, 9}, {140, 140, 150, 9}, {0, 190, 70, 9}, {350, 190, 90, 9},
            {0, 260, 70, 9}, {140, 260, 149, 9}, {350, 260, 90, 9}, {70, 420, 350, 9},
            {0, 500, 450, 9}, {0, 0, 9, 190}, {0, 260, 9, 260}, {140, 190, 9, 70},
            {210, 0, 9, 70}, {210, 260, 9, 90}, {280, 190, 9, 70}, {425, 0, 9, 190}, {425, 260, 9, 260}
        };

        public void actualizarPacMan(int x, int y) {
            pacManX = x;
            pacManY = y;
        }

        public boolean detectarColision() {
            for (int[] pared : paredes) {
                int px = pared[0], py = pared[1], pw = pared[2], ph = pared[3];
                if (pacManX < px + pw && pacManX + pacManW > px &&
                    pacManY < py + ph && pacManY + pacManH > py) {
                    return true;
                }
            }
            return false;
        }

        public void dibujarParedes(Graphics2D g2d) {
            g2d.setColor(Color.BLUE);
            for (int[] pared : paredes) {
                g2d.fillRect(pared[0], pared[1], pared[2], pared[3]);
            }
        }
    }
} 

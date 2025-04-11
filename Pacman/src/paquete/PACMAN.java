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
import java.awt.BasicStroke;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class PACMAN implements KeyListener{

	private JFrame frame;
	private DrawingPanel tablero;
	private int x= 200, y= 100;
	private int LastPress =0;
	private ColisionDetector colisionDetector;
	private JLabel tiempoTranscurridoLabel;
	private double tiempoTranscurrido=0;
	private Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PACMAN window = new PACMAN();
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
	public PACMAN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(109, 89 , 213));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(109,89,213));
		frame.getContentPane().add(footer, BorderLayout.SOUTH);
		
		
		tablero = new DrawingPanel();
		tablero.setBackground(new Color(0,0,0));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		
		tablero.addKeyListener(this);
		tablero.setFocusable(true);
		
		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				x= 300;
				y= 200;
				
				
				tiempoTranscurrido = 0;
				
				tiempoTranscurridoLabel.setText("Tiempo: 0.00s");
				
				
				
				tablero.repaint();
				
				tablero.requestFocus();
				
			}
			
			
		});
		footer.add(reiniciar);
		
		tiempoTranscurridoLabel = new JLabel("Tiempo: 0.00s");
		tiempoTranscurridoLabel.setFont(new Font("Arial", Font.BOLD, 16));
		footer.add(tiempoTranscurridoLabel);
		
		
		int delay = 10; //milliseconds
		ActionListener taskPerformer= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				update();
				tiempoTranscurrido += 0.01;
				tiempoTranscurridoLabel.setText("Tiempo: " + String.format("%.2f", tiempoTranscurrido)+ "s");
			}
		};
		new Timer(delay, taskPerformer).start();
		
		colisionDetector = new ColisionDetector(x, y, 30, 30);

	}
	
	class DrawingPanel extends JPanel {
		public DrawingPanel() {
			setBackground(Color.WHITE);
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			
			g2d.setColor(Color.yellow);
			g2d.fillOval(x,y,40,40);
			
		
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		LastPress = e.getExtendedKeyCode();;
		update();
	    
		}
	public void update(){
		

		colisionDetector.actualizarPacMan(x, y);
	    if (colisionDetector.detectarColision()) {
	        System.out.println("Colisión detectada!");
	        
	        if (LastPress == 87) {
	            y += 5;
	        } else if (LastPress == 83) {
	            y -= 5;
	        } else if (LastPress == 65) {
	            x += 5;
	        } else if (LastPress == 68) {
	            x -= 5;
	        }
	    } else {
	        if (LastPress == 87) {
	            y -= 5;
	            if (y < -25) {
	                y = 525;
	            }
	        }
	        if (LastPress == 83) {
	            y += 5;
	            if (y >= 525) {
	                y = -25;
	            }
	        }
	        if (LastPress == 65) {
	            x -= 5;
	            if (x < -25) {
	                x = 445;
	            }
	        }
	        if (LastPress == 68) {
	            x += 5;
	            if (x >= 445) {
	                x = -25;
	            }
	       }
	        
	        tablero.repaint();
	    }
	    
	
    }
	
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	class ColisionDetector {
		private int pacManX, pacManY, pacManW, pacManH;
	    private int paredX, paredY, paredW, paredH;
	    private int pared2X, pared2Y, pared2W, pared2H;


        public ColisionDetector(int pacManX, int pacManY, int pacManW, int pacManH) {
            this.pacManX = pacManX;
            this.pacManY = pacManY;
            this.pacManW = pacManW;
            this.pacManH = pacManH;
            paredX = 120;
            paredY = 89;
            paredW = 90;
            paredH = 9;
            pared2X = 120;
            pared2Y = 450;
            pared2W = 90;
            pared2H = 9;

        }
        
        public void actualizarPacMan(int x, int y) {
            pacManX = x;
            pacManY = y;
        }

        public boolean detectarColision() {
            if ((pacManX < paredX + paredW &&
                 pacManX + pacManW > paredX &&
                 pacManY < paredY + paredH &&
                 pacManY + pacManH > paredY) ||
                (pacManX < pared2X + pared2W &&
                 pacManX + pacManW > pared2X &&
                 pacManY < pared2Y + pared2H &&
                 pacManY + pacManH > pared2Y)) {
                return true;
            }
            return false;
        }

        public void dibujarParedes(Graphics2D g2d) {
            g2d.setColor(Color.BLUE);
            g2d.fillRect(paredX, paredY, paredW, paredH);
            g2d.fillRect(pared2X, pared2Y, pared2W, pared2H);
        }
    }

        


	}
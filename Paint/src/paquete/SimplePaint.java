package paquete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SimplePaint extends JFrame {
    private DrawPanel drawPanel;
    private Color selectedColor = Color.BLACK;
    private int brushSize = 5;
    private String selectedTool = "Brush";

    public SimplePaint() {
        setTitle("Simple Paint");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);
        
        JPanel toolsPanel = new JPanel();
        String[] tools = {"Brush", "Eraser", "Rectangle", "Circle", "Line"};
        JComboBox<String> toolSelector = new JComboBox<>(tools);
        toolSelector.addActionListener(e -> selectedTool = (String) toolSelector.getSelectedItem());
        
        JSlider sizeSlider = new JSlider(1, 20, 5);
        sizeSlider.addChangeListener(e -> brushSize = sizeSlider.getValue());
        
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> drawPanel.clear());
        
        toolsPanel.add(toolSelector);
        toolsPanel.add(new JLabel("Size:"));
        toolsPanel.add(sizeSlider);
        toolsPanel.add(clearButton);
        add(toolsPanel, BorderLayout.NORTH);
        
        JPanel colorPanel = new JPanel();
        Color[] colors = {Color.BLACK, Color.WHITE, Color.GRAY, Color.BLUE, Color.RED, Color.GREEN};
        for (Color color : colors) {
            JButton colorButton = new JButton();
            colorButton.setBackground(color);
            colorButton.setPreferredSize(new Dimension(30, 30));
            colorButton.addActionListener(e -> selectedColor = color);
            colorPanel.add(colorButton);
        }
        add(colorPanel, BorderLayout.SOUTH);
    }
    
    private class DrawPanel extends JPanel {
        private ArrayList<Shape> shapes = new ArrayList<>();
        private Point startPoint;
        
        public DrawPanel() {
            setBackground(Color.WHITE);
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    startPoint = e.getPoint();
                }
                public void mouseReleased(MouseEvent e) {
                    Point endPoint = e.getPoint();
                    if (selectedTool.equals("Rectangle")) {
                        shapes.add(new RectangleShape(startPoint, endPoint, selectedColor, brushSize));
                    } else if (selectedTool.equals("Circle")) {
                        shapes.add(new CircleShape(startPoint, endPoint, selectedColor, brushSize));
                    } else if (selectedTool.equals("Line")) {
                        shapes.add(new LineShape(startPoint, endPoint, selectedColor, brushSize));
                    }
                    repaint();
                }
            });
            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    if (selectedTool.equals("Brush") || selectedTool.equals("Eraser")) {
                        shapes.add(new LineShape(startPoint, e.getPoint(), selectedTool.equals("Eraser") ? Color.WHITE : selectedColor, brushSize));
                        startPoint = e.getPoint();
                        repaint();
                    }
                }
            });
        }
        
        public void clear() {
            shapes.clear();
            repaint();
        }
        
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Shape shape : shapes) {
                shape.draw(g);
            }
        }
    }
    
    interface Shape {
        void draw(Graphics g);
    }
    
    class RectangleShape implements Shape {
        private int x, y, width, height;
        private Color color;
        private int thickness;
        
        public RectangleShape(Point start, Point end, Color color, int thickness) {
            this.x = Math.min(start.x, end.x);
            this.y = Math.min(start.y, end.y);
            this.width = Math.abs(start.x - end.x);
            this.height = Math.abs(start.y - end.y);
            this.color = color;
            this.thickness = thickness;
        }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.drawRect(x, y, width, height);
        }
    }
    
    class CircleShape implements Shape {
        private int x, y, diameter;
        private Color color;
        private int thickness;
        
        public CircleShape(Point start, Point end, Color color, int thickness) {
            this.x = Math.min(start.x, end.x);
            this.y = Math.min(start.y, end.y);
            this.diameter = Math.max(Math.abs(start.x - end.x), Math.abs(start.y - end.y));
            this.color = color;
            this.thickness = thickness;
        }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.drawOval(x, y, diameter, diameter);
        }
    }
    
    class LineShape implements Shape {
        private int x1, y1, x2, y2;
        private Color color;
        private int thickness;
        
        public LineShape(Point start, Point end, Color color, int thickness) {
            this.x1 = start.x;
            this.y1 = start.y;
            this.x2 = end.x;
            this.y2 = end.y;
            this.color = color;
            this.thickness = thickness;
        }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.drawLine(x1, y1, x2, y2);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimplePaint().setVisible(true));
    }
}

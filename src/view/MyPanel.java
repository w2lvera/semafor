
package view;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observer;
import javax.swing.JPanel;


public class MyPanel extends JPanel implements Observer{
    Controller controller;

    public MyPanel(Controller controller) {
        this.controller = controller;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        controller.draw(g);
//         this.setBackground(Color.black );
//         super.paintComponent(g);
//         g.setColor(Color.red);
//         int x = -88, y = -88;
//         g.fillOval(165 + x, 100 + y, -2 * x, -2 * y);
//         g.setColor(Color.yellow);
//         g.fillOval(165 + x, 285 + y, -2 * x, -2 * y);
//         g.setColor(Color.green);
//         g.fillOval(165 + x, 470 + y, -2 * x, -2 * y);
     
    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        repaint();
    }
    
}


package view;

import graphicsModel.GraphicsModel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import semafor.StateSemaphor;

public class Controller {
    GraphicsModel model;
    StateSemaphor semaphor;
    MyPanel panel ;
    MyFrame frame;
   
    private static Controller controller = null;

    public void draw(Graphics g) {
        model.paint( g);
        //this.setBackground(Color.black );
//         g.setColor(Color.red);
//         int x = -88, y = -88;
//         g.fillOval(165 + x, 100 + y, -2 * x, -2 * y);
//         g.setColor(Color.yellow);
//         g.fillOval(165 + x, 285 + y, -2 * x, -2 * y);
//         g.setColor(Color.green);
//         g.fillOval(165 + x, 470 + y, -2 * x, -2 * y);
    }

    private Controller() {
       panel = new MyPanel(this);
       model = new GraphicsModel();
       model.addObserver(panel);
       semaphor = new StateSemaphor(model);
       
       frame = new MyFrame(panel);
       
    }   
    
    public static Controller getIntance(){
        if (controller == null) { controller = new Controller();
            
        }
        return controller;
        
    }
    public void start(){
        for (int i = 0; i < 20; i++) {
            semaphor.changeState();
           // System.out.println(semaphor.state.print().toString());
            
        }
    }

   
}
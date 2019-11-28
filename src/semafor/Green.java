package semafor;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import static semafor.ColorEnum.GreenTYellowRed;
import view.Controller;

public class Green implements ChangeColor{

    StateSemaphor semaphor;
    ColorEnum colorEnum;
   public Green(StateSemaphor semaphor) {
        this.semaphor = semaphor;
    }
    @Override
    public void changeColor() {
        semaphor.oldState = semaphor.green;
        semaphor.state = semaphor.yellow;
        semaphor.colorEnum=GreenTYellowRed;
        try {
            Thread.sleep(semaphor.time*100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Green.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    @Override
    public ColorEnum print() {
       return semaphor.colorEnum;
    }    

    @Override
    public void printColor(Graphics g) {
         g.setColor(Color.white);
         int x = -88, y = -88;
         g.fillOval(165 + x, 100 + y, -2 * x, -2 * y);
         g.setColor(Color.white);
         g.fillOval(165 + x, 285 + y, -2 * x, -2 * y);
         g.setColor(Color.green);
         g.fillOval(165 + x, 470 + y, -2 * x, -2 * y);
    }
    
}

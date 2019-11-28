package semafor;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import static semafor.ColorEnum.GreenTYellowRed;

public class Red implements ChangeColor{

    StateSemaphor stateSemaphor;
    ColorEnum colorEnum;
   public Red(StateSemaphor stateSemaphor) {
        this.stateSemaphor = stateSemaphor ;
    }
    @Override
    public void changeColor() {
        stateSemaphor.oldState = stateSemaphor.red;
        stateSemaphor.state = stateSemaphor.yellow;
        stateSemaphor.colorEnum = GreenTYellowRed;
        try {
            Thread.sleep(stateSemaphor.time*100);
        } 
        catch (InterruptedException ex) {
            Logger.getLogger(Green.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    @Override
    public ColorEnum print() {
       return stateSemaphor.colorEnum;
    }    

    @Override
    public void printColor(Graphics g) {
         g.setColor(Color.red);
         int x = -88, y = -88;
         g.fillOval(165 + x, 100 + y, -2 * x, -2 * y);
         g.setColor(Color.yellow);
         g.fillOval(165 + x, 285 + y, -2 * x, -2 * y);
         g.setColor(Color.green);
         g.fillOval(165 + x, 470 + y, -2 * x, -2 * y);
    }
}
package semafor;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import static semafor.ColorEnum.GreenYellowTRed;
import static semafor.ColorEnum.TGreenYellowRed;

public class Yellow implements ChangeColor{

    StateSemaphor semaphor;
     
   public Yellow(StateSemaphor semaphor) {
        this.semaphor = semaphor ;
    }
    @Override
    public void changeColor() {
        if (semaphor.oldState == semaphor.red) 
        {
        semaphor.state = semaphor.green;
        semaphor.oldState = semaphor.yellow;  
        semaphor.colorEnum = TGreenYellowRed;
        }
        else
        {
            semaphor.state = semaphor.red;
            semaphor.oldState = semaphor.yellow;
            semaphor.colorEnum = GreenYellowTRed;
        }
        try {
            Thread.sleep(semaphor.time*100);
        } 
        catch (InterruptedException ex) {
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
         g.setColor(Color.yellow);
         g.fillOval(165 + x, 285 + y, -2 * x, -2 * y);
         g.setColor(Color.white);
         g.fillOval(165 + x, 470 + y, -2 * x, -2 * y);
    }
}
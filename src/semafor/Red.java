package semafor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Red implements ChangeColor{

    StateSemaphor stateSemaphor;

   public Red(StateSemaphor stateSemaphor) {
        this.stateSemaphor = stateSemaphor ;
    }
    @Override
    public void changeColor() {
        stateSemaphor.oldState = stateSemaphor.red;
        stateSemaphor.state = stateSemaphor.yellow;
        try {
            Thread.sleep(stateSemaphor.time*100);
        } 
        catch (InterruptedException ex) {
            Logger.getLogger(Green.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    @Override
    public void print() {
        System.out.println("Red");
    }    
}
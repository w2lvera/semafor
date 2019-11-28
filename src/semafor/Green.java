package semafor;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Green implements ChangeColor{

    StateSemaphor semaphor;

   public Green(StateSemaphor semaphor) {
        this.semaphor = semaphor;
    }
    @Override
    public void changeColor() {
        semaphor.oldState = semaphor.green;
        semaphor.state = semaphor.yellow;
        try {
            Thread.sleep(semaphor.time*100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Green.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    @Override
    public void print() {
        System.out.println("Green");
    }
    
}

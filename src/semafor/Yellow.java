package semafor;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        }
        else
        {
            semaphor.state = semaphor.red;
            semaphor.oldState = semaphor.yellow;
        }
        try {
            Thread.sleep(semaphor.time*100);
        } 
        catch (InterruptedException ex) {
            Logger.getLogger(Green.class.getName()).log(Level.SEVERE,null,ex);
        }
    }

    @Override
    public void print() {
        System.out.println("Yellow");
    }    
}
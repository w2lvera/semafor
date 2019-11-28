package semafor;

import view.Controller;

public class Semafor {

    
    public static void main(String[] args) {
        Controller c = Controller.getIntance();
        c.start();
//        StateSemaphor semaphor = new StateSemaphor();
//        for (int i = 0; i < 10; i++) {
//            semaphor.changeState();
//            semaphor.state.print();
//        }
    }
    
}

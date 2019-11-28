package semafor;

public class Semafor {

    
    public static void main(String[] args) {
        StateSemaphor semaphor = new StateSemaphor();
        for (int i = 0; i < 10; i++) {
            semaphor.changeState();
            semaphor.state.print();
        }
    }
    
}

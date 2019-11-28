package semafor;

public class StateSemaphor {
    ChangeColor green;
    ChangeColor red;
    ChangeColor yellow;
    ChangeColor state;
    ChangeColor oldState;
    int time;

    public StateSemaphor() {
        green = new Green(this);
        red = new Red(this);
        yellow = new Yellow(this);
        state = green;
        oldState = green;
        time = 10;
    }
    void changeState()
    {
        state.changeColor();
    }
    
}

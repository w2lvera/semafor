package semafor;

import graphicsModel.GraphicsModel;

public class StateSemaphor {
    ChangeColor green;
    ChangeColor red;
    ChangeColor yellow;
    ChangeColor state;
    ChangeColor oldState;
    GraphicsModel gm;
    ColorEnum colorEnum;
    int time;

    public StateSemaphor(GraphicsModel model) {
        green = new Green(this);
        red = new Red(this);
        yellow = new Yellow(this);
        state = green;
        oldState = green;
        time = 10;
        gm = model;
        colorEnum = ColorEnum.TGreenYellowRed;
    }
    public void changeState()
    {
        state.changeColor();
        ColorEnum c = state.print();
        gm.setColor(c);
        
    }
   
    
}

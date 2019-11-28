/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyPanel myPanel;
    
    public MyFrame(MyPanel myPanel) {
        this.myPanel = myPanel;  
        add(this.myPanel);    
        this.setSize(350, 610);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }   

   
}

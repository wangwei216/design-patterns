package four_project.project01_commandpattern.view;


import javax.swing.*;
import java.awt.*;

public class BarView extends JPanel {

    Color color;
    public BarView(Color color){
        this.color= color;
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(color);
        g.fillRect(5,0,30,5);

    }


}

package four_project.project01_commandpattern.view;

import javax.swing.*;
import java.awt.*;

public class LightView extends JPanel implements Observer {

    boolean on;
    public LightView() {
        this.on = false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (on) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLACK);
        }
        g.fillOval(5, 5, 30, 30);
    }

    @Override
    public void update(boolean on) {
        this.on = on;
        this.repaint();
    }
}

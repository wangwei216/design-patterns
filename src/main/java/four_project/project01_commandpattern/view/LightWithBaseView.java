package four_project.project01_commandpattern.view;

import java.awt.*;

public class LightWithBaseView extends Decorator {

    public LightWithBaseView(Color color,LightView lightView) {
        super(lightView);
        this.setLayout(new BorderLayout());
        this.add("Center",this.lightView);
        this.add("South",new BarView(color));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    public void update(boolean on){
        lightView.update(on);
    }
}

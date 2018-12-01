package four_project.project01_commandpattern.view;



public abstract class Decorator extends LightView {

    protected LightView lightView;
    public Decorator(LightView lightView){
        this.lightView=lightView;
    }


}

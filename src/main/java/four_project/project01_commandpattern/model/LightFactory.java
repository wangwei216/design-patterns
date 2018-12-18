package four_project.project01_commandpattern.model;

public class LightFactory implements AbstractLightFactory {

    @Override
    public Light creatLight() {
        return  new Light();
    }
}

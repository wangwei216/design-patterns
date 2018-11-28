package four_project.project01_commandpattern.model;


import four_project.project01_commandpattern.view.Observer;

public class Light extends Subject{

    boolean on;

    public Light() {
        this.on = false;
    }

    void on() {
        this.on = true;
        System.out.println("打开灯");
        notifyAllObservers();
    }

    void off() {
        this.on = false;
        System.out.println("关闭灯");
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer o: observers) {
            o.update(on);
        }
    }

}

package four_project.project01_commandpattern.controller;

import four_project.project01_commandpattern.model.*;
import four_project.project01_commandpattern.view.LightView;
import four_project.project01_commandpattern.view.LightWithBaseView;

import java.awt.*;


public class Controller {

    Light[] lights = new Light[7];
    LightView[] lightViews = new LightView[7];
    RemoteControl remoteControl;
    Command[] onCommands = new LightOnCommand[7];
    Command[] offCommands = new LightOffCommand[7];

    public Controller() {
        remoteControl = new RemoteControl();
        for (int i = 0; i < 7; i++) {
            lights[i] = new Light();
            lightViews[i] = new LightView();
            //这里需要子啊构造的时候新加一个底座
            LightView lightView = new LightView();
            lightViews[i] = new LightWithBaseView(Color.PINK,lightView);

            onCommands[i] = new LightOnCommand(lights[i]);
            offCommands[i] = new LightOffCommand(lights[i]);
            remoteControl.setCommand(i, onCommands[i], offCommands[i]);
            lights[i].addObserver(lightViews[i]);
        }

    }

    public Light getLights(int i) {
        return lights[i];
    }

    public LightView getLightViews(int i) {
        return lightViews[i];
    }

    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    public void onButtonPressed(int i) {
        remoteControl.onButtonWasPushed(i);
    }

    public void offButtonPressed(int i) {
        remoteControl.offButtonWasPushed(i);
    }

    public void undo() {
        remoteControl.undo();
    }

    public void turnOnAll(){
        for (int i=0 ;i<7;i++){
            remoteControl.onButtonWasPushed(i);
        }
    }

    public void turnOffAll(){
        for (int i=0 ;i<7;i++){
            remoteControl.offButtonWasPushed(i);
        }
    }
}

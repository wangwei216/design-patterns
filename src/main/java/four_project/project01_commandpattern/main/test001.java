package four_project.project01_commandpattern.main;

import four_project.project01_commandpattern.controller.Controller;
import four_project.project01_commandpattern.model.Light;
import four_project.project01_commandpattern.model.LightFactory;
import four_project.project01_commandpattern.view.LightView;
import four_project.project01_commandpattern.view.MainView;

import javax.swing.*;
import java.awt.*;

public class test001 {



    public static void main(String[] args){

        LightFactory lightFactory = new LightFactory();
        Light light = lightFactory.creatLight();
        System.out.println(light.toString());

    }



}

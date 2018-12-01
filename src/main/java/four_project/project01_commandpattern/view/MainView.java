package four_project.project01_commandpattern.view;

import four_project.project01_commandpattern.controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView {

    JPanel view;
    JButton[][] buttons = new JButton[7][2];
    JButton[] btnAlls = new JButton[2];
    JButton buttonUndo;
    Controller controller;

    public MainView() {

        controller = new Controller();
        for (int i = 0; i < 7; i++) {
            buttons[i][0] = new JButton("on");
            buttons[i][1] = new JButton("off");
            buttons[i][0].addActionListener(new ButtonClick(i));
            buttons[i][1].addActionListener(new ButtonClick(i));
        }
        buttonUndo = new JButton("Undo");
        buttonUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.getRemoteControl().undo();
            }
        });

        btnAlls[0] = new JButton("TurnOnAll");
        btnAlls[1] = new JButton("TurnOffAll");

        btnAlls[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.turnOnAll();
            }
        });
        btnAlls[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.turnOffAll();
            }
        });
        //化界面
        view = new JPanel();
        this.view.setLayout(new BorderLayout());
        JPanel upperView = new JPanel();
        upperView.setLayout(new GridLayout(7, 3));
        for (int i = 0; i < 7; i++) {
            upperView.add(controller.getLightViews(i));
            upperView.add(buttons[i][0]);
            upperView.add(buttons[i][1]);
        }
        //添加到界面当中
        JPanel topView = new JPanel();
        topView.setLayout(new GridLayout(1,2));
        for (int i=0;i<2;i++){
            topView.add(btnAlls[i]);
        }
        this.view.add("North",topView)  ;
        this.view.add("Center", upperView);
        this.view.add("South", buttonUndo);

    }

    public class ButtonClick implements ActionListener {

        int i;
        public ButtonClick(int i) {
            this.i = i;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttons[i][0]) {
                controller.onButtonPressed(i);
            } else if (e.getSource() == buttons[i][1]) {
                controller.offButtonPressed(i);
            }
        }
    }

    public JPanel getView() {
        return view;
    }


}

package four_project.project01_commandpattern.main;

import javax.swing.JFrame;

import four_project.project01_commandpattern.view.MainView;


public class Test {
	JFrame frame=new JFrame();

	public Test(){
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MainView().getView());
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test();
	}

}

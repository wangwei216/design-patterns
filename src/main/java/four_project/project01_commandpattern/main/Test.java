package four_project.project01_commandpattern.main;

import javax.swing.JFrame;

import four_project.project01_commandpattern.view.MainView;


public class Test {

	//现在已经有的：命令模式、MVC模式、装饰者模式、观察者模式、门面模式
	//再添加的模式：抽象工厂模式、

	JFrame frame=new JFrame();

	public Test(){
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MainView().getView());
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Test();
	}

}


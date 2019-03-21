package com.github.drinkjava2.frog.env;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Application will build env, frogs and let them run
 */
public class Application {
	/** SHOW first frog's brain structure */
	public static boolean SHOW_FIRST_FROG_BRAIN = false;
	public static final String CLASSPATH;

	static {
		String classpath = new File("").getAbsolutePath();
		int core = classpath.indexOf("core");
		CLASSPATH = classpath.substring(0, core);
	}
	public static JFrame mainFrame = new JFrame();
	public static Env env = new Env();
	public static BrainStructure brainStructure = new BrainStructure();

	public static void main(String[] args) throws InterruptedException {
		mainFrame.setLayout(null);
		if (SHOW_FIRST_FROG_BRAIN)
			mainFrame.setSize(1320, 840); // 窗口大小
		else
			mainFrame.setSize(550, 550); // 窗口大小
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭时退出程序
		mainFrame.add(env);

		mainFrame.add(brainStructure);

		JButton button = new JButton("Show first frog's brain");
		button.setVisible(true);
		button.setLayout(null);// 空布局
		button.setBounds(150, 450, 180, 30);
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				SHOW_FIRST_FROG_BRAIN = !SHOW_FIRST_FROG_BRAIN;
				if (SHOW_FIRST_FROG_BRAIN) {
					button.setText("Hide first frog's brain");
					mainFrame.setSize(1320, 840);
				} else {
					button.setText("Show first frog's brain");
					mainFrame.setSize(550, 550);
				}
			}
		};
		button.addActionListener(al);
		
		mainFrame.add(button);

		mainFrame.setVisible(true);

		env.run();
	}

}

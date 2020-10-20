package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("What your name!?!");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if(name.equalsIgnoreCase("Luke Choi")) {
	JOptionPane.showMessageDialog(null,"Judging by your name, you are a evil man!! You do evil things each day! How wretched!");
	else if(name.equalsIgnoreCase("Daniel Suh")) {
		JOptionPane.showMessageDialog(null, "You are a incredible man!!!!");
	}
}

	}
}


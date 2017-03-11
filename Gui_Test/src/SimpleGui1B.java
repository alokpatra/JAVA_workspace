import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui1B implements ActionListener {
	JButton button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
		
	}
	public void go() {
		//Make a frame
		JFrame frame = new JFrame();
		//Make a button and pass the button constructor the text you want on the button
		JButton button = new JButton("click me");
		//Add Action Listener
		button.addActionListener(this);
		//the below command makes the program quit as soon as you close the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add the button to the frames's content plane
		frame.getContentPane().add(button);
		//set frame size and make visible
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked");
	}
	

}


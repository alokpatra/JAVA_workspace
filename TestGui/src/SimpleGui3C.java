import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGui3C implements ActionListener{
	JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
		
	}

	public void go() {
		// TODO Auto-generated method stub
		frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Change colors");
		button.addActionListener(this);
		button.setBackground(Color.CYAN);		
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		frame.repaint();
		
	}

}

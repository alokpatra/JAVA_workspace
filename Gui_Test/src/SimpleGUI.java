import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleGUI {
	public static void main(String[] args) {
		//Make a frame
		JFrame frame = new JFrame();
		//Make a button and pass the button constructor the text you want on the button
		JButton button = new JButton("click me");
		//the below command makes the program quit as soon as you close the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add the button to the frames's content plane
		frame.getContentPane().add(button);
		//set frame size and make visible
		frame.setSize(1200, 800);
		frame.setVisible(true);
		
		
	}
	

}

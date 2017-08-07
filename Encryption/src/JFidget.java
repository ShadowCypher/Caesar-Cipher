import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;  


public class JFidget {
	
	
	 public void Fidget(int width, int height, String color) {
		JFrame frame = new JFrame();
		ImageIcon image = new ImageIcon("/Users/harris/Downloads/download.jpeg");
        JLabel imageLabel = new JLabel(image); 
        imageLabel.setBounds(0, 0, width, height);
		
        frame.add(imageLabel);
		frame.setSize(width, height);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

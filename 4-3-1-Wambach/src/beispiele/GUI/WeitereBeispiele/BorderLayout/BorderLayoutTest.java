package beispiele.GUI.WeitereBeispiele.BorderLayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame
{
	BorderLayoutTest()
	{
		JButton[] buttons = new JButton[5];
		
		
		setSize(640, 480);
		setLayout(new BorderLayout(10,10));
		
		// 5 Buttons erzeugen
		for (int i=0; i<5; i++)
		{
			JButton button = new JButton("Button " + (i+1));
			buttons[i] = button;
		}
		
		add(buttons[0], BorderLayout.CENTER);
		add(buttons[1], BorderLayout.NORTH);
		add(buttons[2], BorderLayout.SOUTH);
		add(buttons[3], BorderLayout.EAST);
		add(buttons[4], BorderLayout.WEST);
		
		setVisible(true);
		
	}

	public static void main(String[] args)
	{
		new BorderLayoutTest();
	}

}

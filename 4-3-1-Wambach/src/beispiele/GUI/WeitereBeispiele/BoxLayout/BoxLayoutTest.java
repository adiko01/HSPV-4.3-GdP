package beispiele.GUI.WeitereBeispiele.BoxLayout;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutTest extends JFrame
{
	BoxLayoutTest()
	{
		super("BoxLayout Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		// Panel 1
		JPanel red = new JPanel();
		red.setBackground(Color.RED);
		red.setPreferredSize(new Dimension(25,25));
		add(red);
		
		add(Box.createHorizontalStrut(10));	
		
		// Panel 2
		JPanel red2 = new JPanel();
		red2.setBackground(Color.red);
		red2.setPreferredSize(new Dimension(25,25));
		add(red2);
		
		add(Box.createHorizontalGlue());
		
		// Panel 3
		JPanel red3 = new JPanel();
		red3.setBackground(Color.RED);
		red3.setPreferredSize(new Dimension(25,25));
		add(red3);
		
		
		setVisible (true);
	}
	
	public static void main (String[] args)
	{
		new BoxLayoutTest();
	}
}

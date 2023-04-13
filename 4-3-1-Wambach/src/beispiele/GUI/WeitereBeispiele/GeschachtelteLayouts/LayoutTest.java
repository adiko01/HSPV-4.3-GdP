package beispiele.GUI.WeitereBeispiele.GeschachtelteLayouts;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class LayoutTest extends JFrame
{

	public LayoutTest()
	{
		super ("Layout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* 
		 * Panel 1 mit GridLayout enthält 6 Panels
		 */
		JPanel p1 = new JPanel();
		p1.setBackground(Color.WHITE);
		p1.setLayout(new GridLayout(2, 3, 5, 5));
		
		for (int i=1; i<=6; i++)
			p1.add(new MyLayoutPanel(i));
		
		
		/*
		 * Panel 2 mit FlowLayout enthät 2 weitere Panels
		 */
		JPanel p2 = new JPanel();
		p2.setBackground(Color.WHITE);
		p2.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		p2.add(new MyLayoutPanel(7));
		p2.add(new MyLayoutPanel(8));
		
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new LayoutTest();
	}

}

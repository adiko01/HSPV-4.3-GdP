package beispiele.GUI.WeitereBeispiele.FlowLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlowLayoutTest extends JFrame
{

	public FlowLayoutTest()
	{
		super ("FlowLayoutTest");
		setSize(640,480);
		
		setLayout(new FlowLayout());
		
		JLabel l1 = new JLabel("Ein Text");
		JLabel l2 = new JLabel("Noch ein Text");
		JButton b1 = new JButton("Klick mich");
		JPanel red = new JPanel();
		red.setBackground(Color.RED);
		red.setPreferredSize(new Dimension(100,200));
		
		add(l1);
		add(l2);
		add(b1);
		add(red);
		
		//pack();
		
		setVisible(true);
	}
	

	public static void main(String[] args)
	{
		new FlowLayoutTest();
	}

}

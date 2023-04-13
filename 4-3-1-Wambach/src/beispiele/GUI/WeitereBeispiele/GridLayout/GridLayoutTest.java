package beispiele.GUI.WeitereBeispiele.GridLayout;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutTest extends JFrame{

	
	public GridLayoutTest()
	{
	
		super("GridLayoutTest");
		
		setLayout(new GridLayout(3,4));
		
		int anz=12;
		
		for (int i=0;i<anz;i++)
		{
			JPanel p = new JPanel();
			p.setBackground(new Color(0x123456<<i));
			add(p);
		}
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GridLayoutTest();
	}
}

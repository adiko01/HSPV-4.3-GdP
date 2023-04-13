package beispiele.GUI.WeitereBeispiele.GeschachtelteLayouts;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyLayoutPanel extends JPanel
{
	private int id;
	
	public MyLayoutPanel(int id)
	{
		this.id = id;
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize(new Dimension(50,50));
		setMaximumSize(new Dimension(50,50));
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString(String.valueOf(id), 5, 15);
	}
}

package beispiele.GUI.WeitereBeispiele.GridBagLayout;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel
{
	private int id;
	
	public MyPanel(int id)
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

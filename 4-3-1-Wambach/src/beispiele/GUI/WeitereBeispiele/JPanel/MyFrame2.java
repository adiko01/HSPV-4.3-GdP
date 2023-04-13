package beispiele.GUI.WeitereBeispiele.JPanel;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame
{
	public MyFrame2()
	{
		super ("JPanel-Beispiel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add (new ContentPanel());
		pack();
		setVisible(true);
	}
	
	private static class ContentPanel extends JPanel
	{
		public ContentPanel()
		{
			setBackground(Color.LIGHT_GRAY);
			setPreferredSize(new Dimension(300,200));
		}
		
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			g.setColor(Color.RED);
			g.fillRoundRect(30, 30, 240, 140, 30, 30);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Monospaced", Font.BOLD, 48));
			g.drawString("Hallo!", 65, 110);
		}
	}

	public static void main(String[] args)
	{
		new MyFrame2();
	}

}

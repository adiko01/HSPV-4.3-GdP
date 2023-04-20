package loesungen.Aufgabe27;


import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JPanel;

public class Kran extends JPanel {

	private JPanel boden = new JPanel();
	private JPanel kran = new JPanel();
	private JPanel ausleger = new JPanel();
	private JPanel haken = new JPanel();

	public Kran()
	{
		setLayout(null);
		setSize(640, 480);
		setBackground(Color.BLACK);
		
		boden.setBackground(Color.RED);
		boden.setSize(180,30);
		boden.setLocation(240, 390);
		
		
		kran.setBackground(Color.RED);
		kran.setSize(30,250);
		kran.setLocation(boden.getX() + 80, boden.getY() - kran.getHeight());
		
		
		ausleger.setBackground(Color.RED);
		ausleger.setSize(100, 30);
		ausleger.setLocation(kran.getX() - ausleger.getWidth(), kran.getY());
		
		
		haken.setBackground(Color.RED);
		haken.setSize(30, 50);
		haken.setLocation(ausleger.getX(), ausleger.getY());
		
		add(boden);
		add(kran);
		add(ausleger);
		add(haken);
		
	}
	
	public void hakenGroesseAendern(int px)
	{
		// Vergrößert den Haken nach unten um px Pixel
		int groesse = haken.getHeight();
		
		if (px < 0)
		{
			if (groesse < 20)
				return;
		}
		else if (groesse > 200)
			return;
			
		haken.setSize(haken.getWidth(), haken.getHeight() + px);
			
	}
	
	public void auslegerGroesseAendern(int px)
	{
		if (px < 0)
		{
			if (ausleger.getWidth() + px > 30)
			{
				ausleger.setSize(ausleger.getWidth()+px, ausleger.getHeight());
				ausleger.setLocation(ausleger.getX()-px, ausleger.getY());
				haken.setLocation(haken.getX()-px, haken.getY());
			}
		}
		else
		{
			if (haken.getX()-px > 30)
			{
				ausleger.setSize(ausleger.getWidth()+px, ausleger.getHeight());
				ausleger.setLocation(ausleger.getX()-px, ausleger.getY());
				haken.setLocation(haken.getX()-px, haken.getY());
			}
		}
	}
	
	public void kranBewegen(int px)
	{
		if (px < 0)
		{
			if (boden.getX() + px < 30
					||
					haken.getX() + px < 30)
				return;
		}
		else
		{
			if (boden.getX()+px + boden.getWidth() > this.getWidth() - 30)
				return;
		}
		
		// Kran bewegen
		haken.setLocation(haken.getX() + px, haken.getY());
		ausleger.setLocation(ausleger.getX() + px, ausleger.getY());
		boden.setLocation(boden.getX() + px, boden.getY());
		kran.setLocation(kran.getX() + px, kran.getY());
	}
}

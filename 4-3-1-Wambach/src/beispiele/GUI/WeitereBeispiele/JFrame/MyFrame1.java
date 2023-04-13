package beispiele.GUI.WeitereBeispiele.JFrame;



import java.awt.Cursor;

import javax.swing.JFrame;

public class MyFrame1 extends JFrame
{
	public MyFrame1()
	{
		super("Mein erstes Fenster");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setLocation(100, 100);
		this.setVisible(true);		
	}

	public static void main(String[] args)
	{
		MyFrame1 window = new MyFrame1();
		
		// Hilfsarray mit allen möglichen Cursor-Darstellungen
		int[] types = {Cursor.CROSSHAIR_CURSOR, Cursor.HAND_CURSOR, Cursor.MOVE_CURSOR,
				Cursor.TEXT_CURSOR, Cursor.WAIT_CURSOR, Cursor.DEFAULT_CURSOR};
		
		
		// Alle Cursor für jeweils 3 Sekunden darstellen
		for (int actualType : types)
		{
			// Cursor darstellen
			Cursor c = Cursor.getPredefinedCursor(actualType);
			window.setCursor(c);
			window.setTitle(c.getName());
			
			// 3 Sekunden warten
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e) {}
			
			
		}

	}

}

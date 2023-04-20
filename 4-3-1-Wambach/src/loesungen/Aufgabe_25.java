package loesungen;


import java.awt.Color;
import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aufgabe_25 extends JFrame
{
	private JPanel linksOben = new JPanel();
	private JPanel linksUnten = new JPanel();
	private JPanel rechtsOben = new JPanel();
	private JPanel rechtsUnten = new JPanel();
	
	private static TimerTask task;
	private static Timer timer;
	
	private final static int delta = 5;
	
	public Aufgabe_25 ()
	{
		// Einstellungen des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Aufgabe 25");
		setSize(550, 600);
		setLayout(null);
		
		// Panels hinzufügen
		linksOben.setSize(50,50);
		linksOben.setLocation(200,200);
		linksOben.setBackground(Color.RED);
		
		rechtsOben.setSize(50,50);
		rechtsOben.setLocation(300, 200);
		rechtsOben.setBackground(Color.RED);
		
		rechtsUnten.setSize(50,50);
		rechtsUnten.setLocation(300, 300);
		rechtsUnten.setBackground(Color.RED);
		
		linksUnten.setSize(50,50);
		linksUnten.setLocation(200, 300);
		linksUnten.setBackground(Color.RED);
		
		add(linksOben);
		add(rechtsOben);
		add(linksUnten);
		add(rechtsUnten);
		
		task = new TimerTask() {
			public void run() {
				
				if (linksOben.getX()>delta && linksOben.getY()>delta)
				linksOben.setLocation(new Point(linksOben.getX() - delta, linksOben.getY()-delta));
				
				if (rechtsOben.getX()<500 && rechtsOben.getY()>delta)
				rechtsOben.setLocation(new Point(rechtsOben.getX()+delta, rechtsOben.getY()-delta));
				
				if (linksUnten.getX()>delta && linksUnten.getY()<550)
				linksUnten.setLocation(new Point(linksUnten.getX()-delta, linksUnten.getY()+delta));
				
				if (rechtsUnten.getX()<500 && rechtsUnten.getY()<550)
				rechtsUnten.setLocation(new Point(rechtsUnten.getX()+delta, rechtsUnten.getY()+delta));
			}
		};
		
		timer = new Timer();
		timer.scheduleAtFixedRate(task, 0, 250);
		
	
		
		// Fenster anzeigen
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Aufgabe_25 f = new Aufgabe_25();
		

	}
}

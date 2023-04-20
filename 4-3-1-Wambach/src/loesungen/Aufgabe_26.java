package loesungen;



import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aufgabe_26 extends JFrame
{
	private JPanel linksOben = new JPanel();
	private JPanel linksUnten = new JPanel();
	private JPanel rechtsOben = new JPanel();
	private JPanel rechtsUnten = new JPanel();
	
	private static TimerTask task;
	private static Timer timer;
	
	private final static int delta = 5;
	
	private static boolean isRunning = true;
	
	public Aufgabe_26 ()
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
		
		addKeyListener(new MyKeyListener());
		addMouseListener(new MyMouseListener());
		
		// Fenster anzeigen
		setVisible(true);
	}

	public static void main(String[] args)
	{
		Aufgabe_26 f = new Aufgabe_26();
		
		task = new TimerTask() {
			public void run() {
				
				if (!isRunning)
					return;
				
				if (f.linksOben.getX()>delta && f.linksOben.getY()>delta)
				f.linksOben.setLocation(new Point(f.linksOben.getX() - delta, f.linksOben.getY()-delta));
				
				if (f.rechtsOben.getX()<500 && f.rechtsOben.getY()>delta)
				f.rechtsOben.setLocation(new Point(f.rechtsOben.getX()+delta, f.rechtsOben.getY()-delta));
				
				if (f.linksUnten.getX()>delta && f.linksUnten.getY()<550)
				f.linksUnten.setLocation(new Point(f.linksUnten.getX()-delta, f.linksUnten.getY()+delta));
				
				if (f.rechtsUnten.getX()<500 && f.rechtsUnten.getY()<550)
				f.rechtsUnten.setLocation(new Point(f.rechtsUnten.getX()+delta, f.rechtsUnten.getY()+delta));
			}
		};
		
		timer = new Timer();
		timer.scheduleAtFixedRate(task, 0, 250);
	}
	
	private class MyKeyListener extends KeyAdapter
	{
		@Override
		public void keyPressed(KeyEvent e)
		{
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE)
			{
				isRunning = !isRunning;
			}
		}
	}
	
	private class MyMouseListener extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			isRunning = !isRunning;
		}
	}

}

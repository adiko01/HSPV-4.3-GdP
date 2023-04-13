package beispiele.GUI.WeitereBeispiele.Adapterklassen;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class Fenster extends JFrame
{

	private long startZeit;
	
	public Fenster() {
		super("Ereignisbehandlung");
		
		addKeyListener(new MyKeyListener());
		addWindowListener(new MyWindowListener());
		
		setSize(400, 200);
		setVisible(true);
		
		startZeit = System.currentTimeMillis();
		System.out.println("Gestartet: " + startZeit);
		
	}
	
	public static void main(String[] args)
	{
		new Fenster();
	}
	
	private void programmBeenden() {
		System.out.println("Programm wird beendet.");
		long ende = System.currentTimeMillis();
		System.out.println("Laufzeit in ms: " + (ende - this.startZeit));
		System.exit(0);
	}
	
	private class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				programmBeenden();
			}
		}
	}
	
	private class MyWindowListener extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent w) {
			programmBeenden();
		}
		
	}
	
	

}

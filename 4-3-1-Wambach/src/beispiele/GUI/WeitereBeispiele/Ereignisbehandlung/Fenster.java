package beispiele.GUI.WeitereBeispiele.Ereignisbehandlung;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;



public class Fenster extends JFrame implements KeyListener, WindowListener
{
	private long startZeit;
	
	public Fenster() {
		super("Ereignisbehandlung");
		
		addKeyListener(this);
		addWindowListener(this);
		
		setSize(400, 200);
		setVisible(true);
		startZeit = System.currentTimeMillis();
		System.out.println("Gestartet: " + startZeit);
		
	}
	


	
	public static void main(String[] args)
	{
		new JSplitPaneBsp();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		long ende = System.currentTimeMillis();
		System.out.println("Laufzeit in ms: " + (ende - this.startZeit));
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			this.dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}

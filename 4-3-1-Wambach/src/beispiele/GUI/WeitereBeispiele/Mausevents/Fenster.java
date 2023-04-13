package beispiele.GUI.WeitereBeispiele.Mausevents;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Fenster extends JFrame 
{
	private JLabel ausgabe = new JLabel("Position");
	
	public Fenster() {
		super("Maus-Event");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setLayout(null);
		
		ausgabe.setLocation(10, 10);
		ausgabe.setSize(400,100);
		add(ausgabe);
		
		addMouseListener(new MyMouseListener());
		
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new Fenster();
	}
	
	private class MyMouseListener implements MouseListener, MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			ausgabe.setText("Mausposition: " + e.getPoint().toString());
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	
}

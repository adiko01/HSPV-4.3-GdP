package loesungen.Aufgabe27;


import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aufgabe27 extends JFrame
{
	private Kran kran = new Kran();
	
	public Aufgabe27()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640,480);
		setTitle("Aufgabe 27");
		setLayout(null);
		
		
		// Wenn das Fenster in der Größe verändert wird
		addComponentListener(new ComponentAdapter() {
		    public void componentResized(ComponentEvent componentEvent) {
		        // Das Panel kran in der Größe anpassen
		    	kran.setSize(getWidth(), getHeight());
		    }
		});
		
		// Alle Buttons implementieren
		
		JButton hakenAusfahren = new JButton("Haken ausfahren");
		hakenAusfahren.setSize(150, 30);
		hakenAusfahren.setLocation(10, 10);
		hakenAusfahren.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Aufgabe27.this.kran.hakenGroesseAendern(10);
			}
			
		});
		
		JButton hakenEinfahren = new JButton("Haken einfahren");
		hakenEinfahren.setSize(150, 30);
		hakenEinfahren.setLocation(10, 40);
		hakenEinfahren.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Aufgabe27.this.kran.hakenGroesseAendern(-10);			
			}
			
		});
		
		JButton auslegerAusfahren = new JButton("Ausleger ausfahren");
		auslegerAusfahren.setSize(150, 30);
		auslegerAusfahren.setLocation(10, 70);
		auslegerAusfahren.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Aufgabe27.this.kran.auslegerGroesseAendern(10);			
			}
			
		});
		
		JButton auslegerEinfahren = new JButton("Ausleger einfahren");
		auslegerEinfahren.setSize(150, 30);
		auslegerEinfahren.setLocation(10, 100);
		auslegerEinfahren.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Aufgabe27.this.kran.auslegerGroesseAendern(-10);			
			}
			
		});
		
		JButton kranNachLinks = new JButton("Kran nach Links");
		kranNachLinks.setSize(150, 30);
		kranNachLinks.setLocation(150, 10);
		kranNachLinks.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Aufgabe27.this.kran.kranBewegen(-10);			
			}
			
		});
		
		JButton kranNachRechts = new JButton("Kran nach Rechts");
		kranNachRechts.setSize(150, 30);
		kranNachRechts.setLocation(150, 40);
		kranNachRechts.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Aufgabe27.this.kran.kranBewegen(10);			
			}
			
		});
		
		add(hakenAusfahren);
		add(hakenEinfahren);
		add(auslegerAusfahren);
		add(auslegerEinfahren);
		add(kranNachLinks);
		add(kranNachRechts);
		
		
		add(kran);
		setVisible(true);		
	}

	public static void main(String[] args)
	{
		new Aufgabe27();
	}

	

}

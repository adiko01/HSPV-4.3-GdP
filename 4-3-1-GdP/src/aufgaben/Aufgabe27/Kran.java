package aufgaben.Aufgabe27;

import java.awt.Color;
import java.awt.Point;

import javax.swing.JPanel;

public class Kran extends JPanel {
	// Konstanten
	private final static int MAX_AUSLEGER = 1000;
	private final static int MAX_HARKEN = 1000;
	private final static int MAX_KRAN_POS = 410;
	
	// JPanels
	JPanel Boden;		//Kranboden
	JPanel Hoehe;		//Höhe des Krans
	JPanel Ausleger;	//Ausleger
	JPanel Haken;		//Haken
	
	//Arry aller Kran Panels
	JPanel[] panels;
	
	Kran() {
		this.setLayout(null);
		this.setBackground(Color.BLUE); //TODO Mache Schwarz
		
		
		//Kran Boden
		Boden = new JPanel();
		Boden.setBackground(Color.RED);
		Boden.setBounds(110, 260, 200, 50);
		this.add(Boden);
		
		//Kran Höhe
		Hoehe = new JPanel();
		Hoehe.setBackground(Color.RED);
		Hoehe.setLocation(185, 60);
		Hoehe.setSize(50, 200);
		this.add(Hoehe);
		
		//Kran Ausleger
		Ausleger = new JPanel();
		Ausleger.setBackground(Color.RED);
		Ausleger.setLocation(85, 60);
		Ausleger.setSize(150, 50);
		this.add(Ausleger);
		
		//Kran Haken
		Haken = new JPanel();
		Haken.setBackground(Color.RED);
		Haken.setLocation(85, 60);
		Haken.setSize(25, 100);
		this.add(Haken);
		
		//Arry aller Kran Panels
		panels = new JPanel[4];
		panels[0] = Boden;
		panels[1] = Hoehe;
		panels[2] = Ausleger;
		panels[3] = Haken;
	}
	
	public void rechts() {
		moveKran(10);
	}
	
	public void links() {
		moveKran(-10);
	}
	
	public void moveKran (int menge) {
		if (Boden.getLocation().x + menge < MAX_KRAN_POS && Haken.getLocation().x + menge > 10) {
			for (JPanel panel : panels) {
				Point pos = panel.getLocation();
				pos.x = pos.x + menge;
				panel.setLocation(pos);
			}
		}
	}
}

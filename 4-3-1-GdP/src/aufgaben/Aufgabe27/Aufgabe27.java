package aufgaben.Aufgabe27;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aufgabe27 extends JFrame{
	Aufgabe27 () {
		//Passe Frame an
		this.setTitle("Aufgabe 27");
		this.setSize(640, 480);
		
		// Erstelle Hintergrund
		JPanel hintergrund = new JPanel();
		hintergrund.setBackground(Color.BLACK);
		hintergrund.setLayout(null);
		this.add(hintergrund);
		
		// JLabel mit Hinweis Text
		JLabel lbl_info = new JLabel("<html><body><center>Aufgabe 27<br>by Adrian Kolar<br>MS I 22/01</center></body></html>");
		lbl_info.setBounds(400, 10, 100, 100);
		lbl_info.setForeground(new Color(255, 255, 255));
		hintergrund.add(lbl_info);
		
		// Erstelle Buttons
		JButton btn_HarkenAusfahren = new JButton("Harken ausfahren");
		JButton btn_HarkenEinfahren = new JButton("Harken einfahren");
		JButton btn_AuslegerAusfahren = new JButton("Ausleger ausfahren");
		JButton btn_AuslegerEinfahren = new JButton("Ausleger einfahren");
		JButton btn_KranLinks = new JButton("Kran links");
		JButton btn_KranRechts = new JButton("Kran rechts");

		// Erstelle Kran
		Kran kran = new Kran();
		
		// Füge Buttons hinzu
		btn_HarkenAusfahren.setBounds(10, 10 , 150, 20);
		hintergrund.add(btn_HarkenAusfahren);
		
		btn_HarkenEinfahren.setBounds(10, 40 , 150, 20);
		hintergrund.add(btn_HarkenEinfahren);
		
		btn_AuslegerAusfahren.setBounds(10, 70 , 150, 20);
		hintergrund.add(btn_AuslegerAusfahren);
		
		btn_AuslegerEinfahren.setBounds(10, 100 , 150, 20);
		hintergrund.add(btn_AuslegerEinfahren);
		
		btn_KranLinks.setBounds(180, 10 , 150, 20);
		hintergrund.add(btn_KranLinks);
		
		btn_KranRechts.setBounds(180, 40 , 150, 20);
		hintergrund.add(btn_KranRechts);
		
		// Füge Kran hinzu
		kran.setLocation(10, 125);
		kran.setSize(610, 310);
		hintergrund.add(kran);
		
		
		//Erstelle Button Funktionen
		btn_HarkenAusfahren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kran.HakenAusfahren();
			}
		});
		
		btn_HarkenEinfahren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kran.HakenEinfahren();
			}
		});
		
		btn_AuslegerAusfahren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kran.AuslegerAusfahren();
			}
		});
		
		btn_AuslegerEinfahren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kran.AuslegerEinfahren();
			}
		});
		
		btn_KranLinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kran.links();
			}
		});
		
		btn_KranRechts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kran.rechts();
			}
		});
	}
	
	
	public static void main(String[] args) {	
		Aufgabe27 me = new Aufgabe27();
		me.setVisible(true);
	}
}

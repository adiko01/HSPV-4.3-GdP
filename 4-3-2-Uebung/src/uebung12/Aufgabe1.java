package uebung12;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Aufgabe1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aufgabe1 frame = new Aufgabe1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Aufgabe1() {
		setTitle("Übung 12 - Aufgabe 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Panels
		JPanel[] panels = new JPanel[49];
		for (int i = 0; i < 49 ; i++ ) {
			//Erstelle das Panel
			panels[i] = new JPanel ();
			
			//Hintergrundfarbe der Panels
			panels[i].setBackground(Color.WHITE);
			
			//Rahmen der Panels
			panels[i].setBorder(BorderFactory.createLineBorder(Color.black));
			
			//Position Festlegen
			//Festlegen der Spalte
			int x = (i % 7) * 50;
			//Festlegen der Zeile
			int y = (i / 7) * 50;
			
			//Setze die Maße des Panels
			panels[i].setBounds(x, y, 50, 50);
			
			//Füge das Panel hinzu
			contentPane.add(panels[i]);
		}
		
		JButton btn_Farben = new JButton("Farben");
		btn_Farben.addActionListener(new ActionListener() {
			Random zufall = new Random();
			public void actionPerformed(ActionEvent e) {
				for (int i = 0 ; i < 49 ; i++) {
					int r = zufall.nextInt(255);
					int g = zufall.nextInt(255);
					int b = zufall.nextInt(255);
					panels[i].setBackground(new Color(r,g,b));
				}
			}
		});
		btn_Farben.setBounds(10, 385, 130, 21);
		contentPane.add(btn_Farben);
		
		JButton btn_Zuruecksetzen = new JButton("Zurücksetzen");
		btn_Zuruecksetzen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0 ; i < 49 ; i++) {
					panels[i].setBackground(Color.WHITE);
				}
			}
		});
		btn_Zuruecksetzen.setBounds(216, 385, 130, 21);
		contentPane.add(btn_Zuruecksetzen);
	}
}

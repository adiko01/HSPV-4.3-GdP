package aufgaben;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Aufgabe_28 extends JFrame {
	/*	Aufgabe 28:
	 * Erstellen Sie ein Fenster, in dem mittels des GridLayout 20 rote Panels in
	 * einer 4x5 Matrix angezeigt werden, die jeweils einen Abstand von 15 Pixel
	 * zueinander haben.
	 * Die Möglichkeiten von GridLayout entnehmen Sie bitte der Java API.
	 */
	
	public Aufgabe_28() {
		//Passe Frame an
		this.setTitle("Aufgabe 28");
		this.setSize(640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		
		//JPanel mit Inhalt
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 5, 15, 15));
		
		//20 Panels in Rot
		JPanel[] panels = new JPanel[20];
		for (JPanel panel : panels) {
			panel = new JPanel();
			panel.setBackground(Color.RED);
			contentPane.add(panel);
		}
	}
	
	public static void main (String[] args) {
		Aufgabe_28 frame = new Aufgabe_28();
		frame.setVisible(true);
	}
	
	
}
